package com.filehandling;

public class FileHandlingExe {

	public static void main(String[] args) {
		String filePath = "C:/Users/gaura/Desktop/file.txt";
		WriteInFile writeInFileObj = new WriteInFile();
		writeInFileObj.writeFile(filePath, "Hello, I am gaurav Kumar");
		
		
        
        AppendFile  ap = new AppendFile();
        String data = ". This is the append data.";
        ap.appendToFile(filePath, data);
        
        ReadInFile readObj = new ReadInFile();
		String fileContent = readObj.readFromFile(filePath);
        System.out.println("File Content: " + fileContent);
	}

}
