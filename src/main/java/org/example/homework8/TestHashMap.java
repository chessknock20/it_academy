package org.example.homework8;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    public static void main(String[] args) {

        Map<Integer, Student> students = new HashMap<>();
        students.put(1, new Student("Bob", 18));
        students.put(2, new Student("Jack", 20));
        students.put(3, new Student("Sam", 17));

        for(Map.Entry<Integer, Student> s : students.entrySet()){
            System.out.println(s.getKey() + "_" + s.getValue().toString());
        }

        students.put(1, new Student("Tom", 22));
        students.remove(2);

        System.out.println();
        for(Map.Entry<Integer, Student> s : students.entrySet()){
            System.out.println(s.getKey() + "_" + s.getValue().toString());
        }
        System.out.println(students.containsKey(2));





    }
}
