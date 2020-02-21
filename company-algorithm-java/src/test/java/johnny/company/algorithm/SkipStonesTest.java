package johnny.company.algorithm;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SkipStonesTest extends JunitBase {

    @Test
    public void testSkipStones() {
        System.out.println("SkipStones");
        SkipStones instance = new SkipStones();

        assertEquals(4, instance.getDistance(5,2, 25, Arrays.asList(19,3)));
        assertEquals(10, instance.getDistance(0,0, 10, Arrays.asList()));
    }
}
