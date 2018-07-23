package optionalRules;

import java.util.Scanner;

public class CustomerImitation {

    public static void main(String[] args) {
        System.out.println("Добрый день! Начните оформление заказа. Внесите название товаров, которые вы хотите заказать: ");
        Scanner sc = new Scanner(System.in);
        Order order = new Order(new Thing("name1"), new Thing("nam2"), null);
        order.addThing(new Thing("name3"));
        System.out.println("Ваш заказ: ");
        order.showThings();
    }
}

