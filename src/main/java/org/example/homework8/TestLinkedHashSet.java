package org.example.homework8;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {
    public static void main(String[] args) {
        Set<Student> students = new LinkedHashSet<>();

        students.add(new Student("Bob", 18));
        students.add(new Student("Jack", 25));
        students.add(new Student("Sam", 20));
        Student studentEva = new Student("Eva", 16);
        students.add(studentEva);

        System.out.println("Size is " + students.size());
        students.add(new Student("Bob", 18));
        students.add(new Student("Tom", 19));
        System.out.println("Size after add is " + students.size());

        students.remove(studentEva);
        System.out.println("Size after remove is " + students.size());

        for(Student s : students){
            System.out.println(s.toString());
        }


    }
}
