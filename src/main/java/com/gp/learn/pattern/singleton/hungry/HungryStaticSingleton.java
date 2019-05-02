package com.gp.learn.pattern.singleton.hungry;

/**
 * @author wjzhu
 * @createDate 2019-05-02 10:52
 */
public class HungryStaticSingleton {


    private static final HungryStaticSingleton hungryStaticSingleton;

    private HungryStaticSingleton(){
    };
    static{
        hungryStaticSingleton = new HungryStaticSingleton();
    }


    public static HungryStaticSingleton getInstance(){
        return hungryStaticSingleton;
    }
}
