package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution420;

public class Solution420Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("strongPasswordChecker");
        Solution420 instance = new Solution420();

        assertEquals(5, instance.strongPasswordChecker("a"));
        assertEquals(2, instance.strongPasswordChecker("abbb"));
        assertEquals(0, instance.strongPasswordChecker("aFan%128"));
    }
}
