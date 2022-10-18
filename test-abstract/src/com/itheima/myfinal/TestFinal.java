package com.itheima.myfinal;

public class TestFinal {
    /*
        final 修饰变量：
            基本数据类型变量：其值不能被更改

            引用数据类型变量：地址值不能被更改，但是可以修改对象的属性值
     */
    public static void main(String[] args) {

        // int a = 10;
        // 常量的命名规范：如果是一个单词，所有字母大写，
        // 如果是多个单词，所有字母大写，但是中间需要使用下划线_分隔
        final int A = 10;
        // A = 20; // 不能再给A赋值，因其被final限定，无法绑定新的值

        final Student student = new Student();
        student.setName("张三");
        student.setName("李四");

//        student = new Student(); // 地址值不能被更改，但是可以修改对象的属性值

    }


}

class Student {
    // final 修饰成员成员变量 初始化时机
    // 1、在创建的时候，直接给值
    // 2、在构造方法结束之前，完成赋值
    final int b;

    // final int a = 10;
     private String name;
    // 在java语法中规定，构造方法不能写返回值类型，这就表明了构造方法与其他方法的不同。
    //  public void Student(){ // 语法错误，不能这么写
    public  Student(){
        b = 20;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

/*
    //如果父类被final限定，那么子类将不能继承该父类，
    // 也就是说，该类是最终类，不能有子类
    //final class Fu {
    class Fu {

    }

    class Zi extends Fu {

    }
*/
