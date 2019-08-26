package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.SolutionA1019;
import johnny.leetcode.algorithm.common.ListNode;

public class SolutionA1019Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("nextLargerNodes");
        SolutionA1019 instance = new SolutionA1019();

        
        assertArrayEquals(new int[] {5,5,0}, instance.nextLargerNodes(ListNode.createInstance(new int[] {2,1,5})));
        assertArrayEquals(new int[] {7,0,5,5,0}, instance.nextLargerNodes(ListNode.createInstance(new int[] {2,7,4,3,5})));
        assertArrayEquals(new int[] {7,9,9,9,0,5,0,0}, instance.nextLargerNodes(ListNode.createInstance(new int[] {1,7,5,1,9,2,5,1})));
    }
}
