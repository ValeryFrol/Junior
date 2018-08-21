package tracker;

public class ReplaceAction implements UserAction {
    String key;
    String info;

    public ReplaceAction(String key, String info) {
        this.key = key;
        this.info = info;
    }

    @Override
    public String key() {
        return this.key;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String id = input.ask("Введите ID заявки, которую хотите заменить");
        String name = input.ask("Введите новое имя заявки");
        String description = input.ask("Введите новое описание заявки");
        Item item = new Item(name, id, description);
        /*for (int j = 0; j < ; j++) {
            if (this.items[j].getiD().equals(id)) {
                this.items[j] = item;
            }
        }*/

    }

    @Override
    public String info() {
        return this.info;
    }
}
