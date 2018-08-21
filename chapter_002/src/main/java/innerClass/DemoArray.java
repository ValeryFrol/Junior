package innerClass;

import java.util.ArrayList;

public class DemoArray {

    public static void invite(ArrayList<String> friends){

    }
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Maria");
        friends.add("John");
        friends.add("Maria");
        invite(new ArrayList<String>() {{add("sadas"); add("asdsadas");}}); //внешние фигурные скобки это анонимный подкласс Arraylist, внутренние скобки - блок конструирования
    }

}
