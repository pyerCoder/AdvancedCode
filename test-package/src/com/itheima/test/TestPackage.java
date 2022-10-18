package com.itheima.test; // 定义包

//import com.itheima.test2.Student;
/*
        不同包下的相互访问

                1、先导包后访问（import）
                2、通过全类名（包名+类名）访问
                        com.itheima.test2.Student stu = new com.itheima.test2.Student();
                        应用场景：多个包下，出现了相同的类名称，就可以使用这种访问进行区分
 */
public class TestPackage {
        //        Student stu = new Student(); // 先导包后使用
        com.itheima.test2.Student stu = new com.itheima.test2.Student(); // 通过全类名使用

}
