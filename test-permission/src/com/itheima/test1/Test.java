package com.itheima.test1;

public class Test {
    public static void main(String[] args) {
        // 同一个包下，无关类访问
        Fu f = new Fu();
        f.show();

        // 同一个包下，被子类访问
        Zi z = new Zi();
        z.show();
    }

}
