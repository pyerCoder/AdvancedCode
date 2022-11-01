package com.itheima.genericityclass;

public class MyGenericityClass {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.setElement("给小丽的土味情话");

        String element1 = box1.getElement();
        System.out.println(element1);

        System.out.println("-----------------------");

        Box<Integer> box2 = new Box<>();
        box2.setElement(19);

        Integer element2 = box2.getElement();
        System.out.println(element2);

    }
}
