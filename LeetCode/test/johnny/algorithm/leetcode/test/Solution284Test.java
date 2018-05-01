package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.algorithm.leetcode.Solution284;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution284Test extends JunitBase {

    @Test
    public void testPeek() {
        System.out.println("peek");

        List<Integer> al = ListUtil.buildList(new Integer[] {1,2,3});
        Solution284 instance = new Solution284(al.iterator());
        Integer result = 1;
        assertEquals(result, instance.peek());
    }

    @Test
    public void testNext() {
        System.out.println("next");

        List<Integer> al = ListUtil.buildList(new Integer[] {1,2,3});
        Solution284 instance = new Solution284(al.iterator());
        Integer result1 = 1;
        Integer result2 = 2;
        assertEquals(result1, instance.next());
        assertEquals(result2, instance.peek());
    }

    @Test
    public void testHasNext() {
        System.out.println("hasNext");
        List<Integer> al = ListUtil.buildList(new Integer[] {1,2,3});
        Solution284 instance = new Solution284(al.iterator());
        Integer result1 = 1;
        Integer result2 = 2;
        Integer result3 = 3;
        assertEquals(true, instance.hasNext());
        assertEquals(result1, instance.next());
        assertEquals(result2, instance.peek());
        assertEquals(true, instance.hasNext());
        assertEquals(result2, instance.next());
        assertEquals(result3, instance.next());
        assertEquals(false, instance.hasNext());
    }
}
