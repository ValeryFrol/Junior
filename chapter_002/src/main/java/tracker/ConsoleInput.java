package tracker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ConsoleInput {

    public String ask(String question) throws IOException { //спросить про try catch и про то, почему переменную из него не видно в return?
        System.out.println(question);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = br.readLine();
        return result;
    }
}
