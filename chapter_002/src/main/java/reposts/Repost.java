package reposts;

import nobel.Parser;

import java.io.File;
import java.util.HashMap;

public class Repost {
    public static void main(String[] args) {
        File name = new File("C:\\Users\\Mrs. Hatti\\Documents\\For java projects\\Reposts.xls");
        HashMap hm = reposts.Parser.parse(name);
        System.out.println(hm.get("ЯндексЛицей опубликовал пост, количество просмотров: 15"));

    }

}
