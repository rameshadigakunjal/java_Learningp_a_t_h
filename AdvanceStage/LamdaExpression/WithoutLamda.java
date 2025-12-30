package AdvanceStage.LamdaExpression;

// sysntax: (parameters) -> { body }
interface MyInterface {

    void show();
}

public class WithoutLamda {
    public static void main(String[] args) {
        MyInterface obj = new MyInterface() {
            @Override
            public void show() {
                System.out.println("Hello from without lambda expression");
            }
        };
        obj.show();
    }
    
}
