package com.gp.learn.pattern.singleton;

import com.gp.learn.pattern.singleton.hungry.HungrySingleton;
import com.gp.learn.pattern.singleton.hungry.HungryStaticSingleton;

/**
 * @author wjzhu
 * @createDate 2019-05-02 11:02
 */
public class HungrySingletonTest {
    public static void main(String[] args) {
        HungryStaticSingleton.getInstance();
    }
}
