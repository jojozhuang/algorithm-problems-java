package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution589;
import johnny.leetcode.algorithm.common.ListUtil;

public class Solution589Test extends JunitBase {

    @Test
    public void testPreorder() {
        System.out.println("preorder");
        Solution589 instance = new Solution589();
        
        List<Integer> expect1 = ListUtil.buildList(new Integer[] {});
        assertEquals(expect1, instance.preorder(null));

        Solution589.Node root2 = instance.deserialize("1,0");
        List<Integer> expect2 = ListUtil.buildList(new Integer[] {1});
        assertEquals(expect2, instance.preorder(root2));

        Solution589.Node root3 = instance.deserialize("1,1,4,0");
        List<Integer> expect3 = ListUtil.buildList(new Integer[] {1,4});
        assertEquals(expect3, instance.preorder(root3));

        Solution589.Node root4 = instance.deserialize("1,2,2,0,3,0");
        List<Integer> expect4 = ListUtil.buildList(new Integer[] {1,2,3});
        assertEquals(expect4, instance.preorder(root4));

        Solution589.Node root5 = instance.deserialize("1,3,3,2,5,0,6,0,2,0,4,0");
        List<Integer> expect5 = ListUtil.buildList(new Integer[] {1,3,5,6,2,4});
        assertEquals(expect5, instance.preorder(root5));
    }
}
