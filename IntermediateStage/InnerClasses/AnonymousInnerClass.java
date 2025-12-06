package IntermediateStage.InnerClasses;
abstract class Animal {
    abstract void sound();
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Animal obj = new Animal() {
            void sound() {
                System.out.println("Dog barks");
            }
        };

        obj.sound();
    }
}