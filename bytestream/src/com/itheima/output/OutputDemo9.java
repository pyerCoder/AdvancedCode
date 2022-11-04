package com.itheima.output;

import java.io.*;

public class OutputDemo9 {
    public static void main(String[] args) throws IOException {
        // 创建了字节输入流，准备读数据
        FileInputStream fis = new FileInputStream("bytestream/a.avi");
        // 创建了字节输出流，准备写数据
        FileOutputStream fos = new FileOutputStream("bytestream/a_copy.avi");

        // 文件中多个字节我怎么办
        int b;
        while ((b= fis.read())!=-1) {
            fos.write(b);
        }

        fos.close();
        fis.close();


    }
}
