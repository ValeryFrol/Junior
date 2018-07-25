package flowers;

public class Flowers {
    public String color;
    public String name;
    public int price;
    Flowers[] flowers = new Flowers[10];
    private int position = 0;
    private int totalSum = 0;

    public int getTotalSum() {
        return totalSum;
    }

    Flowers(String color, int price, String name) {
        this.color = color;
        this.price = price;
        this.name = name;
    }

    public Flowers() {  //почему обязательно просит создать пустой конструктор?

    }

    public void getBuoquet(Flowers flower, int quantity) {
        flowers[position++] = flower;
        totalSum = totalSum + flower.price * quantity;
    }

    public void showBuoquet() {
        System.out.println(totalSum);
        for (int i = 0; i < position; i++) {
            System.out.println(flowers[i].name);
        }
    }


}

