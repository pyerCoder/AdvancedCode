package com.itheima.test3;

public class Test3Polymorphic {
    public static void main(String[] args) {
        useDog(new Dog());
        useCat(new Cat());
        useAnimal(new Cat());
        useAnimal(new Dog());

    }

    public static void useDog(Dog dog){
        dog.eat();
    }

    public static void useCat(Cat cat){
        cat.eat();
    }

    public static void useAnimal(Animal animal){
        /*
            多态的好处：提高了程序的扩展性
                具体体现：定义方法的时候，使用父类作为参数，该方法就可以接收这父类的任意子类对象
            多态的弊端：不能使用子类的特有功能

         */
        animal.eat();
        // 不能调用子类特有的方法【多态的缺点】
        // animal.watchHome();

        Dog dog = (Dog) animal;
        ((Dog)animal).watchHome(); // ClassCastException

        // 为避免上述错误，可以做判断过滤下
        /* if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            ((Dog)animal).watchHome(); // ClassCastException
        }

         */
    }
}


abstract class Animal{
    public abstract void eat();

}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    public void watchHome(){
        System.out.println("看家");
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}