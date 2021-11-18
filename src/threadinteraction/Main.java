package threadinteraction;

public class Main {
    public static void main(String[] args) {
        // runWaitDemo();
        runThreadInteractionDemo();
    }

    static void runThreadInteractionDemo() {
        new ThreadInteractionDemo().runTest();
    }

    static void runWaitDemo() {
        new WaitDemo().runTest();
    }
}
