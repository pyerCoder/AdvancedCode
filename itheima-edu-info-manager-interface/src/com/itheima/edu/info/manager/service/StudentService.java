package com.itheima.edu.info.manager.service;

import com.itheima.edu.info.manager.controller.OtherStudentController;
import com.itheima.edu.info.manager.dao.BaseStudentDao;
import com.itheima.edu.info.manager.dao.OtherStudentDao;
import com.itheima.edu.info.manager.dao.StudentDao;
import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.factory.StudentDaoFactory;

public class StudentService {
    //        1、创建StudentDao（库管）
//    private OtherStudentDao studentDao = new OtherStudentDao(); // 节省内存，避免冗余，直接提到成员变量的位置
            // 多态优化版【通过学生库管工厂类，获取库管对象】
        private BaseStudentDao studentDao =  StudentDaoFactory.getStudentDao();

    public boolean addStudent(Student student) {
//        // 1、创建StudentDao（库管）
//        StudentDao studentDao = new StudentDao();
//      // 2、将学生对象，传递给StudentDao 库管中的addStudent方法
        boolean result = studentDao.addStudent(student);
//        3、将返回的boolean类型结果，返还给StudentController
        return result;

    }

    public boolean isExist(String id) {
//        //        1、创建StudentDao（库管）
//        StudentDao studentDao = new StudentDao();
//        2、将学生id，传递给StudentDao 库管中的isExist方法
        Student[] students = studentDao.findAllStudent();
        // 假设id在数组中不存在
        boolean exists = false;
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if (student != null && id.equals(student.getId())) {
//        3、将返回的boolean类型结果，返还给StudentController
                exists = true;
                break;
            }
        }
        return exists;
    }

    public Student[] findAllStudent() {
//        1、调用库管对象的findAllStudent获取学生对象数组
        Student[] allStudent = studentDao.findAllStudent();
//        2、判断数组中是否有学生信息（有：返回地址，没有：返回null）
//        思路：数组中只要存在一个不是null的元素，那就代表有学生信息
        boolean flag = false;
        for (int i = 0; i < allStudent.length; i++) {
            Student student = allStudent[i];
            if (student != null) {
                flag = true;
                break;
            }
        }
        if (flag) {
            // 有信息
            return allStudent;
        } else {
            // 没有信息
//            System.out.println("查无学生信息，请添加后重试！");
            return null;
        }
    }

    public void deleteStudentById(String delId) {
        studentDao.deleteStudentById(delId);
    }

    public void updateStudent(String updateId, Student new_student) {
        studentDao.updateStudent(updateId,new_student);
    }
}