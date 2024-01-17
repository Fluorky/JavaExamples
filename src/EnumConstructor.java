enum Size {

    // enum constants calling the enum constructors
    SMALL(20,"The size is small."),
    MEDIUM(30,"The size is medium."),
    LARGE(40,"The size is large."),
    EXTRALARGE(50,"The size is extra large.");


    //Solution number one
    Size(int size, String pizzaSize) {

    }

    //Solution number two (full working)

   /* private final String pizzaSize;
    private final int size;

    // private enum constructor
    private Size(int size, String pizzaSize) {
        this.pizzaSize = pizzaSize;
        this.size = size;
    }

    public String getSize() {
        return pizzaSize;
    }
    public int getSizeCm()
    {
        return size;
    }*/

}
class EnumConstructor {
    public static void main(String[] args) {
        Size size = Size.SMALL;
       // System.out.println(size.getSize()+" " + size.getSizeCm());
    }
}
