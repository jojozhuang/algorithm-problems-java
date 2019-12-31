package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution702;
import johnny.leetcode.algorithm.common.ArrayReaderImpl;

public class Solution702Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("search");
        Solution702 instance = new Solution702();

        ArrayReaderImpl ari = new ArrayReaderImpl(new int[] {-1,0,3,5,9,12});
        assertEquals(4, instance.search(ari, 9));
        assertEquals(-1, instance.search(ari, 2));
    }
}
