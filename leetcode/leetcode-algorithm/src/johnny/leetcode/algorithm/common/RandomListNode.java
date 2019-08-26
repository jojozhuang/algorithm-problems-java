package johnny.leetcode.algorithm.common;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Johnny
 */
public class RandomListNode {
    public int label;
    public RandomListNode next, random;
    public RandomListNode(int x) { this.label = x; }
    
    public static RandomListNode createInstance(int[] arr, int[] random) {  
        if (arr == null || arr.length == 0) {
            return null;
        }
        
        RandomListNode dummy = new RandomListNode(0);
        RandomListNode curr = dummy;
        for (int i = 0; i < arr.length; i++) {
            curr.next = new RandomListNode(arr[i]);
            curr = curr.next;
        }
        
        setRandom(dummy.next, random);
        return dummy.next;
    }
    
    public static void setRandom(RandomListNode head, int[] random) {
        if (random == null || random.length == 0) {
            return;
        }
        
        Map<Integer, RandomListNode> map = new HashMap<Integer, RandomListNode>();
        RandomListNode curr = head;
        for (int i = 0; i < random.length; i++) {
            map.put(i, curr);
            curr = curr.next;
        }
         
        curr = head;
        for (int i = 0; i < random.length; i++) {
            if (random[i] != -1) {
                curr.random = map.get(random[i]);
            }                        
            curr = curr.next;
        }
    }
    
    public static boolean isSame(RandomListNode l1, RandomListNode l2) {
        if (l1 == null && l2 == null) {
            return true;
        }
        if (l1 == null && l2 != null) {
            return false;
        }
        if (l1 != null && l2 == null) {
            return false;
        }
        if (l1.label != l2.label) {
            return false;
        }
        if (l1.random == null && l2.random != null) {
            return false;
        }
        if (l1.random != null && l2.random == null) {
            return false;
        }
        if (l1.random != null && l2.random != null && l1.random.label != l2.random.label) {
            return false;
        }
        return isSame(l1.next, l2.next);
    }
}
