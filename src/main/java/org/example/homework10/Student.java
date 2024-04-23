package org.example.homework10;
import lombok.*;

@Setter
@Getter
@ToString
@Builder
@EqualsAndHashCode
public class Student  {

    @MyAnnotation
    private String name;
    @MyAnnotation
    private int age;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
