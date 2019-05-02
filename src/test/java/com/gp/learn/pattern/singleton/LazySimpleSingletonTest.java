package com.gp.learn.pattern.singleton;

/**
 * @author wjzhu
 * @createDate 2019-05-02 11:23
 */
public class LazySimpleSingletonTest {
    public static void main(String[] args) {
        Thread t0 = new Thread(new ExecutorThread());
        Thread t1 = new Thread(new ExecutorThread());

        t0.start();
        t1.start();
        System.out.println("End");
    }
}
