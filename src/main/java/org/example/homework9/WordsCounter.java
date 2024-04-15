package org.example.homework9;

import java.util.HashMap;
import java.util.Map;

public class WordsCounter {

    public Map<String, Integer> createMap(String[] words) {
        Map<String, Integer> countOfWords = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (countOfWords.containsKey(words[i])) {
                countOfWords.put(words[i], countOfWords.get(words[i]) + 1);
            } else {
                countOfWords.put(words[i], 1);
            }
        }
        return countOfWords;
    }
}
