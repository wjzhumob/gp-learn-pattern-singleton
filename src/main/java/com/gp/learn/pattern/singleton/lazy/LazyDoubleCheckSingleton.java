package com.gp.learn.pattern.singleton.lazy;

/**
 * @author wjzhu
 * @createDate 2019-05-02 12:00
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton(){};

    public static LazyDoubleCheckSingleton getInstance(){
        if(lazyDoubleCheckSingleton!=null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazyDoubleCheckSingleton!=null){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }

        return lazyDoubleCheckSingleton;
    }
}
