package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution943;

public class Solution943Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("shortestSuperstring");
        Solution943 instance = new Solution943();

        assertEquals("alexlovesleetcode", instance.shortestSuperstring(new String[] {"alex","loves","leetcode"}));
        assertEquals("gctaagttcatgcatc", instance.shortestSuperstring(new String[] {"catg","ctaagt","gcta","ttca","atgcatc"}));
        assertEquals("dsksssvq", instance.shortestSuperstring(new String[] {"sssv","svq","dskss","sksss"}));
    }
}
