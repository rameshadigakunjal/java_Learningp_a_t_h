package IntermediateStage.InnerClasses;
//1️⃣ Static Inner Class
class OuterClass{
    static String msg = "Static Inner Class Example";

    static class Innerclass{
        void display(){
            System.out.println(msg);
        }
    }
}
public class StaticInnerlasses {
    public static void main(String[] args) {
        OuterClass.Innerclass inner = new OuterClass.Innerclass();
        inner.display();
    }
}
