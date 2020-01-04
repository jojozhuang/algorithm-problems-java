package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution567Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("checkInclusion");
        Solution567 instance = new Solution567();

        assertEquals(true, instance.checkInclusion("ab","eidbaooo"));
        assertEquals(false, instance.checkInclusion("ab","eidboaoo"));
    }
}
