package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution044;

public class Solution044Test extends JunitBase {

    @Test
    public void testIsMatch() {
        System.out.println("isMatch");
        Solution044 instance = new Solution044();

        assertEquals(true, instance.isMatch("", ""));
        assertEquals(false, instance.isMatch("aa",""));
        assertEquals(false, instance.isMatch("","?"));
        assertEquals(true, instance.isMatch("","*"));
        assertEquals(false, instance.isMatch("aa","a"));
        assertEquals(true, instance.isMatch("aa","aa"));
        assertEquals(false, instance.isMatch("aaa","a"));
        assertEquals(true, instance.isMatch("aa","*"));
        assertEquals(true, instance.isMatch("aa","a*"));
        assertEquals(true, instance.isMatch("ab","?*"));
        assertEquals(false, instance.isMatch("aab","c*a*b"));
        assertEquals(true, instance.isMatch("ho","**ho"));
        //assertEquals(true, instance.isMatch("abbabaaabbabbaababbabbbbbabbbabbbabaaaaababababbbabababaabbababaabbbbbbaaaabababbbaabbbbaabbbbababababbaabbaababaabbbababababbbbaaabbbbbabaaaabbababbbbaababaabbababbbbbababbbabaaaaaaaabbbbbaabaaababaaaabb","**aa*****ba*a*bb**aa*ab****a*aaaaaa***a*aaaa**bbabb*b*b**aaaaaaaaa*a********ba*bbb***a*ba*bb*bb**a*b*bb"));
    }
}
