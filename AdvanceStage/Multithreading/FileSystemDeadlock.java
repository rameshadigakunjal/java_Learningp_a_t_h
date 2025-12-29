package AdvanceStage.Multithreading;
class  FileStorage{
}
class Logger{
}
public class FileSystemDeadlock {
    public static void main(String[] args) {
        FileStorage fileStorage = new FileStorage();
        Logger logger = new Logger();

        Thread thread1 = new Thread(() -> {
            synchronized (fileStorage) {
                System.out.println("Thread 1: Locked FileStorage...");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread 1: Waiting for Logger...");

                synchronized (logger) {
                    System.out.println("Thread 1: Locked Logger!");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (logger) {
                System.out.println("Thread 2: Locked Logger...");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread 2: Waiting for FileStorage...");

                synchronized (fileStorage) {
                    System.out.println("Thread 2: Locked FileStorage!");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
