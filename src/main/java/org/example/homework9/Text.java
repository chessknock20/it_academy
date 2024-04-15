package org.example.homework9;

import org.apache.commons.io.FileUtils;
import org.example.homework8.Student;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;


public class Text {
    public static void main(String[] args) throws IOException {

        File file = FileUtils.getFile("src\\main\\java\\org\\example\\homework9\\TheLordOfTheRings.txt");

        String[] words = new TextCreator().createText(file);

        Map<String, Integer> countOfWords = new WordsCounter().createMap(words);

        for (Map.Entry<String, Integer> map : countOfWords.entrySet()) {
            System.out.println(map);
        }

    }
}
