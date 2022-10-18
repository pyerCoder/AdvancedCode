package com.itheima.homework.stage01;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("花色的", "波斯猫");
        cat.eat();
        cat.catchMouse();

        Dog dog = new Dog("黑色的","藏獒");
        dog.吃饭();
        dog.lookHome();
    }
}
