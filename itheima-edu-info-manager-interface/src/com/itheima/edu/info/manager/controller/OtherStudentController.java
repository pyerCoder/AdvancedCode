package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Student;

import java.util.Scanner;

public class OtherStudentController extends BaseStudentController {
    private Scanner sc = new Scanner(System.in); // 优化节省内存,放到成员变量的位置,多处需要用到该对象

//    private StudentService studentService = new StudentService();

    //    键盘录入学生信息
//    开闭原则：对扩展内容进行开放，对修改内容进行关闭
    @Override
    public Student inputStudentInfo(String id) {
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        String age = sc.next();
        System.out.println("请输入学生生日：");
        String birthday = sc.next();

//        2、将学生信息封装为学生对象
        Student student = new Student(id, name, age, birthday); // 使用有参构造方法替换下面的set方法，代码更简洁
/*        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setBirthday(birthday);
*/
        return student;

    }
}
