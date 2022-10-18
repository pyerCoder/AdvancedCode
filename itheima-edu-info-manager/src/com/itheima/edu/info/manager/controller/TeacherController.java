package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Teacher;
import com.itheima.edu.info.manager.service.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private Scanner sc = new Scanner(System.in); // 提取到成员变量，节省内存
    private TeacherService teacherService = new TeacherService();


    public void start() {
//        Scanner sc = new Scanner(System.in);
        teacherLoop:
        while (true) {
            System.out.println("--------欢迎来到 <老师> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加老师  2.删除老师  3.修改老师  4.查看老师  5.退出");
            String choice = sc.next();
            switch (choice) {
                case "1":
//                    System.out.println("添加老师");
                    addTeacher();
                    break;
                case "2":
//                    System.out.println("删除老师");
                    deleteTeacherById();
                    break;
                case "3":
//                    System.out.println("修改老师");
                    updateTeacher();
                    break;
                case "4":
//                    System.out.println("查看老师");
                    findAllTeacher();
                    break;
                case "5":
                    System.out.println("感谢您使用老师管理系统，再见！");
                    break teacherLoop;
                default:
                    System.out.println("您的输入有误，请重新输入！");
                    break;
            }
        }
    }

    public void updateTeacher() {
        /*
            // 被优化代码段
            String id;
            while (true) {
                // 1、键盘接收要修改的老师id
                System.out.println("请输入您要修改的id");
                id = sc.next();

                boolean exists = teacherService.isExists(id);

                if (exists) {
                    System.out.println("您输入的id不存在，请重新输入：");
                } else {
                    break;
                }
            }

         */
        String id = inputTeacherId();

/*        // 键盘录入新的老师信息
        System.out.println("请输入老师姓名：");
        String name = sc.next();
        System.out.println("请输入老师年龄：");
        String age = sc.next();
        System.out.println("请输入老师生日：");
        String birthday = sc.next();

        // 封装为新的老师对象
        Teacher new_teacher = new Teacher(id, name, age, birthday);*/

        Teacher new_teacher = inputTeacherInfo(id);

        // 调用业务员的修改方法
        teacherService.updateTeacher(id, new_teacher);
        // 提示修改成功
        System.out.println("更新成功");

    }

    public void deleteTeacherById() {

        /*
            // 被优化代码段
            String id;
            while (true) {
                // 1、键盘接收要删除的老师id
                System.out.println("请输入您要删除的id");
                id = sc.next();

                boolean exists = teacherService.isExists(id);

                if (exists) {
                    System.out.println("您输入的id不存在，请重新输入：");
                } else {
                    break;
                }
            }
         */
        String id = inputTeacherId();

        // 2、调用业务员中的删除方法，根据id，删除老师
//        boolean flag = false;
        teacherService.deleteTeacherById(id);
        // 3、提示删除成功
        System.out.println("删除成功");


    }

    public void findAllTeacher() {
//       1、从业务员中，获取老师对象数组
        Teacher[] teachers = teacherService.findAllTeacher();

//        2、判断数组中是否有元素
        if (teachers == null) {
            System.out.println("查无信息，请添加后重试");
            return;
        }

//        3、遍历数组，取出元素，并打印在控制台
        System.out.println("学号\t\t姓名\t年龄\t生日");
        for (int i = 0; i < teachers.length; i++) {
            Teacher teacher = teachers[i];
            if (teacher != null) {
                System.out.println(teacher.getId() + "\t"
                        + teacher.getName() + "\t"
                        + teacher.getAge() + "\t\t"
                        + teacher.getBirthday());
            }
        }


    }

    public void addTeacher() {
        String id;
        while (true) {
            // 1、接收不存在的老师id
            System.out.println("请输入老师id：");
            id = sc.next();
            // 2、判断id是否存在
            boolean exists = teacherService.isExists(id);

            if (exists) {
                System.out.println("id已被占用，请重新输入：");
            } else {
                break;
            }
        }

/*
        // 被优化的代码部分
        // 3、接收老师的其他信息
        System.out.println("请输入老师姓名：");
        String name = sc.next();
        System.out.println("请输入老师年龄：");
        String age = sc.next();
        System.out.println("请输入老师生日：");
        String birthday = sc.next();

        // 4、封装为老师对象
//        Teacher teacher =new Teacher(id,name,age,birthday);
        Teacher teacher = new Teacher();
        teacher.setId(id);
        teacher.setName(name);
        teacher.setAge(age);
        teacher.setBirthday(birthday);*/


        Teacher teacher = inputTeacherInfo(id);

//        5、将封装好的老师对象，传递给TeacherService继续完成添加操作
        boolean result = teacherService.addTeacher(teacher);
        if (result) {
            System.out.println("添加成功！");
        } else {
            System.out.println("添加失败！");
        }
    }


    // 录入老师id
    public String inputTeacherId() {
        String id;
        while (true) {
            // 1、接收不存在的老师id
            System.out.println("请输入id：");
            id = sc.next();
            // 2、判断id是否存在
            boolean exists = teacherService.isExists(id);

            if (!exists) {
                System.out.println("您输入的id不存在，请重新输入：");
            } else {
                break;
            }
        }
        return id;
    }

    // 录入老师信息，封装为老师对象
    public Teacher inputTeacherInfo(String id) {

        System.out.println("请输入老师姓名：");
        String name = sc.next();
        System.out.println("请输入老师年龄：");
        String age = sc.next();
        System.out.println("请输入老师生日：");
        String birthday = sc.next();

        Teacher teacher = new Teacher();
        teacher.setId(id);
        teacher.setName(name);
        teacher.setAge(age);
        teacher.setBirthday(birthday);

        return teacher;

    }
}
