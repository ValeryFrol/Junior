package lists;


public class FilmList extends ListList{


String name = "Film";
void add(){

}


    public static void main(String[] args) {
        ListList jj=new FilmList();
        jj.add("jjj");
        jj.print(0);
        System.out.println(((FilmList) jj).name);
        System.out.println(((FilmList) jj).name);
        ListList ddd = new FilmList();


    }
}

