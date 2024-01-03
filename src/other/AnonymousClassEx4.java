package other;

public class AnonymousClassEx4 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
            }
        };

        Thread firstThread = new Thread(runnable, "Thread 1");
        Thread secondThread = new Thread(runnable, "Thread 2");

        firstThread.start();
        secondThread.start();
    }
}
