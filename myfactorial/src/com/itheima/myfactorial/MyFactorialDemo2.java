package com.itheima.myfactorial;

public class MyFactorialDemo2 {
    public static int get_sum(int index) {
        if(index == 1){
            return 1;
        }
        return get_sum(index-1) + index;
    }

    public static void main(String[] args) {
        int res = get_sum(100);
        System.out.println(res);
    }

}
