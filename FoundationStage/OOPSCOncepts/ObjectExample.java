package FoundationStage.OOPSCOncepts;

public class ObjectExample {
    public static void main(String[] args) {
        ClassExample emp1 = new ClassExample();
        ClassExample emp2 = new ClassExample();

        emp1.id = 201;
        emp1.name = "Alice"; 
        emp1.salary = 60000.75f;

        emp2.id = 202;
        emp2.name = "Bob";
        emp2.salary = 70000.85f;
        emp1.display();
        emp2.display();
    }
}
