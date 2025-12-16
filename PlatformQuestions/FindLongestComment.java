package PlatformQuestions;

public class FindLongestComment {
    public static int findLongestComment(String code) {
        String[] lines = code.split("\n");
        int maxLength = 0;

        for (String line : lines) {
            line = line.trim();
            if (line.startsWith("//")) {
                int length = line.length() - 2; // Exclude the '//' characters
                if (length > maxLength) {
                    maxLength = length;
                }
            }
        }

        return maxLength;
    }
    public static void main(String[] args) {
        
        String filepath = "D:\\javaLearning\\IntermediateStage\\note2.txt";
        System.out.println(findLongestComment(filepath));
    }
    
}
