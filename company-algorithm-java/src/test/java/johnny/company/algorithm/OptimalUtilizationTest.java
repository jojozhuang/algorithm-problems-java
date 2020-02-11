package johnny.company.algorithm;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class OptimalUtilizationTest extends JunitBase {

    @Test
    public void testGetPairs() {
        System.out.println("getPairs");
        OptimalUtilization instance = new OptimalUtilization();

        List<int[]> a1 = new ArrayList<>();
        a1.add(new int[]{1,2});
        a1.add(new int[]{2,4});
        a1.add(new int[]{3,6});

        List<int[]> b1 = new ArrayList<>();
        b1.add(new int[]{1,2});

        List<int[]> expect1 = new ArrayList<>();
        expect1.add(new int[]{2,1});

        List<int[]> result1 = instance.getPairs(a1, b1,7);

        assertEquals(expect1.size(), result1.size());

        for (int i = 0; i < expect1.size(); i++) {
            assertArrayEquals(expect1.get(i), result1.get(i));
        }

    }
}
