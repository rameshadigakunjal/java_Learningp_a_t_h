package IntermediateStage.EnumEample;
enum Size{
    SMALL,
    MEDIUM,
    LARGE,
    EXTRA_LARGE;
    public void info(){
        System.out.println("Selected Size: " + this.name());
    }
} 
public class EnumMethodExample {
    public static void main(String[] args) {
        Size s = Size.MEDIUM;
        s.info(); // Calling the method defined in the enum
    }
}
