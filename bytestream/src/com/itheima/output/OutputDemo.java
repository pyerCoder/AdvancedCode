package com.itheima.output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/***
 * 此代码与视频内容不符
 */
public class OutputDemo {
    public static void main(String[] args) throws IOException {
        // 1、创建字节输出对象 --- 告诉虚拟机我要往哪个文件中写数据了
                // 注意点：如果文件不存在，会帮我们自动创建出来
                //      如果文件是存在，会把文件清空
        // FileOutputStream fos = new FileOutputStream("/Users/kris/Work/Study/Java/Heima/AdvancedCode/bytestream/a.txt");
        FileOutputStream fos = new FileOutputStream(new File("/Users/kris/Work/Study/Java/Heima/AdvancedCode/bytestream/a.txt"));

        // 2、写数据 --- 传递一个整数时，那么实际上写到文件中的，是这个整数在码表中对应的那个字符
        fos.write(97);

        // 3、释放资源
        // fos.close(); // 告诉操作系统，我现在已经不要再用这个文件了
        while (true){

        }
    }
}
