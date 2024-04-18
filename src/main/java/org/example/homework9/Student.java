package org.example.homework9;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Builder
public class Student implements Comparable<Student> {

    private String name;
    private int age;

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
}
