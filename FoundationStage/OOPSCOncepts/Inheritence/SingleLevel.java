package FoundationStage.OOPSCOncepts.Inheritence;
class Logger{
    String AppName;

    Logger(String AppName){
        this.AppName = AppName;
    }

    void message(String message){
        System.out.println("[" + AppName + "] " + message);
    }
}
class FileLogger extends Logger{
    String AppName;

    FileLogger(String AppName){
        super(AppName);
        this.AppName = AppName;
    }
    void logToFile(String message){
        System.out.println("Logging to file from " + AppName + ": " + message);
    }
}
public class SingleLevel {
    public static void main(String[] args) {
        FileLogger file = new FileLogger("MyApp");
        file.message("This is a log message."); 
        file.logToFile("This is a file log message.");
    }
}
