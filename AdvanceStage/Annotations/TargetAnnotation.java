package AdvanceStage.Annotations;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String value();
}
public class TargetAnnotation {
    public static void main(String[] args) {
        System.out.println("This is a demonstration of Target Annotation.");
    }
}
