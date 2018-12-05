package soloTasks;

import java.util.ArrayList;

public class BookList extends GeneralList {
    protected String type ="book";
    protected ArrayList<String> items;

    protected void print(){
        System.out.println("book");
    }
}
