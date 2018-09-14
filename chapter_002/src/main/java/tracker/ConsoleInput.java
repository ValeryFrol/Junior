package tracker;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;


public class ConsoleInput implements Input {

    public Integer ask(String question, int[] range) throws MenuOutException {
        int key = Integer.valueOf(this.ask(question));

        boolean exist = false;
        for (int i = 0; i < range.length; i++) {
            if (key == range[i]) {
                exist = true;
                break;
            }
        }
        if (!exist) throw new MenuOutException("Неверный пункт меню");
        return key;
    }

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
