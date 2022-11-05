package com.itheima.charstream1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo10 {
    public static void main(String[] args) throws IOException {
        // 字符缓冲输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("charstream/a.txt"));

        // 写出数据
        // 实际写出的是97对应的字符a
        bw.write(97);
        bw.write("\n");

        // 实际写出的是97 - 108 对应的字符 abcdef...
        char [] chars = {97,98,99,100,101,103,108,6777};
        bw.write(chars);
        bw.write("\n");

        // 实际写出的是abc
        bw.write(chars,0,3);
        bw.write("\n");

        // 会把字符串的内容原样写出
        bw.write("黑马程序员");
        bw.write("\n");

        // 会把字符串的一部分写出 abcde
        String line = "abcdefg";
        bw.write(line,0,5);
        bw.write("\n");

        bw.flush();
        bw.close();
    }
}
