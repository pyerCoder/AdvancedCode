package com.itheima.homework.stage01;

public class Dog {
    private String color;
    private String breed;

    public void 吃饭(){
        System.out.println(this.color + this.breed + "正在啃骨头.....");
    }

    public void lookHome(){
        System.out.println(this.color + this.breed + "正在看家.....");

    }

    public Dog() {
    }

    public Dog(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
