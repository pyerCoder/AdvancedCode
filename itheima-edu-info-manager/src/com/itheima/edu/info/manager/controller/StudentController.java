package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.service.StudentService;

import java.util.Scanner;

public class StudentController {
    private StudentService studentService = new StudentService(); // 优化节省内存,放到成员变量的位置
    private Scanner sc = new Scanner(System.in); // 优化节省内存,放到成员变量的位置,多处需要用到该对象

//    private StudentService studentService = new StudentService();

    //    开启学生管理系统，并展示学生管理系统菜单
    public void start() {
//        Scanner sc = new Scanner(System.in);
        lo:
        while (true) {
            System.out.println("--------欢迎来到 <学生> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    System.out.println("1");
                    addStudent();
                    break;
                case "2":
                    System.out.println("2");
                    deleteStudentById();
                    break;
                case "3":
//                    System.out.println("3");
                    updateStudent();
                    break;
                case "4":
//                    System.out.println("4");
                    findAllStudent();
                    break;
                case "5":
                    System.out.println("感谢您使用学生管理系统，再见！");
                    break lo;
                default:
                    System.out.println("error input!");
                    break;
            }
        }
    }

    public void updateStudent() {
        Student[] students = studentService.findAllStudent();
        if (students == null) {
            System.out.println("查无信息，请添加后重试");
            return;
        }

//        //        1、键盘录入需要修改学生的学生ID
//        String updateId;
//        while (true) {
//            System.out.println("请输入您要修改的学生ID");
//            updateId = sc.next();
////        2、判断ID在容器中是否存在，如果不存在，则需要一直录入
//            boolean exists = studentService.isExist(updateId);
//            if (!exists) {
//                System.out.println("您输入的id不存在，请重新输入！");
//            }else {
//                break;
//            }
//        }
        String updateId = inputStudentId();

//        System.out.println("请输入学生姓名：");
//        String name = sc.next();
//        System.out.println("请输入学生年龄：");
//        String age = sc.next();
//        System.out.println("请输入学生生日：");
//        String birthday = sc.next();
//        Student new_student = new Student(updateId,name,age,birthday);
        Student new_student = inputStudentInfo(updateId);
        studentService.updateStudent(updateId,new_student);

        System.out.println("修改成功！");

    }

    public void deleteStudentById() {
        Student[] students = studentService.findAllStudent();
        if (students == null) {
            System.out.println("查无信息，请添加后重试");
            return;
        }

////        1、键盘录入需要删除学生的学生ID
//        String delId;
//        while (true) {
//            System.out.println("请输入您要删除的学生ID");
//            delId = sc.next();
////        2、判断ID在容器中是否存在，如果不存在，则需要一直录入
//            boolean exists = studentService.isExist(delId);
//            if (!exists) {
//                System.out.println("您输入的id不存在，请重新输入！");
//            }else {
//                break;
//            }
//        }
        String delId = inputStudentId();
//        3、调用业务员中的deleteStudentById根据id，删除学生
        studentService.deleteStudentById(delId);
//        4、提示删除成功
        System.out.println("删除成功！");
    }


    public void findAllStudent() {
//        StudentService studentService = new StudentService();
//        1、调用业务员中的获取方法，得到学生的对象数组

        Student[] students = studentService.findAllStudent();
//        2、判断数组的内存地址，是否为null
        if (students == null) {
            System.out.println("查无信息，请添加后重试");
            return;
        } else {
//        3、遍历数组，获取学生信息并打印在控制台
            System.out.println("学号\t\t姓名\t年龄\t生日");
            for (int i = 0; i < students.length; i++) {
                Student student = students[i];
                if (student != null) {
                    String id = student.getId();
                    String name = student.getName();
                    String age = student.getAge();
                    String birthday = student.getBirthday();
                    System.out.println(id + "\t" + name + "\t" + age + "\t" + birthday);
                }

            }
        }
    }

    public void addStudent() {
//        StudentService studentService = new StudentService();
//        1、键盘接收学生信息
//        Scanner sc = new Scanner(System.in);

        String id;
        while (true) {
            System.out.println("请输入学生id：");
            id = sc.next();
            boolean flag = studentService.isExist(id);
            if (flag) {
                System.out.println("学号已经被占用，请重新输入！");
            } else {
                break;
            }
        }

//        System.out.println("请输入学生姓名：");
//        String name = sc.next();
//        System.out.println("请输入学生年龄：");
//        String age = sc.next();
//        System.out.println("请输入学生生日：");
//        String birthday = sc.next();
//
////        2、将学生信息封装为学生对象
//        Student student = new Student(id, name, age, birthday);
////        3、将学生对象，传递给StudentService（业务员）中的addStudent方法
        Student student = inputStudentInfo(id);
        boolean result = studentService.addStudent(student);
//        4、根据返回的boolean类型结果，在控制台打印成功/失败
        if (result) {
            System.out.println("添加学生成功！");
        } else {
            System.out.println("添加学生失败！");
        }
    }

    // 键盘录入学生id
    public String inputStudentId(){
        // 定义学生id
        String id;
        while (true) {
            System.out.println("请输入学生id：");
            id = sc.next();
            boolean flag = studentService.isExist(id);
            if (!flag) {
                System.out.println("学号不存在，请重新输入！");
            } else {
                break;
            }
        }
        return id;
    }
//    键盘录入学生信息
    public Student inputStudentInfo(String id){
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        String age = sc.next();
        System.out.println("请输入学生生日：");
        String birthday = sc.next();

//        2、将学生信息封装为学生对象
        Student student = new Student(id, name, age, birthday);
        return student;

    }
}
