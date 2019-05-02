package com.gp.learn.pattern.singleton.threadlocal;

/**
 * @author wjzhu
 * @createDate 2019-05-02 17:22
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> t = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton(){};

    public static ThreadLocalSingleton getInstance(){
        return t.get();
    }
}
