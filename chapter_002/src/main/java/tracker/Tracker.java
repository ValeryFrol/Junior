package tracker;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранения заявок
     */
    private Item[] items = new Item[100];
    /**
     * Указатель на элемент массива
     */
    private int position = 0;

    public int getPosition() {
        return position;
    }

    public Item[] getItems() {
        return items;
    }

    /**
     * Метод добавления новой заявки
     *
     * @param item новая заявка
     * @return заявка
     */

    public Item add(Item item) {
        item.setiD(this.generateId());
        this.items[this.position++] = item;

        return item;
    }

   /**
     * Метод, который генерирует уникальный ключ для заявки в  хранилище
     *
     * @return уникальный кдюч
     */
    String generateId() {
        Random rand = new Random();
        Integer n = rand.nextInt(100) + 1;
        String iD = n.toString();
        return iD;
    }

    /*public void replace(String id, String name, String description) {

        Item item = new Item(name, id, description);
        for (int j = 0; j < position; j++) {
            if (this.items[j].getiD().equals(id)) {
                this.items[j] = item;
            }
        }

    }*/

    /*public void delete(String id) {

        for (int j = 0; j < position; j++) {
            if (this.items[j].getiD().equals(id)) {
                for (int i = j; i < position-1; i++) {
                    this.items[i] = this.items[i + 1];
                }
                items[position-1] = null;
                break;
            }
        }
        position--;

    }

    public void findAll() {
        for (int i = 0; i < position; i++) {
            System.out.println(items[i].getiD());
            System.out.println(items[i].getName());
            System.out.println(items[i].getDescription());
        }
    }

    public Item findByName(String name) {
        for (int j = 0; j < position; j++) {
            if (this.items[j].getName().equals(name)) {
                return this.items[j];
            }
        }
        return null;
    }

    public Item findByID(String id) {
        for (int j = 0; j < position; j++) {
            if (this.items[j] != null) {
                if (this.items[j].getiD().equals(id)) {
                    return this.items[j];
                }
            }
        }
        return null;
    }
*/
    /*public Item findByID(String id) {
        //   String id = ci.ask("Введите ID заявки, которую вы хотите найти");
        for (int j = 0; j < position; j++) {
            if (this.items[j] != null) {
                if (this.items[j].getiD().equals(id)) {
                    return this.items[j];
                }
            }
        }
        return null;
    }*/

    public Item[] getAll() {
        return Arrays.copyOf(items, position);
    }


}

