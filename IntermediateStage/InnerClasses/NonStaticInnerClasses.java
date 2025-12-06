package IntermediateStage.InnerClasses;
//2️⃣ Non-Static Inner Class
import IntermediateStage.InnerClasses.OuterClass.InnerClass;

class OuterClass{
    private String msg="Welcome to JAVA Programming Language";

    class InnerClass{
        void display(){
            System.out.println(msg);
        }
    }
}

public class NonStaticInnerClasses {
    public static void main(String[] args) {
        OuterClass outer =new OuterClass();
        InnerClass inner = outer.new InnerClass();
       // OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
    
}
