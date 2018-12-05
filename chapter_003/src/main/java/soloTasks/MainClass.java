package soloTasks;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        GeneralList gl = new GeneralList();
        GeneralList fl = new FilmList();
        GeneralList bl = new BookList();
        FilmList fl2 = new FilmList();
        BookList bl2 = new BookList();

        ArrayList<GeneralList> x = new ArrayList<>();
        x.add(new FilmList());
        x.add(new BookList());

        x.get(0).print();
        x.get(1).print();

        gl.print();
        fl.print();
        bl.print();
        fl2.print();
        bl2.print();
        System.out.println(gl.type);
        System.out.println(((FilmList) fl).type);
        System.out.println(((BookList) bl).type);
        System.out.println(fl2.type);
        System.out.println(bl2.type);
    }


}
