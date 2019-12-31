package johnny.leetcode.algorithm;

import johnny.leetcode.algorithm.SolutionA1197;
import johnny.leetcode.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionA1197Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("maximumSum");
        SolutionA1197 instance = new SolutionA1197();

        //assertEquals(4, instance.nthUglyNumber(3, 2,3,5));
        assertEquals(3, instance.nthUglyNumber(2,2,3,5));
        assertEquals(4, instance.nthUglyNumber(3, 2,3,5));
        assertEquals(5, instance.nthUglyNumber(4, 2,3,5));
        assertEquals(6, instance.nthUglyNumber(5, 2,3,5));
        assertEquals(8, instance.nthUglyNumber(6,2,3,5));
        assertEquals(9, instance.nthUglyNumber(7,2,3,5));
        assertEquals(10, instance.nthUglyNumber(8,2,3,5));
        assertEquals(12, instance.nthUglyNumber(9,2,3,5));
        assertEquals(15, instance.nthUglyNumber(10,2,3,5));
        assertEquals(402653184, instance.nthUglyNumber(1351, 2,3,5));


        assertEquals(6, instance.nthUglyNumber(4, 2,3,4));
        //assertEquals(10, instance.nthUglyNumber(5, 2,3,13));
        //assertEquals(1999999984, instance.nthUglyNumber(1000000000, 2,217983653,336916467));


    }
}
