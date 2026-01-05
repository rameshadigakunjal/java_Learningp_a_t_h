package AdvanceStage.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String value();
}

class Demo {
    @MyAnnotation("Runtime retention demo")
    public void display() {
        System.out.println("Display method invoked");
    }
}

public class RetentionAnnotation {
    public static void main(String[] args) throws Exception {
        Demo d = new Demo();
        Method m = d.getClass().getMethod("display");

        MyAnnotation an = m.getAnnotation(MyAnnotation.class);
        if (an != null) {
            System.out.println("Annotation value: " + an.value());
            d.display();
        } else {
            System.out.println("No annotation present");
        }
    }
}