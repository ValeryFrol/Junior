package tracker;

import java.util.List;

public interface Input {

    Integer ask(String question, int[] range);
    String ask(String question);
}
