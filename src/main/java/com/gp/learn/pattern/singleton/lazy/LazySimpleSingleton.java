package com.gp.learn.pattern.singleton.lazy;

/**
 * @author wjzhu
 * @createDate 2019-05-02 11:13
 */
public class LazySimpleSingleton {
    private static LazySimpleSingleton lazy =null;

    private LazySimpleSingleton(){};

    public synchronized static LazySimpleSingleton getInstance(){
        if(lazy==null){
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }
}
