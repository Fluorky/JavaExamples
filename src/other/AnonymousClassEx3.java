package other;

interface Task {
    void execute();
}

public class AnonymousClassEx3 {
    public static void main(String[] args) {
        Task task = new Task() {
            @Override
            public void execute() {
                System.out.println("This is a task using an anonymous class.");
            }
        };

        task.execute();

        //lambda solution

        Task test = ()->System.out.print("TEST");
        test.execute();
    }
}
