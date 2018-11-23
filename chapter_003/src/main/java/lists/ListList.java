package lists;

import java.util.ArrayList;

public abstract class ListList {
    ArrayList<String> items = new ArrayList<>();

    String id;
    void add(String item){
        items.add(item);
    }
    void remove (String item){
        items.remove(item);

    }
    void change(String oldItem, String newItem){
        items.set(items.indexOf(oldItem),newItem);
    }
    void print(int g){
        System.out.println(items.get(g));
    }


}