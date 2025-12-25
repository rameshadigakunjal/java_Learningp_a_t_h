

public class ClassExample {
    public int id;
    public String name;
    public float salary;

    public void display(){
        System.out.println(id + " " + name + " " + salary);
    }
    public static void main(String[] args) {
        ClassExample emp1 = new ClassExample();
        ClassExample emp2 = new ClassExample();

        emp1.id = 101;
        emp1.name = "John"; 
        emp1.salary = 45000.50f;

        emp2.id = 102;
        emp2.name = "Doe";
        emp2.salary = 55000.50f;
        emp1.display();
        emp2.display();
        
    }
    
}
