package org.example.homework10;

import lombok.*;

@Setter
@Getter
@ToString
@Builder
@EqualsAndHashCode
@PlaceOfResidence(country = "France", city = "Paris")
public class HighSchoolStudent {

    private String name;

    private int age;

    public void getHighSchoolStudentDetails(){
        System.out.println("High school student's name is " + name);
        System.out.println("High school student's age is "+ age);
    }
}
