package AdvanceStage.Annotations;

class Parent{
    void show(){
        System.out.println("parent class");
    }
}
class Child extends Parent{
    @Override
    void show(){
        System.out.println("child class");
    }
}
public class OverrideAnnotation {
public static void main(String[] args) {
    Child c = new Child();
    c.show();
}
    
}