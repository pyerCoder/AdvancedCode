package com.itheima.test1;

public class TestSwimming {
    public static void main(String[] args) {
        Swimming s = new Swimming(){
            @Override
            public void swim() {
                System.out.println("铁汁，我们去游泳吧~");
            }
        };

        goSwimming(s);
        /*
            理解：针对lambda表达式，对匿名内部类进行了优化
         */
        goSwimming(()->{System.out.println("铁汁，我们去游泳吧~");});
    }
    /**
     * 使用接口方法
     */
    public static void goSwimming(Swimming swimming) {
        swimming.swim();
    }
}

interface Swimming{
    void swim();
}