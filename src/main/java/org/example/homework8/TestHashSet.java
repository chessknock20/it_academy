package org.example.homework8;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();

        students.add(new Student("Bob", 18));
        students.add(new Student("Jack", 25));
        students.add(new Student("Sam", 20));

        System.out.println("Size is " + students.size());
        students.add(new Student("Bob", 18));
        System.out.println("Size after add is " + students.size());

        for(Student s : students){
            students.remove(s);
            break;
        }
        System.out.println("Size after remove is " + students.size());

        for(Student s : students){
            System.out.println(s.toString());
        }
        Student studentEva = new Student("Eva", 16);
        students.add(studentEva);
        students.add(new Student("Daniel", 25));
        System.out.println();

        for(Student s : students){
            System.out.println(s.toString());
        }

        students.remove(studentEva);

        System.out.println();
        for(Student s : students){
            System.out.println(s.toString());
        }

        students.remove(new Student("Jack", 25));

        System.out.println();
        for(Student s : students){
            System.out.println(s.toString());
        }
    }
}