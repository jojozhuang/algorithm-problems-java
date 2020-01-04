package johnny.leetcode.algorithm;

import johnny.algorithm.common.ListUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution590Test extends JunitBase {

    @Test
    public void testPostOrder() {
        System.out.println("postorder");
        Solution590 instance = new Solution590();
        
        List<Integer> expect1 = ListUtil.buildList(new Integer[] {});
        assertEquals(expect1, instance.postorder(null));

        Solution590.Node root2 = instance.deserialize("1,0");
        List<Integer> expect2 = ListUtil.buildList(new Integer[] {1});
        assertEquals(expect2, instance.postorder(root2));

        Solution590.Node root3 = instance.deserialize("1,1,4,0");
        List<Integer> expect3 = ListUtil.buildList(new Integer[] {4,1});
        assertEquals(expect3, instance.postorder(root3));

        Solution590.Node root4 = instance.deserialize("1,2,2,0,3,0");
        List<Integer> expect4 = ListUtil.buildList(new Integer[] {2,3,1});
        assertEquals(expect4, instance.postorder(root4));

        Solution590.Node root5 = instance.deserialize("1,3,3,2,5,0,6,0,2,0,4,0");
        List<Integer> expect5 = ListUtil.buildList(new Integer[] {5,6,3,2,4,1});
        assertEquals(expect5, instance.postorder(root5));
    }
}
