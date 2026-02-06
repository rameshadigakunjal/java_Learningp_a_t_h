package Practice;
public class RemoveDublicate {
    
    public static void main(String[] args) {
        String s="12223445";
        String result = "";

        for(int i=0;i<s.length();i++){
            if(result.indexOf(s.charAt(i))==-1){
                result += s.charAt(i);
            }
        }
        System.out.println(result);
    }
}
