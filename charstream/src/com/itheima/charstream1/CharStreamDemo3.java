package com.itheima.charstream1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo3 {
    public static void main(String[] args) throws IOException {

        // 创建字符输出流的对象
        // FileWriter fw = new FileWriter(new File("charstream/a.txt"));
        FileWriter fw = new FileWriter("charstream/a.txt");

        // method1(fw);
        // method2(fw);
        // method3(fw);
        // method4(fw);
        method5(fw);


    }

    private static void method5(FileWriter fw) throws IOException {
        // void write (String str, int off, int len) 写一个字符串的一部分
        fw.write("Hello World!",0,5);
        fw.close();
    }

    private static void method4(FileWriter fw) throws IOException {
        // void write (String str) 写一个字符串
        fw.write("Hello World!");
        fw.close();
    }

    private static void method3(FileWriter fw) throws IOException {
        // void write (char[] cbuf, int off, int len) 写入字符数组的一部分
        char[] chars = {97, 98, 99, 100, 101};
        fw.write(chars,0,3);
        // 释放资源
        fw.close();
    }

    private static void method2(FileWriter fw) throws IOException {
        // void write (char[] cbuf) 写入一个字符数组
        char[] chars = {97, 98, 99, 100, 101};
        fw.write(chars);
        // 不关流的话，数据可能还在内存中，没有落盘，所以看不到相关结果
        // 释放资源
        fw.close();
    }

    private static void method1(FileWriter fw) throws IOException {
        // 写出数据
        // void write (int c) 写一个字符
        fw.write(97);
        fw.write(98);
        fw.write(99);
        // 释放资源
        fw.close();
    }
}
