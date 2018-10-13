package soloTasks;

import java.io.IOException;

public class CharsInString {

    public static String charsFromString(String s, int number) throws IOException {
        int counter = 1;
        int charPositionStart = 0;
        int charPositionEnd = 0;
        try {
            if (s.length() == 0) {
                throw new IllegalArgumentException("not valid input, please enter characters");
            } else {
                for (int i = 0; i < s.toCharArray().length - 1; i++) {
                    if (s.charAt(i) == s.charAt(i + 1)) {
                        counter += 1;
                        if (counter == number) {
                            charPositionStart = i - counter + 2;
                            int j = i;
                            while (j != (s.length() - 1) && s.charAt(j + 1) == s.charAt(j)) {
                                counter += 1;
                                j += 1;
                            }
                            charPositionEnd = j + 1;
                        }
                    } else {
                        counter = 1;
                    }
                }
                if (charPositionEnd == 0) {
                    return "no such characters";
                } else {
                    return s.substring(charPositionStart, charPositionEnd);
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("enter please characters");
            return "empty string";
        }
    }

    /*public static void main(String[] args) {
        try {
            System.out.println(charsFromString("", 3));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}
