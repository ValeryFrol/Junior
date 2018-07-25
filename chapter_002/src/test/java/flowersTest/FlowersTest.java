package flowersTest;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import flowers.Flowers;
import flowers.Roses;
import flowers.Tulip;
import org.junit.Test;
import tracker.*;

public class FlowersTest {
    @Test
    public void testTheBuoquet(){
        Flowers flower = new Flowers();
        flower.getBuoquet(new Roses("red", 120,"rose"),100);
        flower.getBuoquet(new Tulip("yellow", 100,"tulip"),100);
        assertThat(flower.getTotalSum(),is(22000));

    }
}
