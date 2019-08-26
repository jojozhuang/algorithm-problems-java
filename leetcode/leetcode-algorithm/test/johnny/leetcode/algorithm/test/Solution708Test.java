package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution708;
import johnny.leetcode.algorithm.common.Node;

public class Solution708Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("insertCyclicSortedList");
        Solution708 cyclicSortedList = new Solution708();
        
        Node node1 = Node.createInstance(new int[] {1,2,3});
        Node head1 = cyclicSortedList.insert(node1, 0);
        Node expect1 = Node.createInstance(new int[] {1,2,3,0});
        String strHead1 = Node.getText(head1);
        String strExpect1 = Node.getText(expect1);
        assertEquals(strHead1, strExpect1);
        
        Node node2 = Node.createInstance(new int[] {3,3,3});
        Node head2 = cyclicSortedList.insert(node2, 0);
        Node expect2 = Node.createInstance(new int[] {3,3,3,0});
        String strHead2 = Node.getText(head2);
        String strExpect2 = Node.getText(expect2);
        assertEquals(strHead2, strExpect2);
    }
}
