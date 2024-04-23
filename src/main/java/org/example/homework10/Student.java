package org.example.homework10;
import lombok.*;

@Setter
@Getter
@ToString
@Builder
@EqualsAndHashCode
@PlaceOfResidence
public class Student  {

    private String name;

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

    public void getStudentDetails(){
        System.out.println("Student's name is " + name);
        System.out.println("Student's age is "+ age);
    }

}
