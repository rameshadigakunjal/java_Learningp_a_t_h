package IntermediateStage.Generics;

class Box<T> {
    private T t;

    public void setValue(T t) {
        this.t = t;
    }

    public T getValue() {
        return t;
    }
}

public class GenericsClassExample {
    public static void main(String[] args) {
       Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello Java");
        System.out.println(stringBox.getValue());

        Box<Integer> intBox = new Box<>();
        intBox.setValue(100);
        System.out.println(intBox.getValue());

    }
}
