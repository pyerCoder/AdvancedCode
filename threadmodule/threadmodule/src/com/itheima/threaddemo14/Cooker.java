package com.itheima.threaddemo14;

public class Cooker extends Thread{
    @Override
    public void run() {
        /*生产者步骤
        1、判断桌子上是否有汉堡包
        如果有就等待，如果没有才生产。
        2、把汉堡包放在桌子上
        3、叫醒等待的消费者开吃。*/

        while (true){
            synchronized (Desk.Lock){
                if(Desk.count==0){
                    break;
                }else{
                    if(!Desk.flag){
                        // 生产
                        System.out.println("厨师正在生产汉堡包");
                        Desk.flag=true;
                        // Desk.count++;
                        Desk.Lock.notifyAll();
                    }else{
                        try {
                            Desk.Lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
