package tracker;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.exit;


public class MenuTracker {
    private Input input;
    private Tracker tracker;
    private List<UserAction> actions = new ArrayList<>();

    MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Метод, который заполняет массив
     */

    public void fillActions() {
        this.actions.add(new AddAction("0", "Add item"));
        this.actions.add(new ShowItems("1", "Show all items"));
        this.actions.add(new MenuTracker.EditItem("2", "Edit item"));
        this.actions.add(new MenuTracker.DeleteItem("3", "Delete item"));
        this.actions.add(new FindItemById("4", "Find item by id"));
        this.actions.add(new FindItemsByName("5", "Find items by name"));
        this.actions.add(new ExitProgram("6", "Exit program"));
    }

    public int getLength() {
        return actions.size();
    }

    /**
     * создаем внутренние классы на каждое действие с заявкой
     */
    static class AddAction implements UserAction {
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

    static class ShowItems implements UserAction {
        String key;
        String info;
        private final Input input = new ConsoleInput();
        private final Tracker tracker = new Tracker();

        public ShowItems(String key, String info) {
            this.key = key;
            this.info = info;
        }

        @Override
        public String key() {
            return this.key;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            for (int i = 0; i < tracker.getPosition(); i++) {
                System.out.println(tracker.getItems()[i].getiD());
                System.out.println(tracker.getItems()[i].getName());
                System.out.println(tracker.getItems()[i].getDescription());
            }
        }

        @Override
        public String info() {
            return this.info;
        }
    }

    class EditItem implements UserAction {
        String key;
        String info;
        private final Input input = new ConsoleInput();
        private final Tracker tracker = new Tracker();

        public EditItem(String key, String info) {
            this.key = key;
            this.info = info;
        }

        @Override
        public String key() {
            return this.key;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Введите ID заявки");
            String name = input.ask("Введите новое имя");
            String description = input.ask("Введите новое описание");
            Item item = new Item(name, id, description);
            for (int j = 0; j < tracker.getPosition(); j++) {
                if (tracker.getItems()[j].getiD().equals(id)) {
                    tracker.getItems()[j] = item;
                }
            }
        }

        @Override
        public String info() {
            return this.info;
        }
    }

    class DeleteItem implements UserAction {
        String key;
        String info;
        private final Input input = new ConsoleInput();
        private final Tracker tracker = new Tracker();

        public DeleteItem(String key, String info) {
            this.key = key;
            this.info = info;
        }

        @Override
        public String key() {
            return this.key;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Введите id заявки, которую хотите удалить");
            int position = tracker.getPosition();
            for (int j = 0; j < position; j++) {
                if (tracker.getItems()[j].getiD().equals(id)) {
                    for (int i = j; i < position - 1; i++) {
                        tracker.getItems()[i] = tracker.getItems()[i + 1];
                    }
                    tracker.getItems()[position - 1] = null;
                    break;
                }
            }
            position--;

        }

        @Override
        public String info() {
            return this.info;
        }
    }

    static class FindItemById implements UserAction {
        String key;
        String info;
        private final Input input = new ConsoleInput();
        private final Tracker tracker = new Tracker();

        public FindItemById(String key, String info) {
            this.key = key;
            this.info = info;
        }

        @Override
        public String key() {
            return this.key;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Введите ID искомой заявки");
            for (int j = 0; j < tracker.getPosition(); j++) {
                if (tracker.getItems()[j] != null) {
                    if (tracker.getItems()[j].getiD().equals(id)) {
                        System.out.println(tracker.getItems()[j].getiD() + " " + tracker.getItems()[j].getName() + " " + tracker.getItems()[j].getDescription());
                    }
                }
            }

        }
        @Override
        public String info() {
            return this.info;
        }
    }

        static class FindItemsByName implements UserAction {
            String key;
            String info;
            private final Input input = new ConsoleInput();
            private final Tracker tracker = new Tracker();

            public FindItemsByName(String key, String info) {
                this.key = key;
                this.info = info;
            }

            @Override
            public String key() {
                return this.key;
            }

            @Override
            public void execute(Input input, Tracker tracker) {
                String name = input.ask("Введите название искомой заявки");
                for (int j = 0; j < tracker.getPosition(); j++) {
                    if (tracker.getItems()[j].getName().equals(name)) {
                        System.out.println(tracker.getItems()[j].getiD() + " " + tracker.getItems()[j].getName() + " " + tracker.getItems()[j].getDescription());
                        ;
                    }
                }
            }
            @Override
            public String info() {
                return this.info;
            }
        }
            static class ExitProgram implements UserAction {
                String key;
                String info;
                private final Input input = new ConsoleInput();
                private final Tracker tracker = new Tracker();

                public ExitProgram(String key, String info) {
                    this.key = key;
                    this.info = info;
                }

                @Override
                public String key() {
                    return this.key;
                }

                @Override
                public void execute(Input input, Tracker tracker) {
                    exit(0);
                }
            @Override
            public String info() {
                return this.info;
            }
        }

        /**
         * Метод в зависимости от ключа выбирает действие
         *
         * @param key ключ операции
         */
        public void select(String key) {
            this.actions.get(Integer.parseInt(key)).execute(this.input, this.tracker);
        }

        public void show(){
            for (UserAction action:this.actions
                 ) {
                if(action!=null)System.out.println(action.info());
            }
        }


    }
