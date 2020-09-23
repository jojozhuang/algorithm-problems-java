package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA3061Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("containsPattern");
        SolutionA3061 instance = new SolutionA3061();

        int[][] mat1 = {
                {1,0,0},
                {0,0,1},
                {1,0,0}};
        assertEquals(1, instance.numSpecial(mat1));

    }
}
