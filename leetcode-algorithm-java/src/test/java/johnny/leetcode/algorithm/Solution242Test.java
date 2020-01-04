package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution242Test extends JunitBase {

    @Test
    public void testIsAnagram() {
        System.out.println("isAnagram");
        Solution242 instance = new Solution242();

        assertEquals(true, instance.isAnagram("", ""));
        assertEquals(false, instance.isAnagram("bc", "ab"));
        assertEquals(true, instance.isAnagram("ba", "ab"));
        assertEquals(true, instance.isAnagram("anagram", "nagaram"));
        assertEquals(false, instance.isAnagram("car", "rat"));
    }
}
