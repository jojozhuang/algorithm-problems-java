package johnny.leetcode.algorithm;

import johnny.leetcode.algorithm.common.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution430Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("flatten");
        Solution430 instance = new Solution430();
        
        assertEquals(null, instance.flatten(null));
        
        Node head1 = Node.createInstanceDoubly(new int[] {1,2,3,4,5,6});
        Node child3 = Node.createInstanceDoubly(new int[] {7,8,9,10});
        Node child8 = Node.createInstanceDoubly(new int[] {11,12});
        child3.next.child = child8;
        head1.next.next.child = child3;
        Node result1 = instance.flatten(head1);
        Node expect1 = Node.createInstanceDoubly(new int[] {1,2,3,7,8,11,12,9,10,4,5,6});
        assertEquals(true, Node.isSame(expect1, result1));
        
        Node head2 = Node.createInstanceDoubly(new int[] {1});
        Node child22 = Node.createInstanceDoubly(new int[] {2});
        Node child23 = Node.createInstanceDoubly(new int[] {3});
        Node child24 = Node.createInstanceDoubly(new int[] {4});
        Node child25 = Node.createInstanceDoubly(new int[] {5});
        child24.child = child25;
        child23.child = child24;
        child22.child = child23;
        head2.child = child22;
        Node result2 = instance.flatten(head2);
        Node expect2 = Node.createInstanceDoubly(new int[] {1,2,3,4,5});
        assertEquals(true, Node.isSame(expect2, result2));
    }
}
