package soloTasks;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MainClass2 {
    public static void main(String[] args) {
        BlockingQueue queue = new ArrayBlockingQueue(500);
        ArrayList<Request> processed = new ArrayList<>();
        ArrayList<Request> NOTprocessed = new ArrayList<>();
        Thread t1 = new Thread(new Creator(queue));
        Thread t2 = new Thread(new Creator(queue));
        Thread t3 = new Thread(new Creator(queue));
        Thread t4 = new Thread(new Creator(queue));
        Thread t5 = new Thread(new Creator(queue));

        Thread t6 = new Thread(new Proccess(queue,processed,NOTprocessed));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        try {
            t6.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Processed "+processed.size()+", not processed "+NOTprocessed.size());



    }
}
