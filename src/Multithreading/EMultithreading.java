package Multithreading;

public class EMultithreading extends Thread {
    public void run(){
        System.out.println("thread is running..");
    }

    public static void main(String[] args) {
        EMultithreading t1=new EMultithreading();
        t1.start();
    }
}
