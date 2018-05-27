package Multithreading;
import java.util.Random;
public class PrintTask implements Runnable {
    private final int sleeptime;
    private final String taskname;
    private final static Random generator = new Random();

    public PrintTask(String tname) {
        taskname = tname;
        sleeptime = generator.nextInt(5000);
    }

    public void run() {
        try {
            System.out.println(taskname + " is going to sleep for " + sleeptime + " milliseconds.");
            Thread.sleep(sleeptime);
        } catch (InterruptedException exception) {
            System.out.println(taskname + " terminated due to interrupltion");
        }
        System.out.println(taskname + "done sleeping.");
    }

    public static void main(String[] args) {
        System.out.println("Creating threads");
        Thread t1=new Thread(new PrintTask("Task1"));
        Thread t2=new Thread(new PrintTask("Task2"));
        Thread t3=new Thread(new PrintTask("Task3"));
        System.out.println("Threads created, starting tasks");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Tasks started main ends");
    }
}
