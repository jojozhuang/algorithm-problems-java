package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution567;

public class Solution567Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("checkInclusion");
        Solution567 instance = new Solution567();

        assertEquals(true, instance.checkInclusion("ab","eidbaooo"));
        assertEquals(false, instance.checkInclusion("ab","eidboaoo"));
    }
}
