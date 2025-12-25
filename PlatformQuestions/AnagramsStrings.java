

import java.util.Scanner;

public class AnagramsStrings {
    static boolean isAngram(String s1, String s2){
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        if(s1.length() != s2.length()){
            return false;
        }
        int[] charCount = new int[26];
        for(int i=0; i<s1.length(); i++){
            charCount[s1.charAt(i) - 'a']++;
            charCount[s2.charAt(i) - 'a']--;
        }
        for(int count : charCount){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter two strings:  ");
    
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        boolean ret = isAngram(str1, str2);

        System.out.println((ret)? "Anagrams" : "Not Anagrams");

        
    }
}
