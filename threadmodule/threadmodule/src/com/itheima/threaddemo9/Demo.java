package com.itheima.threaddemo9;

public class Demo {
    public static void main(String[] args) {
//        Ticket ticket1 = new Ticket();
//        Ticket ticket2 = new Ticket();
//        Ticket ticket3 = new Ticket();
//
//        Thread t1 = new Thread(ticket1);
//        Thread t2 = new Thread(ticket2);
//        Thread t3 = new Thread(ticket3);

        Ticket ticket = new Ticket();

        Thread t1 = new Thread(ticket);
        Thread t2 = new Thread(ticket);
        Thread t3 = new Thread(ticket);


        t1.setName("窗口1：");
        t2.setName("窗口2：");
        t3.setName("窗口3：");


        t1.start();
        t2.start();
        t3.start();


    }
}
