package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution953Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("isAlienSorted");
        Solution953 instance = new Solution953();

        assertEquals(true, instance.isAlienSorted(new String[] {"hello","leetcode"}, "hlabcdefgijkmnopqrstuvwxyz"));
        assertEquals(false, instance.isAlienSorted(new String[] {"word","world","row"}, "worldabcefghijkmnpqstuvxyz"));
        assertEquals(true, instance.isAlienSorted(new String[] {"world","word","row"}, "worldabcefghijkmnpqstuvxyz"));
        assertEquals(false, instance.isAlienSorted(new String[] {"apple","app"}, "abcdefghijklmnopqrstuvwxyz"));
        assertEquals(false, instance.isAlienSorted(new String[] {"fxasxpc","dfbdrifhp","nwzgs","cmwqriv","ebulyfyve","miracx","sxckdwzv","dtijzluhts","wwbmnge","qmjwymmyox"}, "zkgwaverfimqxbnctdplsjyohu"));
    }
}
