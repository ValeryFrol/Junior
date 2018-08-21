package readAndWriteFile;


import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FilesNewBufferedWriter {
    public static void main(String[] args) {
        Path logFile = Paths.get("app.log");
        try (BufferedWriter writer =
                     Files.newBufferedWriter(logFile, StandardCharsets.UTF_8,
                             StandardOpenOption.APPEND)) {

            for (int i = 0; i < 10; i++) {
                writer.write(String.format("Message %s%n", i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
