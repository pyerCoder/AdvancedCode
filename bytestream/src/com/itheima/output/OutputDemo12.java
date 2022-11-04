package com.itheima.output;

import java.io.*;

public class OutputDemo12 {
    public static void main(String[] args) throws IOException {
        // 缓冲流结合数组，进行文档拷贝

        // 创建一个字节缓冲输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("bytestream/a.avi"));

        // 创建一个字节缓冲输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("bytestream/a_copy_buffer_array.avi"));

        byte [] bytes = new byte[1024];
        int len;
        while((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }

        bis.close();
        bos.close();
    }
}
