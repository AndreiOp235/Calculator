package lab07;

import java.io.*;
import java.util.concurrent.TimeUnit;

public class executabil {

    public static String ruleaza(String input) {
        String cppProgram = TestPrb03.caleEXEC;
        String contentToWrite = input;

        writeAndCloseFile(cppProgram + "\\in.txt", contentToWrite);

        try {
        	Process verifica =Runtime.getRuntime().exec(cppProgram+"\\Project1.exe", null, new File(cppProgram));
        	
            TimeUnit.SECONDS.sleep(1);
            int exitCode = verifica.waitFor();
            // Wait for the C++ program to complete
            if (exitCode!=0)
            	return "Introducere eronata";
            else
            	return readFromFile(cppProgram+"\\out.txt");

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
