package com.itheima.test2;

/*
    作文模板类
 */
public abstract class CompositionTemplate {

//    public void write() {
    // 限定为最终方法，这样该方法不能被子类重写
    public final void write() {
        System.out.println("<<我的爸爸>>");

//        System.out.println("那是一个秋天，风儿那么缠绵，记忆中" +
//                " 那天爸爸汽车接我放学回家，我的脚卡在了自行车链当中，爸爸蹬不动，他就站起来蹬...");

        body();

        System.out.println("啊~ 这就是我的爸爸");
    }

//    public void body(){
////        System.out.println("那是一个秋天，风儿那么缠绵，记忆中" +
////                " 那天爸爸汽车接我放学回家，我的脚卡在了自行车链当中，爸爸蹬不动，他就站起来蹬...");
////
////    }

    public abstract void body();
}
