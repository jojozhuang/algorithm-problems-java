package johnny.lintcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ArrayScoreTest extends JunitBase {

    @Test
    public void testArrayScore() {
        System.out.println("testArrayScore");
        ArrayScore instance = new ArrayScore();

        assertEquals(0, instance.arrayScore(ListUtil.buildList(new Integer[]{0, 1, 2, 3, 4}), 2,2,5));
    }
}
