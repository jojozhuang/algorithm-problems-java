package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution426Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("treeToDoublyList");
        Solution426  instance = new Solution426();

        Solution426.Node root1 = instance.new Node(4, null, null);
        root1.left = instance.new Node(2, null, null);
        root1.left.left = instance.new Node(1, null, null);
        root1.left.right = instance.new Node(3, null, null);
        root1.right = instance.new Node(5, null, null);
        
        Solution426.Node result1 = instance.treeToDoublyList(root1);
        Solution426.Node expect1 = instance.new Node(1, null, null);
        expect1.right = instance.new Node(2, null, null);
        expect1.right.left = expect1;
        expect1.right.right = instance.new Node(3, null, null);
        expect1.right.right.left = expect1.right.right;
        expect1.right.right.right = instance.new Node(4, null, null);
        expect1.right.right.right.left = expect1.right.right.right;
        expect1.right.right.right.right = instance.new Node(5, null, null);
        expect1.right.right.right.right.left = expect1.right.right.right.right;
        expect1.left = expect1.right.right.right.right;
        expect1.right.right.right.right.right = expect1;
        assertEquals(expect1.val, result1.val);
        assertEquals(expect1.right.val, result1.right.val);
        assertEquals(expect1.right.right.val, result1.right.right.val);
        assertEquals(expect1.right.right.right.val, result1.right.right.right.val);
        assertEquals(expect1.right.right.right.right.val, result1.right.right.right.right.val);
        assertEquals(expect1.left.val, result1.left.val);
        assertEquals(expect1.right.right.right.right.right.val, result1.right.right.right.right.right.val);
        
        Solution426.Node root2 = instance.new Node(1, null, null);
        
        Solution426.Node result2 = instance.treeToDoublyList(root2);
        Solution426.Node expect2 = instance.new Node(1, null, null);
        expect2.right = expect2;
        expect2.left = expect2;
        assertEquals(expect2.val, result2.val);
        assertEquals(expect2.right.val, result2.right.val);
        assertEquals(expect2.left.val, result2.left.val);
    }
}
