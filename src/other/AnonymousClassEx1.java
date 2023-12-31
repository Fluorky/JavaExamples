package other;


public class AnonymousClassEx1 {

        public static void main(String[] args) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("This is thread!");
                }
            });

            thread.start();
        }

}


