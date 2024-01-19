package part_time_tasks.EE_k2_two_colons;

@FunctionalInterface
interface I {
    void f();
}

public class EE {
    static void h() {}
}

class k2 {
    static void g(I i) {i.f();}

    public static void main(String[] args) {
        g(EE::h);
    }
}
