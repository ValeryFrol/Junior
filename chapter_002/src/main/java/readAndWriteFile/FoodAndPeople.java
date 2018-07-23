package readAndWriteFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.file.*;

public class FoodAndPeople {
    public static Charset ch = Charset.forName("UTF-8");
    public static Path pathIn = FileSystems.getDefault().getPath("C:\\Users\\Mrs. Hatti\\Documents\\For java projects", "Input.txt");
    public static Path pathOut = FileSystems.getDefault().getPath("C:\\Users\\Mrs. Hatti\\Documents\\For java projects", "Output.txt");
    public static BufferedReader brIn;
    public static BufferedWriter brOut;

    public static void main(String[] args) {
        String[] input = new String[50];
        int position = 0;
        int counter = 0;
        int max = 0;
        String maxName = null;
        try {
            brIn = Files.newBufferedReader(pathIn, ch);
            while (brIn.readLine() != null) {
                System.out.println(brIn.readLine());
                input[position++] = brIn.readLine();

            }
            for (int i = 0; i < position; i++) {
                String name = input[i].substring(input[i].lastIndexOf(":") + 1);
                for (int j = 0; j < position; j++) {
                    if (name.equals(input[j].substring(input[j].lastIndexOf(":") + 1))) {
                        counter++;
                    }
                    if (counter > max) {
                        max = counter;
                        maxName = name;
                    }
                }
                counter = 0;
            }
        }
        //System.out.println(name);
        //System.out.println(x);

        catch (IOException e) {
            System.out.println("Ошибка ввода");
        }
        System.out.println(maxName + " несет " + max + " продуктов");
        try {
            brOut = Files.newBufferedWriter(pathOut, ch, StandardOpenOption.APPEND);
            brOut.write(maxName + " несет " + max + "продуктов");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
