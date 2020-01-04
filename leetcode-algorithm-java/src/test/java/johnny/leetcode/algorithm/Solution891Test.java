package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution891Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("sumSubseqWidths");
        Solution891 instance = new Solution891();

        assertEquals(6, instance.sumSubseqWidths(new int[] {2,1,3}));
    }
}
