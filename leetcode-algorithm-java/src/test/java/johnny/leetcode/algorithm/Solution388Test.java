package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution388Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("lengthLongestPath");
        Solution388 instance = new Solution388();

        assertEquals(32, instance.lengthLongestPath("dir/subdir2/subsubdir2/file2.ext"));
    }
}
