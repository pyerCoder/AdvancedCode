package com.itheima.test4;

import com.itheima.test1.InterImpl;
import com.sun.source.tree.BinaryTree;

public class TestInterface {

    public static void main(String[] args) {
        InterAImpl ia = new InterAImpl();
//        ia.show(); // 不被允许

        InterA.show();

        InterB.show();

//        InterImpl.show(); // 不被允许
    }
}


class InterAImpl implements InterA{

}