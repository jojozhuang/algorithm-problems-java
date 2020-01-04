package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution775Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("isIdealPermutation");
        Solution775 instance = new Solution775();

        assertEquals(true, instance.isIdealPermutation(new int[] {1,0,2}));
        assertEquals(false, instance.isIdealPermutation(new int[] {1,2,0}));
    }
}
