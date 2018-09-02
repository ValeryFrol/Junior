package tracker;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class ValidateInput implements Input {

    private final Input input;

    public ValidateInput(final Input input) {
        this.input = input;
    }
    @Override
    public String ask(String question){
        return this.input.ask(question);
    }
    @Override
    public Integer ask(String question, int[] range) {
        int result = 0;
        boolean invalid = true;
        do {
            try {
                result = this.input.ask(question, range);
                invalid = false;
            } catch (MenuOutException menuEx) {
                System.out.println("Выберите пункт из меню");

            } catch (NumberFormatException numEx) {
                System.out.println("Wrong input");
            }
        }
        while (invalid);
        return result;
    }
}

