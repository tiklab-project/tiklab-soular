package io.tiklab.eas.updatesql.service;

import io.tiklab.core.exception.ApplicationException;
import org.apache.commons.lang3.StringEscapeUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UpdateSqlFile {

    private static  String[] updateString = new String[]{};

    private static String[] skipString = new String[]{};

    private static String[] continueString = new String[]{};

    private static Map<String,String> replaceMap = new HashMap<>();


    private static  String filePath = "D://桌面//";

    private static void updateString (){
        updateString =  new String[]{
                "`",
                "CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci",
                "ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic",
                "USING BTREE"
        };
        skipString = new String[]{
                "pcs_op_log_template",
                "pcs_op_log"
        };

        continueString = new String[]{
                "SET NAMES utf8mb4;",
                "SET FOREIGN_KEY_CHECKS = 0;",
                "SET FOREIGN_KEY_CHECKS = 1;"
        };

        replaceMap.put("datetime","TIMESTAMP");
        replaceMap.put("longtext","TEXT");

    }


    public static void main(String[] args) {

        String[] dbString = new String[]{
                // "tiklab_eas_00000000.sql",
                // "tiklab_eas_a3jsr93o.sql",
                // "tiklab_eas_c712x0xk.sql",
                // "tiklab_eas_grd12j4g.sql",
                // "tiklab_eas_ic9tganj.sql",
                // "tiklab_eas_l1rrslxx.sql",
                // "tiklab_eas_otk11j64.sql",
                // "tiklab_eas_p7mei027.sql",
                // "tiklab_eas_pi9cdtjs.sql",
                "tiklab_matflow_00000000.sql",
                "tiklab_matflow_c712x0xk.sql",
                "tiklab_matflow_grd12j4g.sql",
                "tiklab_matflow_l1rrslxx.sql",
                "tiklab_matflow_otk11j64.sql",
                "tiklab_matflow_p7mei027.sql",
                "tiklab_matflow_pi9cdtjs.sql"
        };

        updateString();

        for (String s : dbString) {

            readFile(s);
            writerFile(replaceCreate(),s);
            writerFile(replaceInsert(),s);
            writerFile(commentList,s);
        }



    }


    private static List<String> insertString = new ArrayList<>();

    private static List<String> createString = new ArrayList<>();


    public static void readFile(String fileName){
        insertString = new ArrayList<>();
        createString =new ArrayList<>();
        fileName = filePath + fileName;

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);

            StringBuilder createShow = new StringBuilder();

            boolean b = false;

            String line = reader.readLine();
            while (line != null) {
                boolean insertInto = line.startsWith("INSERT INTO");
                if (insertInto){
                    insertString.add(line);
                    line = reader.readLine();
                    continue;
                }

                boolean createTable = line.startsWith("CREATE TABLE");
                if (createTable){
                    b = true;
                }

                if (!createTable && !b){
                    line = reader.readLine();
                    continue;
                }

                createShow.append(line).append("\n");

                boolean endsedWith = line.endsWith(" ROW_FORMAT = Dynamic;");

                if (endsedWith){
                    b = false;
                    createString.add(String.valueOf(createShow));
                    createShow = new StringBuilder();
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
           throw new ApplicationException(e);
        }
    }

    private static  List<String> commentList = new ArrayList<>();

    private static List<String> replaceCreate(){
        commentList = new ArrayList<>();
        List<String> list = new ArrayList<>();
        String comment = null;
        String show = null;
        String showName = null;

        for (String line : createString) {

            for (String s : updateString) {
                if (line.contains(s)){
                    line = line.replace(s,"");
                }
            }

            // 表名称
            int createTable = line.indexOf("(");
            show = line.substring(12,createTable-2);
            System.out.println(show);

            String[] split = line.split("\n");
            for (String s : split) {

                // 获取属性名称
                String[] split1 = s.split(" ");
                if (split1.length > 2){
                    if (split1[1].equals("")){
                        showName = split1[2];
                    }
                }

                if (!s.contains("COMMENT")){
                   continue;
                }

                int indexOf = s.indexOf("COMMENT");
                comment = s.substring(indexOf,s.length()-1);
                line = line.replace(comment,"");

                String s1 = comment.replace("COMMENT", "");

                String commentSql = "COMMENT ON COLUMN "+" "+ show + "."+showName + " IS"+" "+s1+";";
                showName = null;
                commentList.add(commentSql);
            }

            if (line.contains("datetime")){
                line = line.replace("datetime","TIMESTAMP");
            }

            if (line.contains("longtext")){
                line = line.replace("longtext","TEXT");
            }

            if (line.startsWith("  user varchar(32)  NOT NULL ")){
                line = line.replace("user varchar(32)","\"user\" varchar(32)");
            }

            list.add(line);
        }
        return list;
    }


    private static List<String> replaceInsert(){
        List<String> list = new ArrayList<>();
        for (String line : insertString) {
            if (line.contains("`")){
                line = line.replace("`","");
            }
            list.add(removeEscape(line));
        }

        return list;
    }

    public static void writerFile(List<String> list,String fileName){
        fileName = filePath +"up_" + fileName;
        try {
            FileWriter fileWriter = new FileWriter(fileName,true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            for (String line : list) {
                writer.write(line);
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            throw new ApplicationException(e);
        }
    }

    private static String removeEscape(String s){
        // String s1 = s.replaceAll("\\\"", "\"");
        return  StringEscapeUtils.unescapeJava(s);
    }




}
