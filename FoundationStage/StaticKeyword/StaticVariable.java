package FoundationStage.StaticKeyword;

class Student{
    String name;
    static String schoolName = "ABC College";

    Student(String name){
        this.name= name;
    }

    void Display(){
        System.out.println("Name: " + name + ", School: " + schoolName);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        Student student1 = new Student("John");
        Student student2 = new Student("Doe");

        student1.Display();
        student2.Display();
    }
}
