package tracker;

import java.io.IOException;
import java.util.Optional;

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
    private final Input input;


    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }


    /**
     * Основной цикл программы
     */
    public void init() {
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
                    String id = input.ask("Введите ID заявки, которую хотите заменить");
                    String name = input.ask("Введите новое имя заявки");
                    String description = input.ask("Введите новое описание заявки");
                    this.tracker.replace(id, name, description);
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

    private void createItem() {

        System.out.println("-------Добавление новой заявки-------");
        String name = this.input.ask("Введите имя заявки:");
        String description = this.input.ask("Введите описание заявки:");
        Item item = new Item(name, this.tracker.generateId(), description);
        this.tracker.add(item);
        System.out.println("---------Новая заявка с id: " + item.getiD() + "--------");
        System.out.println(item.getiD() + " " + item.getName() + " " + item.getDescription());

    }

    public void inputData() {

        String name = input.ask("Enter the task's name");
        tracker.add(new Item(name, "Description"));
        for (Item item : tracker.getAll()) {
            System.out.println(item.getName());
        }
    }

    /**
     * Запуск программы
     *
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}



