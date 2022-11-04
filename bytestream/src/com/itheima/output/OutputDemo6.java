package com.itheima.output;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputDemo6 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("bytestream/a.txt");
            fos.write(97);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                        fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
