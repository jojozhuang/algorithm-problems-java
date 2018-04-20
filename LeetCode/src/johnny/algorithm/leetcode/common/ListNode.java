package johnny.algorithm.leetcode.common;

/**
 *
 * @author Johnny
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) {
        val = x;
        next = null;
    }
    
    public static ListNode createInstance(int[] arr) {  
        if (arr == null || arr.length == 0) {
            return null;
        }
        
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int i = 0; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        
        return dummy.next;
    }
    
    public static ListNode[] createList(int[][] arr) {  
        if (arr == null || arr.length == 0 || arr[0].length == 0) {
            return null;
        }
        
        ListNode[] res = new ListNode[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = createInstance(arr[i]);
        }
        
        return res;
    }
    
    public static boolean isSame(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return true;
        }
        if (l1 == null && l2 != null) {
            return false;
        }
        if (l1 != null && l2 == null) {
            return false;
        }
        if (l1.val != l2.val) {
            return false;
        }
        
        return isSame(l1.next, l2.next);
    }
    
    @Override
    public boolean equals(Object o) {
        // If the object is compared with itself then return true  
        if (o == this) {
            return true;
        }
 
        /* Check if o is an instance of ListNode or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof ListNode)) {
            return false;
        }
         
        // typecast o to ListNode so that we can compare data members 
        ListNode node = (ListNode) o;
         
        // Compare the data members and return accordingly 
        return node.val == this.val;
    }
}
