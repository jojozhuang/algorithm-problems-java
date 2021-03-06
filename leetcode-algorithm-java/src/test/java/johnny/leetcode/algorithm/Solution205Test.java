package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution205Test extends JunitBase {

    @Test
    public void testIsIsomorphic() {
        System.out.println("isIsomorphic");
        Solution205 instance = new Solution205();

        assertEquals(true, instance.isIsomorphic("", ""));
        assertEquals(true, instance.isIsomorphic("a", "a"));
        assertEquals(false, instance.isIsomorphic("ab", "aa"));
        assertEquals(true, instance.isIsomorphic("egg", "add"));
        assertEquals(false, instance.isIsomorphic("foo", "bar"));
        assertEquals(true, instance.isIsomorphic("paper", "title"));
        assertEquals(true, instance.isIsomorphic("teacher", "awchkwo"));
    }
}
