package com.itheima.demo2;

public class Demo  {
    public static void main(String[] args) {

        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("zhangsan",23);

        System.out.println(s1==s2); // false
        // Object类中的equals方法，底层也是用==号比较地址值
        // 重写equals方法后，运行结果true，需要抓住问题的本质
        System.out.println(s1.equals(s2)); // false
    }
}
