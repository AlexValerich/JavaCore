package lamda_2;

public class Worker {

    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }
    @FunctionalInterface
    public interface OnTaskErrorListener{
        void onError(String result);
    }

    private OnTaskDoneListener callback;
    private OnTaskErrorListener callbackError;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener callbackError) {
        this.callback = callback;
        this.callbackError = callbackError;
    }
    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) callbackError.onError("Task " + i + " error");
            callback.onDone("Task " + i + " is done");
        }
    }
}