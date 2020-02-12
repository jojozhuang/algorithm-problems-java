package johnny.company.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FindPairWithGivenSumTest extends JunitBase {

    @Test
    public void testTwoSumPair() {
        System.out.println("twoSumPair");
        FindPairWithGivenSum instance = new FindPairWithGivenSum();

        assertArrayEquals(new int[]{2,3}, instance.twoSumPair(new int[]{1, 10, 25, 35, 60}, 90));
        assertArrayEquals(new int[]{1,5}, instance.twoSumPair(new int[]{20, 50, 40, 25, 30, 10}, 90));
        assertArrayEquals(new int[]{0,2}, instance.twoSumPair(new int[]{50, 20, 10, 40, 25, 30}, 90));
        assertArrayEquals(new int[]{-1,-1}, instance.twoSumPair(new int[]{1,2}, 90));
        assertArrayEquals(new int[]{0,1}, instance.twoSumPair(new int[]{0,0}, 30));
    }
}
