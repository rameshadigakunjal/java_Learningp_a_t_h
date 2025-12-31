package AdvanceStage.LamdaExpression;


public class WithLamdaThread {
    public static void main(String[] args) {
        Thread t = new Thread(() -> System.out.println("Thread running"));
        t.start();

    }
}
