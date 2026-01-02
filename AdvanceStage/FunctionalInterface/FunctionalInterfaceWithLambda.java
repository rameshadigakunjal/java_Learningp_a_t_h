package AdvanceStage.FunctionalInterface;

@FunctionalInterface
interface Greeting{
    void SayHello();
}
public class FunctionalInterfaceWithLambda {
    public static void main(String[] args) {
        Greeting greeting = () -> System.out.println("Hello, World!");
        greeting.SayHello();
    }
}
