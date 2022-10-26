package com.itheima.filedemo;

import java.io.File;

public class FileDemo6 {
    public static void main(String[] args) {
        File file = new File("/Users/kris/Work/Study/Java/Heima/AdvancedCode");
        File[] files = file.listFiles(); // 返回的是一个File类型的数组
        for (File path : files) {
            System.out.println(path);
        }

        // 进入文件夹，获取这个文件夹里面所有的文件和文件夹的File对象，并将这个File对象都放在一个数组中返回
        // 包括隐藏文件和隐藏文件夹都可以获取

        // 注意事项：
            // 1、当调用者是一个文件时
            // 2、当调用者是一个空文件夹时
            // 3、当调用者是一个有内容的文件夹时
            // 4、当调用者是一个有权限才能进入的文件夹时
    }
}
