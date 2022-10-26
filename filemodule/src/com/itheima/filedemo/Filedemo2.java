package com.itheima.filedemo;

import java.io.File;

public class Filedemo2 {
    public static void main(String[] args) {
        // 这个路径固定不变了
        File file = new File("/Users/kris/Work/Study/Java/Heima/AdvancedCode");
        System.out.println(file);

        // 当前项目下的a.txt
        File file2 = new File("a.txt");
        System.out.println(file2);

        // 当前项目下 ---- 指定模块下的a.txt
        File file3 = new File("filemodule/a.txt");
        System.out.println(file3);
    }

}
