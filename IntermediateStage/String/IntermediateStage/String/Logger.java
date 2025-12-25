package IntermediateStage.String;

public class Logger {
    private static StringBuilder logBuffer = new StringBuilder("----Log start-----");
    public static void appendLog(String message) {
        logBuffer.append(Thread.currentThread().getName())
                 .append(": ")
                 .append(message)
                 .append("\n");
    }

    public static void main(String[] args) {
        Runnable logTask = () -> {
           appendLog("Processing user data.");
            appendLog("Operation completed successfully.");
        };
        new Thread(logTask, "Worker-1").start();
        new Thread(logTask, "Worker-2").start();

        try {
            Thread.sleep(100); // Wait for threads to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    System.out.println("----Final Log Output---");
    System.out.println(logBuffer.toString());
    }
    
}
