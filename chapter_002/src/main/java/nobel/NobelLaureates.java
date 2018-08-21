package nobel;

import java.io.File;
import java.util.Scanner;

public class NobelLaureates {

    public static void main(String[] args) {
        File nobel = new File("C:\\Users\\Mrs. Hatti\\Documents\\For java projects\\Nobel.xls");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(Parser.parse(nobel).get(name));
    }
}
