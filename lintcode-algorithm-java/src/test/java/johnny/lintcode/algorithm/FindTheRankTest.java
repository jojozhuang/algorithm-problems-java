package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class FindTheRankTest extends JunitBase {

    /**
     * Test of FindTheRank method, of class FindTheRank.
     */
    @Test
    public void testFindTheRank() {
        System.out.println("testFindTheRank");
        FindTheRank instance = new FindTheRank();

        assertEquals(0, instance.FindTheRank(new int[][]{{90, 80, 70}, {90, 90, 90}, {60, 60, 60}}, 2));
        assertEquals(4, instance.FindTheRank(new int[][]{{73,80,32,1,49},{58,12,37,75,83},{18,7,10,92,13},{25,59,30,72,9},{16,57,31,96,96}}, 1));
    }
}
