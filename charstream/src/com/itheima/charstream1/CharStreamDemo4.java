package com.itheima.charstream1;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo4 {
    public static void main(String[] args) throws IOException {
         FileWriter fw = new FileWriter("charstream/b.txt");
         // 必须保证父级路径存在，否则抛出异常
        // FileWriter fw = new FileWriter("charstream/aaa/b.txt");

        // fw.write("黑马程序员");
        fw.write(97);

        fw.close();
    }
}
