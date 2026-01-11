public class ProcessExample {

    public static void main(String[] args) {

        System.out.println("Java process started");

        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");
        MyThread t3 = new MyThread("Thread-3");

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Main thread ended");
    }
}
