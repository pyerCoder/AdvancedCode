package com.itheima.edu.info.manager.service;

import com.itheima.edu.info.manager.dao.TeacherDao;
import com.itheima.edu.info.manager.domain.Teacher;

public class TeacherService {
    private TeacherDao teacherDao = new TeacherDao();

    public boolean isExists(String id) {
//        1、获取库管对象中的数组
                Teacher[] teachers  = teacherDao.findAllTeacher();
                boolean exists = false;
//                2、遍历数组，取出每一个元素，进行判断
        for (int i = 0; i < teachers.length; i++) {
            Teacher teacher = teachers[i];
            if(teacher!=null && id.equals(teacher.getId())){
                exists = true;
                break;
            }
        }
            return exists;
    }

    public boolean addTeacher(Teacher t) {
        boolean result = teacherDao.addTeacher(t);
        return result;
    }

    public Teacher[] findAllTeacher() {
        Teacher[] teachers =  teacherDao.findAllTeacher();
//        return teachers; // 此种返回有问题，空数组对象也是有内存地址的，不符合要求
        boolean flag = false;

        for (int i = 0; i < teachers.length; i++) {
            Teacher t = teachers[i];
            if(t!=null){
                flag = true;
                break;
            }
        }
        if(flag){
            return  teachers;
        }else {
            return null;
        }
    }

    public void deleteTeacherById(String id) {
        teacherDao.deleteTeacherById(id);
    }

    public void updateTeacher(String id, Teacher new_teacher) {
        teacherDao.updateTeacher(id,new_teacher);
    }
}
