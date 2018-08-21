package trackerTest;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import tracker.*;

import java.util.Optional;

public class TrackerTest {
    Tracker tracker = new Tracker();
   @Before
    public void addItems() {

        for (int i = 0; i <= 10; i++) {
            String name = "Name" + i;
            String description = "Description" + i;
            tracker.add(new Item(name, description));
        }
    }

   /* @Test
    public void whenUserAddItemThenTrackerHasItem() {

        Input input = new StubInput(new String[]{"0", "Name", "Description", "1", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll()[10].getName(), is("Name"));
    }*/

    @Test
    public void whenUserChangeItemThenTrackerChanged() {

        //Item item = tracker.add(new Item("Name2", "Description2"));
        Input input = new StubInput(new String[]{"2", tracker.getAll()[1].getiD(), "Name10", "No description", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findByID(tracker.getAll()[1].getiD()).getName(), is("Name10"));
    }
    @Test
    public void whenDeleteItemThatNoItem() {

      //  Item item = tracker.add(new Item("Name4", "Description4"));
        Input input = new StubInput(new String[]{"3",tracker.getAll()[4].getiD(), "6"});
        new StartUI(input, tracker).init();
        Optional<Item> opItem= Optional.ofNullable(tracker.findByName("Name4"));
        assertFalse(opItem.isPresent());
    }

    @Test
    public void whenFindByIdThatFind() {
        //  Item item = tracker.add(new Item("Name4", "Description4"));
        Input input = new StubInput(new String[]{"4", tracker.getAll()[2].getiD(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findByID(tracker.getAll()[2].getiD()).getName(), is("Name2"));
    }


}
