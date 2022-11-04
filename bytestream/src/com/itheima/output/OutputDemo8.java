package com.itheima.output;

import java.io.FileInputStream;
import java.io.IOException;

public class OutputDemo8 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("bytestream/a.txt");

        // 文件中多个字节我怎么办
        int b;
        while ((b= fis.read())!=-1) {
            System.out.println((char) b);
        }

        fis.close();
    }
}
