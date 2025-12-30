package AdvanceStage.LamdaExpression;

interface InnerWithLamda {

    void show();
}
public class WithLamda {
    public static void main(String[] args) {
        InnerWithLamda obj = ()->
            System.out.println("Hello from with lambda expression");
            obj.show();

        }
    }
