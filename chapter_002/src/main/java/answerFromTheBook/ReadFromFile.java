package answerFromTheBook;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.lang.System.exit;

public class ReadFromFile {
    private Charset ch = Charset.forName("Utf-8");
    private Path pathIn = FileSystems.getDefault().getPath("C:\\Users\\Mrs. Hatti\\Documents\\For java projects", "Text.txt");

    BufferedReader brIn;
    public static String[] sentences;

    {
        try {
            brIn = Files.newBufferedReader(pathIn,ch);
            sentences = brIn.toString().split(",");
        } catch (IOException e) {
            System.out.print("Error while reading the file");
            exit(1);
        }
    }



}
