package com.filehandling;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {
	
	public static void writeFile(String filePath, String content) {
		  try (FileOutputStream fos = new FileOutputStream(filePath)) {
	            fos.write(content.getBytes());
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}

}
