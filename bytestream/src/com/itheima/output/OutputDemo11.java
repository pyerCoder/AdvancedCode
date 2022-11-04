package com.itheima.output;

import java.io.*;

public class OutputDemo11 {
    public static void main(String[] args) throws IOException {
        // 就要利用缓冲流去拷贝文件

        // 创建一个字节缓冲输入流
        // 在底层创建了一个默认长度为8192的字节数组
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("bytestream/a.avi"));

        // 创建一个字节缓冲输出流
        // 在底层也创建了一个默认长度为8192的字节数组
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("bytestream/a_copy_buffer.avi"));

        int b;
        while((b = bis.read()) != -1){
            bos.write(b);
        }

        // 方法的底层会把字节流给关闭
        bis.close();
        bos.close();
    }
}
