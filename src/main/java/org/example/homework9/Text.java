package org.example.homework9;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Map;


public class Text {
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



    }
}
