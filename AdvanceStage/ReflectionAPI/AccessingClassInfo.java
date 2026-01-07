package AdvanceStage.ReflectionAPI;

import java.util.Arrays;

class SampleClass {
    private int id;
    private String name;

    public SampleClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
public class AccessingClassInfo {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("AdvanceStage.ReflectionAPI.SampleClass");

            System.out.println("Class Name: " + cls.getName());

            System.out.println("Fields:");
            Arrays.stream(cls.getDeclaredFields()).forEach(field -> 
                System.out.println(" - " + field.getName() + " : " + field.getType().getSimpleName())
            );

            System.out.println("Methods:");
            Arrays.stream(cls.getDeclaredMethods()).forEach(method -> 
                System.out.println(" - " + method.getName() + " : " + method.getReturnType().getSimpleName())
            );

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
    }
}
}
