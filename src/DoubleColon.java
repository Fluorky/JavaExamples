
//in another one there was :: and why doesn't the call g(f::something) work and probably with inheritance

import java.util.function.Consumer;

@FunctionalInterface
    interface MyFunctionalInterface {
        void something();
    }

    // FirstClass class
    class FirstClass {
        public static void doSomething() {
            System.out.println("FirstClass is doing something.");
        }
    }

    // SecondClass class extending FirstClass
    class SecondClass extends FirstClass {
    public static void g(MyFunctionalInterface f) {
           f.something();
     }
       /* public void g(MyFunctionalInterface f) {
            f.something();
        }*/
    }


    // Example usage
    public class DoubleColon {
        public static void main(String[] args) {
            //was
            //g(Fisrtclass::doSomething);


            // Creating an instance of SecondClass
            SecondClass secondInstance = new SecondClass();

            SecondClass.g(FirstClass::doSomething);


            // Using the g method with a method reference to FirstClass's doSomething method
            secondInstance.g(FirstClass::doSomething);

            // Using the g method with a lambda expression
            secondInstance.g(() -> System.out.println("Lambda expression is doing something."));


        }
    }
