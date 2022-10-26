package com.itheima.filedemo;

import javax.swing.*;
import java.io.File;

public class FileDemo4 {
    // 注意点：
        // 1、不走回收站的
        // 2、如果删除的是文件，那么直接删除。如果删除的是文件夹，那么能删除空文件夹
        // 3、如果要删除一个有内容的文件夹，只能先进入到这个文件夹，把里面的内容全部删除完毕，才能再次删除这个文件夹
    // 简单来说：
        // 只能删除文件或者空文件夹
    public static void main(String[] args) {
        // method1();
        File file = new File("/Users/kris/Work/Study/Java/Heima/AdvancedCode");
        boolean result = file.delete();
        System.out.println(result);
    }

    private static void method1() {
        File file = new File("/Users/kris/Work/Study/Java/Heima/AdvancedCode/a.txt");
        boolean result = file.delete();
        System.out.println(result);
    }
}
