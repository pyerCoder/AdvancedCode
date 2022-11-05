package com.itheima.charstream1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo12 {
    public static void main(String[] args) throws IOException {
        // 字符缓冲流的特有功能
        // 字符缓冲流BufferedReader：readLine读一整行

        // 创建对象
        BufferedReader br = new BufferedReader(new FileReader("charstream/a.txt"));


        // 读取数据
        String line1 = br.readLine();
        String line2 = br.readLine();
        String line3 = br.readLine();
        // 在之前，如果读不到数据，返回-1
        // 但是 readLine 如果读不到数据返回 null
        String line4 = br.readLine();
        String line5 = br.readLine();

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);

        // 释放资源
        br.close();

    }
}
