package lab07;

import java.io.*;
import java.util.concurrent.TimeUnit;

public class executabil {

    public static String ruleaza(String input) {
        // Specify the C++ program command and its arguments
        String cppProgram = "F:\\WIP\\C++\\Playground\\Project1\\x64\\Debug\\Project1.exe"; // Replace with your actual C++ program executable

        // Specify the content to be written to "in.txt"
        String contentToWrite = input;

        // Write content to "in.txt" and close the file
        writeAndCloseFile("F:\\WIP\\C++\\Playground\\Project1\\x64\\Debug\\in.txt", contentToWrite);

        try {
            // Execute the C++ program
            //ProcessBuilder processBuilder = new ProcessBuilder(command);
            //Process process = processBuilder.start();
        	Runtime.getRuntime().exec(cppProgram, null, new File("F:\\WIP\\C++\\Playground\\Project1\\x64\\Debug"));
        	
            TimeUnit.SECONDS.sleep(1);
            // Wait for the C++ program to complete
           

            // Read the output from "out.txt"
            return readFromFile("F:\\WIP\\C++\\Playground\\Project1\\x64\\Debug\\out.txt");

            

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return "eroare";
    }

    // Helper method to write content to a file and close it
    private static void writeAndCloseFile(String filePath, String content) {
        try (PrintWriter writer = new PrintWriter(filePath)) {
            writer.println(content);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Helper method to read content from a file
    private static String readFromFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}
