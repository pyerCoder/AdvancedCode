package com.itheima.convertedio;

import java.io.*;

public class ConvertedDemo4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("otheriomodule/a.txt"));

        User o = (User) ois.readObject();
        System.out.println(o.getPassword());
        System.out.println(o); // password = 'null' 和视频不符，怎么处理？
        ois.close();

    }
}
