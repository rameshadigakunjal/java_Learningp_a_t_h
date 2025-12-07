package PlatformQuestions;


// Demonstration of All Access Modifiers in Java

class Parent {

    public String publicVar = "PUBLIC: Accessible everywhere";
    private String privateVar = "PRIVATE: Accessible only inside class";
    protected String protectedVar = "PROTECTED: Accessible in same package + subclasses";
    String defaultVar = "DEFAULT: Accessible only inside same package";

    public void publicMethod() {
        System.out.println(publicVar);
    }

    private void privateMethod() {
        System.out.println(privateVar);
    }

    protected void protectedMethod() {
        System.out.println(protectedVar);
    }

    void defaultMethod() {
        System.out.println(defaultVar);
    }

    void accessInsideClass() {
        System.out.println("--- Access inside Parent class ---");
        publicMethod();
        privateMethod();
        protectedMethod();
        defaultMethod();
    }
}

class Child extends Parent {
    void accessFromChild() {
        System.out.println("\n--- Access from Child class ---");
        System.out.println(publicVar);       // allowed
        //System.out.println(privateVar);    // ❌ not allowed
        System.out.println(protectedVar);    // allowed
        System.out.println(defaultVar);      // allowed (same package)
    }
}

public class AccesModifier {
    public static void main(String[] args) {

        Parent parent = new Parent();
        Child child = new Child();

        parent.accessInsideClass();
        child.accessFromChild();

        System.out.println("\n--- Access from Main class (same package) ---");
        System.out.println(parent.publicVar);      // allowed
        //System.out.println(parent.privateVar);   // ❌ not allowed
        System.out.println(parent.protectedVar);   // allowed
        System.out.println(parent.defaultVar);     // allowed
    }
}
