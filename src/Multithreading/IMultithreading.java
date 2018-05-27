package Multithreading;

public class IMultithreading implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is running....");
    }

    public static void main(String[] args) {
        IMultithreading m1=new IMultithreading();
        Thread t1=new Thread(m1);
        t1.start();
    }
}
