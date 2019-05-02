package com.gp.learn.pattern.singleton;

import com.gp.learn.pattern.singleton.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;

/**
 * @author wjzhu
 * @createDate 2019-05-02 12:21
 */
public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {
        try {
            Class clazz = LazyInnerClassSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            Object o1 = c.newInstance();
            Object o2 = c.newInstance();

            System.out.println(o1 == o2);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
