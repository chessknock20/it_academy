package org.example.homework10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException {

//        MyThread thread1 = new MyThread();
//        thread1.start();
//
//        Thread thread2 = new Thread(new OneMoreThread());
//        thread2.start();


        Class studentClass = Student.class;
        //Class studentClass = Class.forName("org.example.homework10.Student");

        Method[] methods = studentClass.getDeclaredMethods();
        Arrays.stream(methods).forEach(System.out::println);

        Field[] fields = studentClass.getDeclaredFields();
        Arrays.stream(fields).forEach(System.out::println);

        Student student1 = (Student) studentClass.newInstance();
        System.out.println(student1.getName());

        Constructor constructor = studentClass.getDeclaredConstructor(String.class, int.class);
        Student student2 = (Student) constructor.newInstance("Jack", 29);
        System.out.println(student2.getName() + " " + student2.getAge());

    }
}
