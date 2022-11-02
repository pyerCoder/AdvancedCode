package com.itheima.maptest;

public class Student /* implements Comparable<Student> */ {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


//    @Override
//    public int compareTo(Student o) {
//        // 首要条件：按照年龄进行排序
//        int result = this.age - o.age;
//        // 次要条件：按照姓名进行排序
//        result = result == 0 ? this.name.compareTo(o.name) : result;
//
//        return result;
//    }
}
