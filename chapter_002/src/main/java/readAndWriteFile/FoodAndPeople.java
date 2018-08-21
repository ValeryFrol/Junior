package readAndWriteFile;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;

public class FoodAndPeople {
    public static Charset ch = Charset.forName("UTF-8");
    public static Path pathIn = FileSystems.getDefault().getPath("C:\\Users\\Mrs. Hatti\\Documents\\For java projects", "Input.txt");
    public static Path pathOut = FileSystems.getDefault().getPath("C:\\Users\\Mrs. Hatti\\Documents\\For java projects", "Output.txt");
    public static BufferedReader brIn;
    public static BufferedWriter brOut;

    public static void main(String[] args) throws IOException {
        String[] input = new String[50];
        int position = 0;
        int counter = 0;
        int max = 0;
        String maxName = null;

        //File file = new File("C:\\Users\\Mrs. Hatti\\Documents\\For java projects", "Input.txt");
        brIn = Files.newBufferedReader(pathIn, ch);
        String line = null;
        while ((line = brIn.readLine()) != null) {
            System.out.println(line);
            input[position++] = line;
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

        //System.out.println(name);
        //System.out.println(x);

        System.out.println(maxName + " несет " + max + " продуктов");
        brOut = Files.newBufferedWriter(pathOut, ch, StandardOpenOption.WRITE);
        brOut.write(maxName + " несет " + max + "продуктов");

    }
}
