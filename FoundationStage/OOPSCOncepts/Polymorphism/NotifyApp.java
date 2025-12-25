


//An application sends notifications via Email, SMS, and Push Notification. Design using polymorphism.
class Notification{
    void Send(){
        System.out.println("Sending Notification");
    }
}

class EmailNotification extends Notification{
    @Override
    void Send(){
        System.out.println("Sending Email Notification");
    }
}

class SMSNotification extends Notification{
    @Override
    void Send(){
        System.out.println("Sending SMS Notification");
    }
}
class PushNotification extends Notification{
    @Override
    void Send(){
        System.out.println("Sending Push Notification");
    }
}
public class NotifyApp {
    public static void main(String[] args) {
        Notification n;
        n = new EmailNotification();
        n.Send();

        n = new SMSNotification();
        n.Send();
        
        n = new PushNotification();
        n.Send();

    }
}
