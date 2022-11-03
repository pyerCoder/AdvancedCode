package com.itheima.filedemo;

import java.io.File;
import java.io.IOException;

public class Filedemo2 {
    public static void main(String[] args) throws IOException {
        // 这个路径固定不变了
        File file = new File("/Users/kris/Work/Study/Java/Heima/AdvancedCode");
        System.out.println(file);

        // 当前项目下的a.txt
        File file2 = new File("a.txt");
        // 测试文件创建与删除，观察对比该文件所在目录
//        file2.createNewFile();
//        file2.delete();
        System.out.println(file2);

        // 当前项目下 ---- 指定模块下的a.txt
        File file3 = new File("filemodule/a.txt");
        System.out.println(file3);
    }

}
