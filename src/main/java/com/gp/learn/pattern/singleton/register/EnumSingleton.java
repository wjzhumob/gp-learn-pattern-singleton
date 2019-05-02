package com.gp.learn.pattern.singleton.register;

/**
 * @author wjzhu
 * @createDate 2019-05-02 16:01
 */
public enum EnumSingleton {
    INSTANCE;

    private Object data;
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
