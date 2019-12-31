package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution704;

public class Solution704Test extends JunitBase {

    @Test
    public void testSearchRecursive() {
        System.out.println("testSearchRecursive");
        Solution704 instance = new Solution704();

        assertEquals(4, instance.searchRecursive(new int[] {-1,0,3,5,9,12}, 9));
        assertEquals(-1, instance.searchRecursive(new int[] {-1,0,3,5,9,12}, 2));
    }
    
    @Test
    public void testSearchIterative() {
        System.out.println("testSearchIterative");
        Solution704 instance = new Solution704();

        assertEquals(4, instance.searchIterative(new int[] {-1,0,3,5,9,12}, 9));
        assertEquals(-1, instance.searchIterative(new int[] {-1,0,3,5,9,12}, 2));
    }
    
    @Test
    public void testSearchTemplate() {
        System.out.println("testSearchTemplate");
        Solution704 instance = new Solution704();

        assertEquals(4, instance.search(new int[] {-1,0,3,5,9,12}, 9));
        assertEquals(-1, instance.search(new int[] {-1,0,3,5,9,12}, 2));
    }
}
