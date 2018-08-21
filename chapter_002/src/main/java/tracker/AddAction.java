package tracker;

public class AddAction implements UserAction {

    String key;
    String info;
    private final Input input = new ConsoleInput();
    private final Tracker tracker = new Tracker();

    public AddAction(String key, String info) {
        this.key = key;
        this.info = info;
    }

    @Override
    public String key() {
        return this.key;
    }

    @Override
    public void execute(Input input, Tracker tracker) {

        System.out.println("-------Добавление новой заявки-------");
        String name = input.ask("Введите имя заявки:");
        String description = input.ask("Введите описание заявки:");
        Item item = new Item(name, tracker.generateId(), description);
        tracker.add(item);
        System.out.println("---------Новая заявка с id: " + item.getiD() + "--------");
        System.out.println(item.getiD() + " " + item.getName() + " " + item.getDescription());
    }

    @Override
    public String info() {
        return this.info;
    }

}
