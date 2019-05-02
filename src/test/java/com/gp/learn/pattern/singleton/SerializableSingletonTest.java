package com.gp.learn.pattern.singleton;

import com.gp.learn.pattern.singleton.serializable.SerializableSingleton;

import java.io.*;

/**
 * @author wjzhu
 * @createDate 2019-05-02 15:37
 */
public class SerializableSingletonTest {
    public static void main(String[] args) {
        SerializableSingleton s1 = null;
        SerializableSingleton s2 = SerializableSingleton.getInstance();
        try {
            FileOutputStream fos = new FileOutputStream("serializable.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("serializable.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (SerializableSingleton)ois.readObject();
            ois.close();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
