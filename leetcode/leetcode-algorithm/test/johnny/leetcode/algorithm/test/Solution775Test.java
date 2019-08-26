package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution775;

public class Solution775Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("isIdealPermutation");
        Solution775 instance = new Solution775();

        assertEquals(true, instance.isIdealPermutation(new int[] {1,0,2}));
        assertEquals(false, instance.isIdealPermutation(new int[] {1,2,0}));
    }
}
