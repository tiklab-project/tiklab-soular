import com.tiklab.eas.stater.EasEmbedUtil;
import com.tiklab.mysql.starter.MysqlConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * 该类负责启动内嵌应用
 */

@Configuration
@PropertySource(value = "classpath:application-${env:dev}.properties")
public class EnableConfig {

    @Autowired
    Environment environment;

    private static final Logger logger = LoggerFactory.getLogger(EnableConfig.class);

    //启动内嵌mysql
    @Bean
    public void startMysql() throws IOException, InterruptedException {

        String mysqlType = environment.getProperty("mysql.embbed.enable");
        String mysqlPort = environment.getProperty("mysql.server.port");

        if (mysqlType == null || mysqlType.equals("false")) {
            return;
        }

        if (mysqlPort != null && getPort(Integer.parseInt(mysqlPort)) == 0) {
            throw new IOException("存在已启动的数据库或数据库配置端口错误，请更换端口启动或更换主机启动");
        }

        MysqlConfig mysqlConfig = new MysqlConfig();
        String mysqlName = environment.getProperty("mysql.name");

        Process process = mysqlConfig.startMysql(mysqlName);

        //执行启动脚本错误
        if (process == null) {
            throw new IOException("MYSQL启动错误。");
        }
        Thread.sleep(10000);
        logger.info("MYSQL启动完成");
    }

    //启动内嵌EAS
    @Bean
    public void startEas() throws IOException {

        String easPort = environment.getProperty("eas.server.port");
        Boolean easType = Boolean.parseBoolean(environment.getProperty("eas.embbed.enable"));

        if (!easType) {
            return;
        }

        if (easPort != null && getPort(Integer.parseInt(easPort)) == 0) {
            throw new IOException("存在已启动的EAS，请更换端口启动或更换主机启动");
        }

        //获取环境变量
        EasEmbedUtil easEmbedUtil = new EasEmbedUtil();
        String url = environment.getProperty("jdbc.url");
        String mysqlName = environment.getProperty("mysql.name");
        String username = environment.getProperty("jdbc.username");
        String password = environment.getProperty("jdbc.password");
        String javaHome = System.getProperty("user.dir");

        //指定jdbc信息
        if (url != null && mysqlName != null) {
            url = url.replaceAll(mysqlName, "tiklab_eas");
            url = url.split("\\?")[0];
        }
        //指定jdk地址
        if (javaHome != null) {
            javaHome = new File(javaHome).getParent() + "/jdk-16.0.2";
        }

        Process process = easEmbedUtil.startShellEasProcess("2", url, username, password, javaHome, easPort);

        if (process == null) {
            throw new IOException("EAS启动错误。");
        }

        //输出执行过程
        InputStream inputStream = process.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        String s;
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        while ((s = bufferedReader.readLine()) != null) {
            logger.info("EAS ：" + s);
        }
        inputStreamReader.close();
        bufferedReader.close();
        logger.info("EAS启动完成");
    }

    public Integer getPort(int port) {
        String host = "localhost";
        try {
            new Socket(host, port);
            return 0;
        } catch (IOException e) {
            return 1;
        }
    }
}