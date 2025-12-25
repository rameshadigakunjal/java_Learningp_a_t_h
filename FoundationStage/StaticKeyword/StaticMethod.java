

class Calculator{
    static int add(int a,int b){
        return a + b;
    }

}
public class StaticMethod {
    public static void main(String[] args) {
        System.out.println("Add Two Number is: "+Calculator.add(450, 60));
    }
}
