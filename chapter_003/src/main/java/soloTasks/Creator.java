package soloTasks;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;


public class Creator implements Runnable {
    private BlockingQueue<Request> queue;

    public Creator(BlockingQueue<Request> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
                Request request = new Request(LocalTime.now());
                queue.add(request);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
