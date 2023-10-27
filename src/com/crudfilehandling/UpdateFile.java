package com.crudfilehandling;
import java.io.*;
import java.util.Scanner;

public class UpdateFile {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            if (!file.exists()) {
                System.out.println("File does not exist.");
                return;
            }

            // Read the existing content
            StringBuilder content = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
            }

            // Update the content
            String input;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the content you want to update : ");
            input=sc.nextLine();
            content.append(" "+input);

            // Write the updated content back to the file
            try (FileWriter writer = new FileWriter(file)) {
                writer.write(content.toString());
            }

            System.out.println("File updated successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
