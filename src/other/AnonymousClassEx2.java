package other;

interface Processor {
    void processData(String data);
}

public class AnonymousClassEx2 {
    public static void main(String[] args) {
        Processor lambdaProcessor = data -> System.out.println("Processing data: " + data);

        Processor anonymousClassProcessor = new Processor() {
            @Override
            public void processData(String data) {
                System.out.println("Processing data differently: " + data);
            }
        };

        lambdaProcessor.processData("Data using lambda");
        anonymousClassProcessor.processData("Data using anonymous class");
    }
}
