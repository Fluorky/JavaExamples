package part_time_tasks.o20o30;

public class o20 {
    int o;
    o20(int o){this.o=o;}
}
class o30 extends o20{
    //error, it does not compile, because
    //you must create matching constructor like this:
    o30(int o){
        super(o);
    }
}
