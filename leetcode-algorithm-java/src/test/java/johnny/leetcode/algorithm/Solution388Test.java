package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution388;

public class Solution388Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("lengthLongestPath");
        Solution388 instance = new Solution388();

        assertEquals(32, instance.lengthLongestPath("dir/subdir2/subsubdir2/file2.ext"));
    }
}
