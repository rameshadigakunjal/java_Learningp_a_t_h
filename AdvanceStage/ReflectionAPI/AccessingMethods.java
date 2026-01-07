package AdvanceStage.ReflectionAPI;
class cls {
    private int id;
    private String name;

    public cls(int id, String name) {
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
public class AccessingMethods {
    public static void main(String[] args) {
        java.lang.reflect.Method[] methods = cls.class.getDeclaredMethods();
        for (java.lang.reflect.Method method : methods) {
            System.out.println(method);
        }
    }
}
