package com.itheima.edu.info.manager.entry;

import com.itheima.edu.info.manager.controller.OtherStudentController;
import com.itheima.edu.info.manager.controller.OtherTeacherController;

import java.util.Scanner;

public class InfoManagerEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        lo:
        while(true){
        // 主菜单搭建
            System.out.println("--------欢迎来到黑马信息管理系统--------");
            System.out.println("请输入您的选择: 1.学生管理  2.老师管理  3.退出");
            String choice = sc.next();
            switch (choice){
                case "1":
                    System.out.println("1");
//                    开启学生管理系统
//                    StudentController studentController = new StudentController();
                    OtherStudentController studentController = new OtherStudentController();
                    studentController.start();
                    break;
                case "2":
                    System.out.println("2");
//                    TeacherController teacherController = new TeacherController();
                    OtherTeacherController teacherController = new OtherTeacherController();
                    teacherController.start();
                    break;
                case "3":
                    System.out.println("感谢您的使用！再见！");
//                    退出当前正在运行的jvm虚拟机
//                    System.exit(0); // 替代性的做法！
                    break lo;
                default:
                    System.out.println("error input!");
                    break;
            }
        }
    }
}
