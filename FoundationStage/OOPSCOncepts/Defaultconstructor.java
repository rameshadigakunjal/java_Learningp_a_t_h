package FoundationStage.OOPSCOncepts;
// Constructor is a special method that is called when an object is instantiated.
// It is used to initialize the object's attributes.
class Student {
    int id;
    int rollnumber;
    String name;

    //Defaultconstructor
    Student(){
        id = 101;
        rollnumber = 21;
        name = "ABC";
    }
}
public class Defaultconstructor {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("ID: " + student1.id);
        System.out.println("Roll Number: " + student1.rollnumber);
        System.out.println("Name: " + student1.name);
    }
    
}
