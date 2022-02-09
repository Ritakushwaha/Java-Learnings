public class ImplementingRunnableInterface implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is running created by implementing Runnable interface.");
    }

    public static void main(String[] args) {
        ImplementingRunnableInterface e2 = new ImplementingRunnableInterface();
        Thread t1 = new Thread(e2);
        t1.start();
    }
}
