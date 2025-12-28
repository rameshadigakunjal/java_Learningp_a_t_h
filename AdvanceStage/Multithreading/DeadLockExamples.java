package AdvanceStage.Multithreading;

class ResourcesA{

}
class ResourcesB{

}
public class DeadLockExamples {
    public static void main(String[] args) {
        ResourcesA rA = new ResourcesA();
        ResourcesB rB = new ResourcesB();

        Thread t1 = new Thread(()->{
            synchronized (rA){
                System.out.println("Thread 1: Locked Resource A...");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread 1: Waiting for Resource B...");

                synchronized (rB){
                    System.out.println("Thread 1: Locked Resource B!");
                }
            }
        });

        Thread t2 =new Thread(()->{
            synchronized (rB){
                System.out.println("Thread 2: Locked Resource B...");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread 2: Waiting for Resource A...");

                synchronized (rA){
                    System.out.println("Thread 2: Locked Resource A!");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
