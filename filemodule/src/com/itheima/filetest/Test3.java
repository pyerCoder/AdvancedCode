package com.itheima.filetest;

import java.io.File;
import java.util.HashMap;

public class Test3 {
    // 统计一个文件夹中，每种文件出现的次数
    // 统计 --- 定义一个变量来统计 --- 弊端：同时只能统计一种文件
    // 利用map集合进行数据统计，键盘 --- 文件后缀名  值 --- 次数
    public static void main(String[] args) {
        File file = new File("filemodule");
        HashMap<String,Integer> hm = new HashMap<>();
        getCount(hm,file);
        System.out.println(hm);
    }

    private static void getCount(HashMap<String, Integer> hm, File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if(f.isFile()){
                String fileName = f.getName();
                String[] fileNameArr = fileName.split("\\.");
                // System.out.println(fileNameArr);
                // aaa a.a.txt 特殊情况不做考虑
                if(fileNameArr.length==2){
                    String fileEndName = fileNameArr[1];
                    // System.out.println(fileEndName);
                    if(hm.containsKey(fileEndName)){
                        // 已存在
                        // 将已经出现的次数获取出来
                        Integer count = hm.get(fileEndName);
                        // 这种文件又出现了一次
                        count++;
                        // 把已经出现的次数给覆盖掉
                        hm.put(fileEndName,count);
                    }else{
                        // 不存在
                        // 表示当前文件是第一次出现
                        hm.put(fileEndName,1);
                    }
                }

            }else {
                getCount(hm,f);
            }

        }
    }


}
