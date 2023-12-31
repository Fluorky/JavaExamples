package other;

class Parent {
    String name;

    public Parent(String name) {
        this.name = name;
    }
}

class Child extends Parent {
    int age;

    public Child(String name, int age) {
        super(name);
        this.age = age;
    }
}

public class ConstructorEx1 {
    public static void main(String[] args) {
        Child child = new Child("John", 5);
        System.out.println("Name: " + child.name + ", Age: " + child.age);
    }
}
