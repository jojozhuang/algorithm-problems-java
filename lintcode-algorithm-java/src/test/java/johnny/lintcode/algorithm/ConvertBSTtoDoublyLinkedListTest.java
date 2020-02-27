package johnny.lintcode.algorithm;

import johnny.algorithm.common.DoublyListNode;
import johnny.algorithm.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author Johnny
 */
public class ConvertBSTtoDoublyLinkedListTest extends JunitBase {

    /**
     * Test of bstToDoublyList method, of class ConvertBSTtoDoublyLinkedList.
     */
    @Test
    public void testBstToDoublyList() {
        System.out.println("bstToDoublyList");
        ConvertBSTtoDoublyLinkedList instance = new ConvertBSTtoDoublyLinkedList();
        assertEquals(null, instance.bstToDoublyList(null));
        
        TreeNode root2 = TreeNode.createInstance(new String[]{"1","#","#"});
        DoublyListNode expect2 = DoublyListNode.createInstance(new int[]{1});
        assertTrue(DoublyListNode.isSame(expect2, instance.bstToDoublyList(root2)));
        
        TreeNode root3 = TreeNode.createInstance(new String[]{"2","1","3"});
        DoublyListNode expect3 = DoublyListNode.createInstance(new int[]{1,2,3});
        assertTrue(DoublyListNode.isSame(expect3, instance.bstToDoublyList(root3)));
        
        TreeNode root4 = TreeNode.createInstance(new String[]{"4","2","5","1","3","#","#"});
        DoublyListNode expect4 = DoublyListNode.createInstance(new int[]{1,2,3,4,5});
        DoublyListNode result4 = instance.bstToDoublyList(root4);
        assertTrue(DoublyListNode.isSame(expect4, result4));
    }
}
