package AdvanceStage.ReflectionAPI;
import java.lang.reflect.Constructor;
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

public class AccessingConstructor {
    public static void main(String[] args) {
        Constructor<?>[] constructors = cls.class.getDeclaredConstructors();

        for (Constructor<?> c : constructors) {
            System.out.println(c);
        }
    }
}
