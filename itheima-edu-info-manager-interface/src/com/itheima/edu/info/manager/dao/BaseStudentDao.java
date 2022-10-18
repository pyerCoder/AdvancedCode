package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;

// 当一个类中的所有方法都是抽象方法的时候，我们就可以将其定义为接口
// 接口也是一种引用数据类型，它比抽象类还要抽象
public interface BaseStudentDao {
//public abstract class BaseStudentDao {

    // 添加学生
    public abstract boolean addStudent(Student student);
    // 查看学生
    public abstract Student[] findAllStudent() ;
    // 删除学生
    public abstract void deleteStudentById(String delId);
    // 修改学生
    public abstract void updateStudent(String updateId, Student new_student);
    // 根据id查找索引
    public abstract int getIndex(String id) ;
}
