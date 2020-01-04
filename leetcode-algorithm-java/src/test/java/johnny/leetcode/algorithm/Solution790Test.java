package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution790Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numTilings");
        Solution790 instance = new Solution790();

        assertEquals(5, instance.numTilings(3));
    }
}
