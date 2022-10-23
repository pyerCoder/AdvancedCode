package com.itheima.exce;

public class Feeder {
    // 定义一个饲养员类，成员方法：饲养动物，要求该方法既能养猫，又能养狗
    // 并在方法中调用猫狗的睡觉方法和特有方法
    public void feedAnimal(Animal animal) { // Animal animal = new Cat() | Animal animal = new Dog()
        animal.sleep();
        // 向下转型
        if (animal instanceof Dog) {
            Dog d = (Dog) animal;
            d.lookHome();
        } else if (animal instanceof Cat) {
            Cat c = (Cat) animal;
            c.catchMouse();
        }
    }

    ;
}
