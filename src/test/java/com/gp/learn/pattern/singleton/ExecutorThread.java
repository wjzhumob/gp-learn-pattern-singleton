package com.gp.learn.pattern.singleton;

import com.gp.learn.pattern.singleton.lazy.LazySimpleSingleton;

/**
 * @author wjzhu
 * @createDate 2019-05-02 11:19
 */
public class ExecutorThread implements Runnable{


    @Override
    public void run() {
        LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+lazySimpleSingleton);
    }
}
