class X {
    //this block of code is empty
    int i = 3;
    int f(){
        return 0;
    }
    X(){System.out.println(f());}
}
class Y extends X {
    int i = super.i+1;
    int f(){
        return(super.f()+super.i);
    }
    Y(){System.out.println(f());}


}
public class Main {
    public static void main(String[] args) {
       // X x1 = new X();
        System.out.println("   ...    ");
        X x = new Y();
        //System.out.println("   ...    ");
        //Y y = new Y();
        System.out.println("   *...*    ");
        //System.out.println(x1.i+" "+x1.f());
        //System.out.println("   ...    ");
        System.out.println(x.i+" "+x.f());
        System.out.println("   ...    ");
        //System.out.println(y.i+" "+y.f());
        //Must be 3 3
    }
}