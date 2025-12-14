package PlatformQuestions;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;


public class ReadFile {

    public static String ReadFilePath(String filePath) {
        try{
            // Use readAllBytes for compatibility with Java 8+ where Files.readString may be unavailable
            byte[] data = Files.readAllBytes(Paths.get(filePath));
            return new String(data, StandardCharsets.UTF_8);
        } catch (Exception e) {
			return "Error reading file: " + e.getMessage();  // Handle file read errors
        }
    }
    public static void main(String[] args) throws java.lang.Exception {
        System.out.println(ReadFilePath("D:\\javaLearning\\IntermediateStage\\note2.txt"));
    }
}
