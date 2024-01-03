package other;

abstract class Container<T> {
    private T content;

    public Container(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    abstract void printInfo();
}

class SpecificContainer extends Container<String> {
    public SpecificContainer(String content) {
        super(content);
    }

    @Override
    void printInfo() {
        System.out.println("Content: " + getContent());
    }
}

public class InheritanceEx2 {
    public static void main(String[] args) {
        SpecificContainer container = new SpecificContainer("Sample content");
        container.printInfo();
    }
}
