// in another one there was a constructor for inheritance and why it doesn't work in the base one there was an int in constructor(int cos) but not in the derivative (classes l1111 and l11111)
//

// L1111 class
class L1111 {
    private int number;

    public L1111(int number) {
        this.number = number;
    }

    /*public int getNumber() {
        return number;
    }

    public void displayInfo() {
        System.out.println("L1111 Number: " + number);
    }*/
}

// L11111 class extending L1111
class L11111 extends L1111 {
    private String description;

    public L11111(int number, String description) {
        super(number);
        this.description = description;
    }
    //why this code don't work
    /*public L11111() {

    }*/


    //unnecessary code
   /* public String getDescription() {
        return description;
    }

    // Override displayInfo() to include L11111-specific information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the displayInfo() method of the parent class

        System.out.println("L11111 Description: " + description);
    }*/
}

// Example usage
public class LsClass {
    public static void main(String[] argsda) {
        // Creating an instance of the L11111 class
        L11111 l11111Instance = new L11111(123, "Sample Description");

        // Displaying information using the overridden displayInfo() method
       // l11111Instance.displayInfo();
    }
}
