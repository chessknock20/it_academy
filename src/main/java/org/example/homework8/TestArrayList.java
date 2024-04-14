package org.example.homework8;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Bob", 18));
        students.add(new Student("Carl", 24));
        students.add(new Student("Eva", 19));

        System.out.println(students.get(1).toString());

        System.out.println("Size is " + students.size());
        students.add(new Student("Bob", 18));
        System.out.println("Size after add is " + students.size());

        students.remove(2);
        System.out.println("Size after remove is " + students.size());

        for(Student s : students){
            System.out.println(s.toString());
        }
    }
}
