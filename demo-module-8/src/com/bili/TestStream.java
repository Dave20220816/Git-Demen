package com.bili;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestStream {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream=new FileInputStream("D:/play/ggg/test.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
