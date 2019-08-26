package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution893;

public class Solution893Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("isMonotonic");
        Solution893 instance = new Solution893();

        assertEquals(3, instance.numSpecialEquivGroups(new String[] {"a","b","c","a","c","c"}));
        assertEquals(4, instance.numSpecialEquivGroups(new String[] {"aa","bb","ab","ba"}));
        assertEquals(3, instance.numSpecialEquivGroups(new String[] {"abc","acb","bac","bca","cab","cba"}));
        assertEquals(1, instance.numSpecialEquivGroups(new String[] {"abcd","cdab","adcb","cbad"}));
    }
}
