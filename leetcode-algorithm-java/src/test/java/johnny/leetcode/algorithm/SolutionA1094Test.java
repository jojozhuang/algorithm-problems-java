package johnny.leetcode.algorithm;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SolutionA1094Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("carPooling");
        SolutionA1094 instance = new SolutionA1094();

        assertEquals(false, instance.carPooling(new int[][]{{2,1,5},{3,3,7}}, 4));
        assertEquals(true, instance.carPooling(new int[][]{{2,1,5},{3,3,7}}, 5));
        assertEquals(true, instance.carPooling(new int[][]{{2,1,5},{3,5,7}}, 3));
        assertEquals(true, instance.carPooling(new int[][]{{3,2,7},{3,7,9},{8,3,9}}, 11));
    }
}
