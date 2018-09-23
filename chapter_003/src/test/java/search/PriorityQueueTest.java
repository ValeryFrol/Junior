package search;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import java.util.List;

public class PriorityQueueTest {
    @Test
    public void whenHigherPriority() {
        PriorityQueue pQueue = new PriorityQueue();
        pQueue.put(new Task("low", 5));
        pQueue.put(new Task("urgent", 1));
        pQueue.put(new Task("middle", 3));
        Task result = pQueue.take();
        assertThat(result.getDescription(), is("urgent"));

    }


}
