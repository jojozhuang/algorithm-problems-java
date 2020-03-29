package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1395Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numTeams");
        SolutionA1395 instance = new SolutionA1395();

        assertEquals(3, instance.numTeams(new int[]{2,5,3,4,1}));
        assertEquals(0, instance.numTeams(new int[]{2,1,3}));
        assertEquals(4, instance.numTeams(new int[]{1,2,3,4}));
    }
}
