
class Employee{
    final String name = "ABC";

    void display(){
        System.out.println(name);
    }
}
public class FinalVariable {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.display();
    }
}
