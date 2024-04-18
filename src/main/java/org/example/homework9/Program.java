package org.example.homework9;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


public class Program {
    public static void main(String[] args) throws IOException {

        File file = FileUtils.getFile("src\\main\\java\\org\\example\\homework9\\TheLordOfTheRings.txt");

        String[] words = new TextCreator().createText(file);

        Map<String, Integer> countOfWords = new WordsCounter().createMap(words);

        File newText = new File("src\\main\\java\\org\\example\\homework9\\newText.txt");
        countOfWords.forEach((key, value) -> {
            try {
                FileUtils.writeStringToFile(newText, key + " " + value + "\n", true);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        String greetings = "Hello!!!";

        IGreeting<String> a = s -> System.out.println(s);
        a.greetings(greetings);

        Student [] students = new Student[5];
        students[0] = new Student("Tom", 18);
        students[1] = new Student("Jack", 16);
        students[2] = new Student("Sam", 20);
        students[3] = new Student("Daniel", 24);
        students[4] = new Student("Bob", 15);

        List<String> namesOfStudentsOver18;

        namesOfStudentsOver18 = Arrays.stream(students).filter(s -> s.getAge() >=18).sorted(Student::compareTo).map(s -> s.getName()).toList();
        System.out.println("Names of students over 18 years old: ");
        namesOfStudentsOver18.stream().forEach(System.out::println);
        System.out.println("Number of students under 18 years old = " + Arrays.stream(students).filter(s -> s.getAge() <18).count());
    }
}
