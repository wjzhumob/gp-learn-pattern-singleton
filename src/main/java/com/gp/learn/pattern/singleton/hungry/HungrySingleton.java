package com.gp.learn.pattern.singleton.hungry;

/**
 * @author wjzhu
 * @createDate 2019-05-02 10:39
 */
public class HungrySingleton {


    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){};

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

}
