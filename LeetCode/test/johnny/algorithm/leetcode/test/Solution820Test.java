package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution820;

public class Solution820Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minimumLengthEncoding");
        Solution820 instance = new Solution820();

        assertEquals(10, instance.minimumLengthEncoding(new String[] {"time", "me", "bell"}));
    }
}
