package johnny.company.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoSumUniquePairsTest extends JunitBase {

    @Test
    public void testUniquePairs() {
        System.out.println("uniquePairs");
        TwoSumUniquePairs instance = new TwoSumUniquePairs();

        assertEquals(2, instance.uniquePairs(new int[]{1, 1, 2, 45, 46, 46}, 47));
        assertEquals(1, instance.uniquePairs(new int[]{1, 1}, 2));
        assertEquals(1, instance.uniquePairs(new int[]{1, 5, 1, 5}, 6));
        assertEquals(0, instance.uniquePairs(new int[]{1, 2, 4}, 8));
    }
}
