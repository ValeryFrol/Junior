package tracker;

public class StartUITest {
    public static void main(String[] args) {
        String[] data = {"0", "Name", "Description", "1", "6"};
        Input input = new StubInput(data);
        new StartUI(input, new Tracker()).init();
    }
}
