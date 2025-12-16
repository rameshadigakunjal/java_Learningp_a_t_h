package FoundationStage.OOPSCOncepts;

class Student {
    int id;
    int rollNumber;
    String name;

    Student(int id, int rollNumber, String name) {
        this.id = id;
        this.rollNumber = rollNumber;
        this.name = name;
    }

    void showStudentData() {
        System.out.println("ID: " + id);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Student student1 = new Student(102, 34, "John Doe");
        student1.showStudentData();
    }
}
