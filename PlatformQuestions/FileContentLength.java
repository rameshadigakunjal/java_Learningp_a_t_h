

//import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileContentLength {

    public static int getFileContentLenghth(String filePath){
        try{
            return Files.readAllBytes(Paths.get(filePath)).length;
        }
        catch (Exception e){
            System.out.println("Error reading file: " + e.getMessage());
            return -1;
        }
    }
    public static void main(String[] args) {
        String filePath = "D:\\javaLearning\\IntermediateStage\\note2.txt";
        int length = getFileContentLenghth(filePath);

        if (length != -1) {
            System.out.println("File content length: " +length);
        } else {
            System.out.println("Failed to read file.");
        }
       // System.out.println(getFileContentLenghth(filePath));

    }
}
