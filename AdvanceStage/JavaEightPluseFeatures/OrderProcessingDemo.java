package AdvanceStage.JavaEightPluseFeatures;
import java.time.LocalDate;
import java.util.concurrent.CompletableFuture;

public class OrderProcessingDemo {

    public static void main(String[] args) throws Exception {

        String orderStatus = "SHIPPED";

        // Switch Expression (Java 14+ style)
        String message;
        switch (orderStatus) {
            case "PLACED":
                message = "Your order is placed";
                break;
            case "SHIPPED":
                message = "Your order is on the way";
                break;
            case "DELIVERED":
                message = "Order delivered successfully";
                break;
            default:
                message = "Invalid status";
        }

        System.out.println(message);

        // Date-Time API
        LocalDate orderDate = LocalDate.now();
        LocalDate deliveryDate = orderDate.plusDays(5);

        System.out.println("Order Date    : " + orderDate);
        System.out.println("Delivery Date : " + deliveryDate);

        // CompletableFuture (Async task)
        CompletableFuture<String> orderDetails =
                CompletableFuture.supplyAsync(() -> fetchOrderDetails());

        System.out.println("Fetching order details...");
        System.out.println(orderDetails.get());
    }

    static String fetchOrderDetails() {
        return "Order ID: 101 | Product: Laptop | Amount: ₹65,000";
    }
}
