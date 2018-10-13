package soloTasksTest;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


import org.junit.Test;
import soloTasks.CharsInString;

import java.io.IOException;

public class CharsInStringTest {
    @Test
    public void whenEmptyStringInput() {
        try {
            assertThat(CharsInString.charsFromString("", 4), is("empty string"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void whenNoCharsReferToNumber() {
        try {
            assertThat(CharsInString.charsFromString("wwfjdkfhyrr", 3), is("no such characters"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void whenResultInEnd() {
        try {
            assertThat(CharsInString.charsFromString("wwfjdkfhyrrrr", 3), is("rrrr"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void whenResultInBeginning() {
        try {
            assertThat(CharsInString.charsFromString("wwwwwwfjdkfhyrrr", 5), is("wwwwww"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void whenBigNumber() {
        try {
            assertThat(CharsInString.charsFromString("wwwwwwfjdktttttfhyrrrrrrrrrrrrrrrrrrrr", 13), is("rrrrrrrrrrrrrrrrrrrr"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void whenTwoInARow() {
        try {
            assertThat(CharsInString.charsFromString("oopiipi", 2), is("ii"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void whenThreeInARow() {
        try {
            assertThat(CharsInString.charsFromString("oopiipuu", 2), is("uu"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void whenNumbers() {
        try {
            assertThat(CharsInString.charsFromString("ee22y33777777oo", 2), is("oo"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void whenNumbersAndSymbols() {
        try {
            assertThat(CharsInString.charsFromString("pppi999p999p==", 2), is("=="));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}




