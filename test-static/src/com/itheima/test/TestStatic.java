package com.itheima.test;

public class TestStatic {
    public static void main(String[] args) {
        /*
            1、被static修饰的成员，会被该类的所有对象所（共享）
            2、被static修饰的成员，会随着类的加载而加载，优先于对象存在
            3、多了一种调用方式，可以通过类名.进行调用
         */
        Student stu = new Student();
        stu.name = "Eric";
        stu.age = 33;
        stu.school = "No.11 middle school!";
        stu.show();

        System.out.println("#####################");
        System.out.println(Student.school);
        System.out.println("#####################");
        Student.new_show();
        System.out.println("#####################");
        Student stu1 = new Student();
        stu1.show();

        stu1.school="No.12 middle school";
        stu.show();
        stu1.show();
    }
}
