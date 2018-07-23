package trackerTest;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import tracker.*;

public class TrackerTest {
    @Test
    public void whenUserAddItemThenTrackerHasItem() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "Name", "Description", "1", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll()[0].getName(), is("Name"));
    }

    @Test
    public void whenUserChangeItemThenTrackerChanged() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Name2", "Description2"));
        Input input = new StubInput(new String[]{"2", item.getiD(), "Name10", "No description", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findByID(item.getiD()).getName(), is("Name10"));
    }
}
