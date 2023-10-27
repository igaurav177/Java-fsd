package com.filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class AppendFile {
	public static void appendToFile(String filePath, String content) {
        try (FileOutputStream fos = new FileOutputStream(filePath, true)) {
            fos.write(content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
