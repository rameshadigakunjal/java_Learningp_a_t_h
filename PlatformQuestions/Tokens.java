package PlatformQuestions;

import java.util.Scanner;

public class Tokens {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:  ");

        String s = sc.nextLine();
        sc.close();

        String[] tokens = s.trim().split("[^A-Za-z]+");
        if(s.trim().isEmpty()){
            System.out.println(0);
        } else {
            System.out.println(tokens.length);
            for(String token : tokens){
                System.out.println(token);
            }
    }
}
}
