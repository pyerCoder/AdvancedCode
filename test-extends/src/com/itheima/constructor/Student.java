package com.itheima.constructor;

public class Student extends Person {
    //    子类自己特有的属性
    private int score;
/*

    public Student() {
        // 子类在初始化之前，一定要先完成父类数据的初始化。
        // 子类在初始化之前，一定要先访问到父类的构造方法，完成父类数据的初始化。
        // 系统在每一个构造方法中【不管是有参还是无参构造方法】，默认隐藏的一句代码super();
        super(); // 不管写不写，系统都会默认执行
//        System.out.println(num);
        System.out.println("我是子类的空参数构造方法......");
    }

    public Student( int score) {
        super(); // 不管写不写，系统都会默认执行【只要调用了有参构造】
        this.score = score;
        System.out.println("我是子类的带参数构造方法！！！");

    }
*/

    public Student() {
        super();
    }

    public Student(String name, int age, int score) {
        super(name,age);
        this.score = score;
    }


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
