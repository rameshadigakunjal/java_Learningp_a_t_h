package AdvanceStage.Multithreading;
//Simulating a web server handling multiple user requests using a fixed thread pool.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ClientRequest implements Runnable {
    private final int requestId;

    public ClientRequest(int requestId) {
        this.requestId = requestId;
    }

    @Override
    public void run() {
        System.out.println("Processing " + requestId + " by " + Thread.currentThread().getName());
        try {
            // Simulate time taken to process the request
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
          System.out.println(
            "Completed request " + requestId +
            " by " + Thread.currentThread().getName()
        );
    }
}
public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService eService = Executors.newFixedThreadPool(3); // Fixed thread pool with 3 threads

        for (int i = 1; i <= 10; i++) {
            ClientRequest request = new ClientRequest(i);
            eService.execute(request);
        }
        // Shutdown the executor service after all tasks are submitted
        eService.shutdown();
    }

    
}
