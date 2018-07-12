package tracker;

import java.io.IOException;

/**
 * @version 1.0
 */
public class StartUI {

    /**
     * Константа меню для добавления новой заявки
     */
    private static final int ADD = 0;
    /*
    Константа меню для вывода всех заявок
     */
    private static final int ALL = 1;
    /*
    Константа для редактирования заявки
     */
    private static final int EDIT = 2;
    /*
    Константа для удаления заявки
     */
    private static final int DELETE = 3;
    /*
    Константа для поиска по ID
     */
    private static final int FINDID = 4;
    /*
    КОнстанта для поиска по имени
     */
    private static final int FINDNAME = 5;
    /**
     * Константа меню для выхода из цикла
     */
    private static final int EXIT = 6;
    /**
     * Хранилище заявок
     */
    private final Tracker tracker;

    /**
     * Получение данных от пользователя
     */
    private final ConsoleInput input;


    /**
     * Конструктор, инициализирующий поля
     *
     * @param tracker хранилище заявок
     * @param input   ввод с клавиатуры
     */
    public StartUI(Tracker tracker, ConsoleInput input) {
        this.tracker = tracker;
        this.input = input;
    }


    /**
     * Основной цикл программы
     */
    public void init() throws IOException {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            int answer = Integer.valueOf(this.input.ask("Введите пункт меню"));
            switch (answer) {
                case ADD:
                    this.createItem();
                    break;
                case ALL:
                    this.tracker.findAll();
                    break;
                case EDIT:
                    this.tracker.replace();
                    break;
                case DELETE:
                    this.tracker.delete();
                    break;
                case FINDID:
                    this.tracker.findByID();
                    break;
                case FINDNAME:
                    this.tracker.findByName();
                    break;
                case EXIT:
                    exit = true;
                    break;
                default:
                    System.out.println("Введите верный пункт из меню");
            }


        }
    }

    private void showMenu() {
        System.out.println("------------Options-------------");
        System.out.println("Press 0 to add a new item");
        System.out.println("Press 1 to show all items");
        System.out.println("Press 2 to edit an item");
        System.out.println("Press 3 to delete an item");
        System.out.println("Press 4 to find an item by ID");
        System.out.println("Press 5 to find an item by name");
        System.out.println("Press 6 to exit the program");
        System.out.println("Select:");
    }

    private void createItem() throws IOException {
        System.out.println("-------Добавление новой заявки-------");
        String name = this.input.ask("Введите имя заявки:");
        String description = this.input.ask("Введите описание заявки:");
        Item item = new Item(name, this.tracker.generateId(), description);
        this.tracker.add(item);
        System.out.println("---------Новая заявка с id: " + item.getiD() + "--------");

    }


    /**
     * Запуск программы
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {
        new StartUI(new Tracker(), new ConsoleInput()).init();

    }


}
