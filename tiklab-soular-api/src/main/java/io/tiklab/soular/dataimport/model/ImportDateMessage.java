package io.tiklab.soular.dataimport.model;

/**
 * 获取数据导入状态
 * @author admin
 */
public class ImportDateMessage {

    // 状态
    private Boolean state;

    // 应用
    private ImportDatabase database;

    // 进度
    private int speed;

    private String message;


    public ImportDateMessage() {
    }

    public ImportDateMessage(Boolean state) {
        this.state = state;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public ImportDatabase getDatabase() {
        return database;
    }

    public void setDatabase(ImportDatabase database) {
        this.database = database;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
