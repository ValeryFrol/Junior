package strategyTest;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import strategy.Paint;
import strategy.Square;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class StrategyTest {

    //Поле содержит дефолтный вывод в консоль
    private final PrintStream stdout = System.out;

    //буфер для результата
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    @Before
    public void loadToBufferOutput(){
        System.setOut(new PrintStream(this.out));
    }
    @After
    public void backOutput(){
        System.setOut(this.stdout);
    }
    @Test
    public void whenDrawSquare(){
        Square sq = new Square();
        assertThat(sq.draw(),is(new StringBuilder()
                .append("####")
                .append("#  #")
                .append("####").toString()));
    }
    @Test
    public void whenDrawPicture(){

        new Paint().draw(new Square());
        //проверка
        assertThat(new String(out.toByteArray()),is(new StringBuilder()
                .append("####")
                .append("#  #")
                .append("####")
                .append(System.lineSeparator())
                .toString()));
    }


}
