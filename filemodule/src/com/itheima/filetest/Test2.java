package com.itheima.filetest;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        // 练习二：删除一个多级文件
        // delete 方法
        // 只能删除文件和空文件夹
        // 如果现在要删除一个有内容的文件夹？
        // 先删掉这个文件夹里面所有的内容
        // 最后删除这个文件夹

        File src = new File("C:\\Desktop\\src");
        deleteDir(src);

    }

    private static void deleteDir(File src) {
        // 先删掉这个文件夹里面的所有内容
        // 递归 方法在方法中自己调用自己
        // 注意：可以解决所有文件夹和递归相结合的题目
        // 1、进入 --- 得到src文件夹里面所有内容的File对象
        File[] files = src.listFiles();
        // 2、遍历 --- 因为我想得到src文件夹里面每一个文件和文件夹的File对象
        for (File file : files) {
            if(file.isFile()){
                // 3、判断 --- 如果遍历到的File对象是一个文件，那么直接删除
                file.delete();
            }else{
                // 4、判断 --- 如果遍历到的File对象是一个目录，那么递归调用
                deleteDir(file); // 参数一定要是src文件夹里面的文件夹File对象
            }
            
        }
        // 最后删除掉这个文件夹
        src.delete();
    }
}
