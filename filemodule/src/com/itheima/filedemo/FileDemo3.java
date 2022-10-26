package com.itheima.filedemo;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        // public boolean createNewFile() 创建一个新的空的文件
                // 注意点：
                    // 1、如果文件存在，那么创建失败，返回false
                    // 2、如果文件不存在，那么创建成功，返回true
                    // 3、CreateNewFile方法不管调用者有没有后缀名，只能创建文件
        // public boolean mkdir() 创建一个单级文件夹
                // 注意点：
                    // 1、只能创建单级文件夹，不能创建多级文件夹
                    // 2、不管调用者有没有后缀名，只能创建单级文件夹
        // public boolean mkdirs() 创建一个多级文件夹
                // 注意点：
                    // 1、可以创建单级文件夹，也可以创建多级文件夹
                    // 2、不管调用者有没有后缀名，只能创建文件夹
        // 疑问：
            // 既然mkdirs能创建单级，也能创建多级，那么mkdir还有什么用？是的，我们一般使用mkdirs()


        // method1();
        // method2();
        method3();

    }

    private static void method3() {
        File file = new File("/Users/kris/aaa/bbb/ccc/ddd/fff");
        boolean result = file.mkdirs();
        System.out.println(result);
    }

    private static void method2() {
        // File file = new File("/Users/kris/aaa/bbb/ccc");
        // File file = new File("/Users/kris/aaa/");
        File file = new File("/Users/kris/aaa/bbb.txt");
        boolean result = file.mkdir();
        System.out.println(result);
    }

    private static void method1() throws IOException {
        // File file1 = new File("/Users/kris/Work/Study/Java/Heima/AdvancedCode/a.txt");
        File file1 = new File("/Users/kris/Work/Study/Java/Heima/AdvancedCode/aaa");
        boolean newFile = file1.createNewFile();
        System.out.println(newFile);
    }

}
