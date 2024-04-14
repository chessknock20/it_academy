package org.example.homework8;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {

        Set<Student> students = new TreeSet<>();

        students.add(new Student("Jack", 25));
        students.add(new Student("Sam", 20));

        System.out.println("Size is " + students.size());

        Student studentEva = new Student("Eva", 16);
        students.add(studentEva);
        System.out.println("Size after add is " + students.size());

        for(Student s : students){
            System.out.println(s.toString());
        }
        students.remove(studentEva);
        System.out.println("Size after remove is " + students.size());

        for(Student s : students){
            System.out.println(s.toString());
        }
    }
}
