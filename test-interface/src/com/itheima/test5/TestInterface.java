package com.itheima.test5;

import java.util.Optional;

public class TestInterface {
    public static void main(String[] args) {
        InterImpl ii = new InterImpl();
        ii.start();
        ii.end();

        System.out.println("<==============>");
        Inter.open();
        Inter.close();
    }
}

class InterImpl implements Inter{

}
