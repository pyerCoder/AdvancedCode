package com.itheima.filename4UUID;

import java.util.UUID;

public class UUIDDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            UUID uuid = UUID.randomUUID();
            String s = uuid.toString().replace("-","");
            System.out.println(s);
        }

    }
}
