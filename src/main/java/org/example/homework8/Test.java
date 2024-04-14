package org.example.homework8;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test {
    public static void main(String[] args) {
        // throw new MyException("MyException");
        // testException(6);

        testFileReader(11);
    }

//    public static void testException(int a) {
//        try {
//            if (a > 5)
//                throw new MyException("My exception");
//        } catch (MyException e) {
//            System.out.println(e);
//        }
//        System.out.println("test passed");
//    }

    public static void testFileReader(int i) {
        if (i > 10)
            try {
                FileReader filereader = new FileReader("file.txt");
                i += 5;
            } catch (FileNotFoundException e) {
                System.out.println("File is not found");
            }
        System.out.println(i);
    }
}
