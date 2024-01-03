package other;

final class ImmutableObject {
    private final String name;
    private final int value;

    public ImmutableObject(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}

public class ConstructorEx3 {
    public static void main(String[] args) {
        ImmutableObject object = new ImmutableObject("Example", 42);
        System.out.println("Name: " + object.getName() + ", Value: " + object.getValue());
    }
}
