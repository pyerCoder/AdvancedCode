package com.itheima.constructor;

public class Test {
    public static void main(String[] args) {
//        Student student1 = new Student();
//        Student student2 = new Student(100);
        Student stu = new Student("张三", 23, 100);
        System.out.println(stu.getName() + "..." + stu.getAge() + "..." + stu.getScore());
    }
}
