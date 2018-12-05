package soloTasks;

import jdk.nashorn.internal.ir.Block;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;

public class Proccess implements Runnable {
    private BlockingQueue<Request> queue;
    private ArrayList<Request> processed;
    private ArrayList<Request> NOTprocessed;
    public Proccess(BlockingQueue<Request> queue,ArrayList<Request> processed,ArrayList<Request> NOTprocessed) {
        this.queue = queue;
        this.processed=processed;
        this.NOTprocessed=NOTprocessed;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Request request;
        while (!queue.isEmpty()) {
            try {
                request = queue.take();
                if (LocalTime.now().getSecond() - request.timeOfCreation.getSecond() <= 10) {
                    Thread.sleep(1000);
                    request.timeOfProccessing = LocalTime.now();
                    processed.add(request);
                }else{
                    NOTprocessed.add(request);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
