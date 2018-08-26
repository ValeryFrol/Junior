package tracker;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;


public class ConsoleInput implements Input {

    public Integer ask(String question, int[] range) throws MenuOutException {
        int result = 0;
        try {
            System.out.println(question);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            result = br.read();
        } catch (Exception e) {
            System.out.println("Error");
        }
        return result;
    }
    public String ask(String question)  {
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
