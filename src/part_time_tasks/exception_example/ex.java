package part_time_tasks.exception_example;

public class ex {
    public static void exampleFunction(){
        throw new RuntimeException("This is my exception from function");
    }
    public static void main(String[] args){
        try{
            exampleFunction();
        }catch (Exception e){
            System.out.println("Caught exception "+e.getMessage());
        }
    }
}
