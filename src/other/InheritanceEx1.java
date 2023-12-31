package other;

interface A {
    void methodA();
}

interface B {
    void methodB();
}

class ImplementationAB implements A, B {
    public void methodA() {
        System.out.println("Implementation of methodA()");
    }

    public void methodB() {
        System.out.println("Implementation of methodB()");
    }
}

public class InheritanceEx1 {
    public static class Main {
        public static void main(String[] args) {
            ImplementationAB implementation = new ImplementationAB();
            implementation.methodA();
            implementation.methodB();
        }
    }
}
