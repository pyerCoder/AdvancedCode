package com.itheima.threaddemo13;

import javax.swing.plaf.TableHeaderUI;

public class Demo {
    public static void main(String[] args) {
        Object objA = new Object();
        Object objB = new Object();

        new Thread(()->{
            while(true){
                synchronized (objA){
                    // 线程一
                    synchronized (objB){
                        System.out.println("小康同学在走路");
                    }
                }
            }
        }).start();


        new Thread(()->{
            while(true){
                synchronized (objB){
                    // 线程二
                    synchronized (objA){
                        System.out.println("小薇同学在走路");
                    }
                }
            }
        }).start();
    }
}
