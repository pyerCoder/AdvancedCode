package com.itheima.test6;

public class TestSwimming {
    public static void main(String[] args) {
        Swimming s = new Swimming(){
            @Override
            public void swim() {
                System.out.println("铁汁，我们去游泳吧~");
            }
        };

        goSwimming(s);
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


