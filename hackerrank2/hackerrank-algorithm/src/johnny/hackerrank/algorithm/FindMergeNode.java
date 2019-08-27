package johnny.hackerrank.algorithm;

import johnny.hackerrank.algorithm.common.Node;

/**
 *
 * @author Johnny
 */
public class FindMergeNode {
    public int findMergeNode(Node headA, Node headB) {
        int lenA = getLen(headA);
        int lenB = getLen(headB);

        while(lenA > lenB) {
            headA = headA.next;
            lenA--;
        }

        while(lenA < lenB) {
            headB = headB.next;
            lenB--;
        } 

        while(headA != null) {
            if (headA.data == headB.data) {
                return headA.data;
            }
            headA = headA.next;
            headB = headB.next;
        }

        return Integer.MIN_VALUE;
    }

    private int getLen(Node node) {
        int len = 0;
        Node curr = node;
        while (curr != null) {
            curr = curr.next;
            len++;        
        }
        return len;
    }
}
