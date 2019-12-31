package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution752;

public class Solution752Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("openLock");
        Solution752 instance = new Solution752();

        assertEquals(6, instance.openLock(new String[]{"0201","0101","0102","1212","2002"}, "0202"));
        assertEquals(1, instance.openLock(new String[]{"8888"}, "0009"));
        assertEquals(-1, instance.openLock(new String[]{"8887","8889","8878","8898","8788","8988","7888","9888"}, "8888"));
        assertEquals(-1, instance.openLock(new String[]{"0000"}, "8888"));
    }
}
