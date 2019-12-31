package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution010;

public class Solution010Test extends JunitBase {

    @Test
    public void testIsMatch() {
        System.out.println("isMatch");
        Solution010 instance = new Solution010();

        assertEquals(true, instance.isMatch("", ""));
        assertEquals(false, instance.isMatch("aa","a"));
        assertEquals(true, instance.isMatch("aa","aa"));
        assertEquals(false, instance.isMatch("aaa","aa"));
        assertEquals(true, instance.isMatch("aa","a*"));
        assertEquals(true, instance.isMatch("aa",".*"));
        assertEquals(true, instance.isMatch("ab",".*"));
        assertEquals(true, instance.isMatch("aab","c*a*b"));
        assertEquals(true, instance.isMatch("aaa","ab*ac*a"));
        assertEquals(false, instance.isMatch("abcd","d*"));
        assertEquals(false, instance.isMatch("mississippi","mis*is*p*."));
        assertEquals(true, instance.isMatch("missispppppppi","mis*is*p*."));
        assertEquals(true, instance.isMatch("missssssssispppppppi","mis*is*p*."));
    }
}
