class UsingThreadClass extends Thread{
    
    @Override
    public void run() {
        System.out.println("Thread is running created by extending to parent Thread class");
    }

    public static void main(String[] args) {
        UsingThreadClass e1 = new UsingThreadClass();
        e1.start();
    }
}