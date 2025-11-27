package IntermediateStage.Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Fileexample {
    public static void main(String[] args) {
        BufferedReader br  = null;
        try{
            br = new BufferedReader(new FileReader("data.txt"));
            System.out.println(br.readLine());
        }
        catch(IOException e){
            System.out.println("An IOException occurred: " + e.getMessage());
            try{
                if(br != null){
                    br.close();
                    System.out.println("file Colsed.");
                }
            }
            catch(IOException ex){
                System.out.println("Error closing file:");
            }
        }
    }
}
