package FoundationStage.OOPSCOncepts;

class Student{
    int id;
    int rollnumber;
    String name;

    //Parameterized Constructor
    Student(int id, int rollnumber, String name){
        this.id = id;
        this.rollnumber = rollnumber;
        this.name = name;
    }
    void showStudentData(){
        System.out.println("ID: " + id);
        System.out.println("Roll Number: " + rollnumber);
        System.out.println("Name: " + name);
    }
}
public class ParameterizedConstuctor {
    public static void main(String[] args) {
        Student student1 = new Student(102, 34, "John Doe");
        student1.showStudentData();
    }
}
