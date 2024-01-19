package part_time_tasks.protect;

import part_time_tasks.protect.b.c.*;

class A extends C {

    protected void a() {
        System.out.println("a");
        b(); // work
        c(); // work
    }

}
public class MainClass {
    public static void main(String[] data) {
        A a = new A();
        a.a();
        //a.b(); //It does not compile. java: b() has protected access in part_time_tasks.protect.b.B
        //a.c(); //It does not compile. java: c() has protected access in part_time_tasks.protect.b.c.C
    }



}
