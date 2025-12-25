

class AddMethods{
    public int methods(int x,int y){
        return x+y;
    }
    public String methods(String a, String b){
        return a+b;
    }
    public boolean methods(boolean p, boolean q){
        return p&&q;
    }
    public double methods(double m, double n){
        return m/n;
    }

}
public class MethodsExample {
    public static void main(String[] args) {
        AddMethods obj = new AddMethods();
        System.out.println("Addition of two numbers: " + obj.methods(5,10));
        System.out.println("Concatenation of two strings: " + obj.methods("Hello ","World"));
        System.out.println("Logical AND of two booleans: " + obj.methods(true,false));
        System.out.println("Division of two doubles: " + obj.methods(15.5,2.5));
    }
}
