package com.gp.learn.pattern.singleton.serializable;

import java.io.Serializable;

/**
 * @author wjzhu
 * @createDate 2019-05-02 15:35
 */
public class SerializableSingleton implements Serializable{

    private static final SerializableSingleton serializableSingleton = new SerializableSingleton();

    private SerializableSingleton(){};

    public static SerializableSingleton getInstance(){
        return serializableSingleton;
    }

    private Object readResolve(){
        return serializableSingleton;
    }
}
