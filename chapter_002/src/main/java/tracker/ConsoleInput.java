package tracker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ConsoleInput implements Input {

    public String ask(String question) {
        String result = "empty";
        try {
            System.out.println(question);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            result = br.readLine();
        } catch (Exception e) {
            System.out.println("Error");
        }
        return result;
    }
}
