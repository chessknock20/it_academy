package org.example.homework10;

import java.lang.annotation.Annotation;
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

        Student st1 = new Student("Bob", 20);
        st1.getStudentDetails();

        Annotation studentAnnotation = st1.getClass().getAnnotation(PlaceOfResidence.class);
        PlaceOfResidence place = (PlaceOfResidence) studentAnnotation;
        System.out.println("Student's country is " + place.country());
        System.out.println("Student's city is " + place.city());

        HighSchoolStudent hsStudent = new HighSchoolStudent("Tom", 24);
        hsStudent.getHighSchoolStudentDetails();

        Annotation hsStudentAnnotation = hsStudent.getClass().getAnnotation(PlaceOfResidence.class);
        PlaceOfResidence place2 = (PlaceOfResidence) hsStudentAnnotation;
        System.out.println("High school student's country is " + place2.country());
        System.out.println("High school student's city is " + place2.city());


        Class studentClass = Student.class;
        //Class studentClass = Class.forName("org.example.homework10.Student");

        Method[] methods = studentClass.getDeclaredMethods();
        Arrays.stream(methods).forEach(System.out::println);

        Field[] fields = studentClass.getDeclaredFields();
        Arrays.stream(fields).forEach(System.out::println);

        Student student1 = (Student) studentClass.newInstance();
        System.out.println(student1.getName());

        Constructor constructor = studentClass.getConstructor(String.class, int.class);
        Student student2 = (Student) constructor.newInstance("Jack", 29);
        System.out.println(student2.getName() + " " + student2.getAge());

    }
}
