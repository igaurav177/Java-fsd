package com.filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadInFile {
	public static String readFromFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (FileInputStream fis = new FileInputStream(filePath)) {
            int data;
            while ((data = fis.read()) != -1) {
                content.append((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

}
