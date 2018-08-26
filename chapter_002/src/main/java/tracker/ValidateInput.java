package tracker;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class ValidateInput extends ConsoleInput {
    int[] range;
    @Override
    public Integer ask(String question, int[] range) {
        MenuOutException menuEX = new MenuOutException("Enter the right number from the menu");
        int result = 0;
        this.range = range;
        try {
            System.out.println(question);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            result = br.read();
            for(int i=0;i<this.range.length;i++)
                if(!(result == this.range[i])){
                throw menuEX;
                  }

        } catch (MenuOutException menuEx) {
            System.out.println(menuEx.messageException);
            ask(question, range);
        } catch (IOException ioEx) {
            System.out.println("Wrong input");
        }
        return result;
    }
}

