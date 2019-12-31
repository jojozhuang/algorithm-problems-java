package johnny.leetcode.algorithm.common;

public class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }
    
    public Node(int _val,Node _next) {
        val = _val;
        next = _next;
    }

    public Node(int _val,Node _prev,Node _next,Node _child) {
        val = _val;
        prev = _prev;
        next = _next;
        child = _child;
    }
    
    public static Node createInstance(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        
        Node dummy = new Node(0);
        Node curr = dummy;
        Node tail = dummy;
        for (int i = 0; i < arr.length; i++) {
            curr.next = new Node(arr[i]);
            curr = curr.next;
            tail = curr;
        }
        
        tail.next = dummy.next;
        return dummy.next;
    }
    
    public static Node createInstanceDoubly(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        
        Node dummy = new Node(0);
        Node curr = dummy;
        //Node tail = dummy;
        for (int i = 0; i < arr.length; i++) {
            curr.next = new Node(arr[i]);
            curr = curr.next;
            //tail = curr;
        }
        
        //tail.next = dummy.next;
        
        // set previous
        curr = dummy.next;
        Node previous = null;
        for (int i = 0; i < arr.length; i++) {
            curr.prev = previous;
            previous = curr;
            curr = curr.next;
        }
        return dummy.next;
    }
    
    public static String getText(Node head) {
        if (head == null) {
            return "";
        }
        
        //int intitialVal = head.val;
        StringBuilder sb = new StringBuilder();
        sb.append(head.val);
        sb.append(",");
        Node curr = head.next;
        while (curr != head) {
            sb.append(curr.val);
            sb.append(",");
            curr = curr.next;
        }
        return sb.toString();
    }
    
    public static boolean isSame(Node node1, Node node2) {
        Node curr1 = node1;
        Node curr2 = node2;
        while (curr1 != null) {
            if (curr2 == null) {
                return false;
            }
            if (curr1.val != curr2.val) {
                return false;
            }
            
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        
        if (curr2 != null) {
            return false;
        }
        
        return true;
    }
}
