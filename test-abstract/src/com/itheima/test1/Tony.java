package com.itheima.test1;

import com.itheima.test2.CompositionTemplate;

public class Tony extends CompositionTemplate {
//    针对父类的成员方法有final关键字限定的，其子类不能重写该方法！
//    public void write(){
//        System.out.println("final 方法重写测试！");
//    }

    @Override
    public void body() {
        System.out.println("test!");
    }

}
