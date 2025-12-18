package FoundationStage.OOPSCOncepts.Polymorphism;

public class CompileTimePolymorphism {

    double area(int side) {
        return side * side;
    }
    double area(int length, int breadth) {
        return length * breadth;
    }


    public static void main(String[] args) {
        CompileTimePolymorphism s =new CompileTimePolymorphism();
        System.out.println("Area of Square: " + s.area(5));
        System.out.println("Area of Rectangle: " + s.area(5, 10));
    }
    
}
