package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution071;

public class Solution071Test extends JunitBase {

    @Test
    public void testSimplifyPath() {
        System.out.println("simplifyPath");
        Solution071 instance = new Solution071();

        assertEquals("", instance.simplifyPath(""));
        assertEquals("/", instance.simplifyPath("/../"));
        assertEquals("/home", instance.simplifyPath("/home/"));
        assertEquals("/home/foo", instance.simplifyPath("/home//foo/"));
        assertEquals("/c", instance.simplifyPath("/a/./b/../../c/"));
    }
}
