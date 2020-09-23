package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA3040Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("containsPattern");
        SolutionA3040 instance = new SolutionA3040();

        assertEquals(true, instance.containsPattern(new int[]{2,2},1,2));
        assertEquals(true, instance.containsPattern(new int[]{1,2,4,4,4,4},1,3));
        assertEquals(true, instance.containsPattern(new int[]{1,2,1,2,1,1,1,3},2,2));
        assertEquals(false, instance.containsPattern(new int[]{1,2,1,2,1,3},2,3));
        assertEquals(false, instance.containsPattern(new int[]{1,2,3,1,2},2,2));
        assertEquals(false, instance.containsPattern(new int[]{2,2,2,2},2,3));

        assertEquals(false, instance.containsPattern(new int[]{2,2,1,2,2,1,1,1,2,1},2,2));

    }
}
