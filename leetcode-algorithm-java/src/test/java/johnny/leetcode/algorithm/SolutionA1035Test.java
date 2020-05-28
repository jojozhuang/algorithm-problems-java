package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1035Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("maxUncrossedLines");
        SolutionA1035 instance = new SolutionA1035();

        assertEquals(2, instance.maxUncrossedLines(new int[]{1,4,2}, new int[]{1,2,4}));
        assertEquals(3, instance.maxUncrossedLines(new int[]{2,5,1,2,5}, new int[]{10,5,2,1,5,2}));
        assertEquals(2, instance.maxUncrossedLines(new int[]{1,3,7,1,7,5}, new int[]{1,9,2,5,1}));
    }
}
