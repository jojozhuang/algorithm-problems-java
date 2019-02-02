package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution895;

public class Solution895Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numSimilarGroups");
        Solution895 instance = new Solution895();

        instance.push(5);
        instance.push(7);
        instance.push(5);
        instance.push(7);
        instance.push(4);
        instance.push(5);
        
        assertEquals(5, instance.pop());
        assertEquals(7, instance.pop());
        assertEquals(5, instance.pop());
        assertEquals(4, instance.pop());
    }
}
