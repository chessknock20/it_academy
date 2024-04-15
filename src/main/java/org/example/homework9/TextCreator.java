package org.example.homework9;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class TextCreator {

    public String[] createText(File file) throws IOException {
        String text = FileUtils.readFileToString(file, Charset.defaultCharset());
        String textWithoutPunct = text.replaceAll("\\p{P}", "").toLowerCase();
        String[] words = textWithoutPunct.split("[,\\s]+");
        return words;
    }
}
