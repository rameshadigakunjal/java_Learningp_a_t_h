package IntermediateStage.InnerClasses;

class OuterClass {
    void outerMethod() {
        class LocalInner {
            void show() {
                System.out.println("Inside Local Inner Class");
            }
        }

        LocalInner obj = new LocalInner();
        obj.show();
    }
}

public class LocalClass {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.outerMethod();
    }
}
