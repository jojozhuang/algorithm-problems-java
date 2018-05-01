package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution779;

public class Solution779Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("kthGrammar");
        Solution779 instance = new Solution779();

        assertEquals(0, instance.kthGrammar(1,1));
        assertEquals(0, instance.kthGrammar(2,1));
        assertEquals(1, instance.kthGrammar(2,2));
        assertEquals(1, instance.kthGrammar(4,5));
    }
}
