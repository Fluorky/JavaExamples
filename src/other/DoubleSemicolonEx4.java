package other;

import java.util.function.Supplier;

class MyClass {
    private String message;

    public MyClass() {
        this.message = "Default Message";
    }

    public MyClass(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}



public class DoubleSemicolonEx4 {
    public static void main(String[] args) {
        // Constructor reference
        Supplier<MyClass> defaultInstance = MyClass::new;
        Supplier<MyClass> customInstance = () -> new MyClass("Custom Message");

        MyClass obj1 = defaultInstance.get();
        MyClass obj2 = customInstance.get();

        System.out.println(obj1.getMessage());
        System.out.println(obj2.getMessage());
    }
}
