package lamda_2;

public class Main {
    public static void main(String[] args) {
        Worker.OnTaskDoneListener listener = System.out::println;
        Worker.OnTaskErrorListener errorListener = System.out::println;

        var worker = new Worker(listener, errorListener);



        worker.start();
    }
}
