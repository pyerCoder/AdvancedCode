package com.itheima.test2;

import com.itheima.test1.InterA;

public class TestInterface {
    /***
     * 成员变量：只能是常量 系统会默认加入三个关键字
     *              public static final
     * 构造方法：没有构造方法
     * 成员方法：只能是抽象方法，系统会默认加入两个关键字
     *              public abstract
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Inter.NUM);
//            InterImpl i = new InterImpl();
    }
    class InterImpl extends Object implements Inter{

        public InterImpl(){
            super(); // 调用的是Object中的构造方法，而不是接口中的构造方法【接口中不存在构造方法】
        }

        public void method(){
//            NUM = 20;
            System.out.println(NUM);
        }

        public void show(){

        }
    }
}
