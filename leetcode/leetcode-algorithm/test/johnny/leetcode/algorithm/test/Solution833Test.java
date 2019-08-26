package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution833;

public class Solution833Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findReplaceString");
        Solution833 instance = new Solution833();

        String S1 = "abcd";
        int[] indexes1 = new int[]{0,2};
        String[] sources1 = new String[] {"a","cd"};
        String[] targets1 = new String[] {"eee","ffff"};
        assertEquals("eeebffff", instance.findReplaceString(S1, indexes1, sources1, targets1));

        String S2 = "abcd";
        int[] indexes2 = new int[]{0,2};
        String[] sources2 = new String[] {"ab","ec"};
        String[] targets2 = new String[] {"eee","ffff"};
        assertEquals("eeecd", instance.findReplaceString(S2, indexes2, sources2, targets2));
}
}
