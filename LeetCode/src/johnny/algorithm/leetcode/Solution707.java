package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
* 707. Design Linked List
* Design your implementation of the linked list. You can choose to use the singly linked list or the doubly linked list. A node in a singly linked list should have two attributes: val and next. val is the value of the current node, and next is a pointer/reference to the next node. If you want to use the doubly linked list, you will need one more attribute prev to indicate the previous node in the linked list. Assume all nodes in the linked list are 0-indexed.

Implement these functions in your linked list class:

get(index) : Get the value of the index-th node in the linked list. If the index is invalid, return -1.
addAtHead(val) : Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
addAtTail(val) : Append a node of value val to the last element of the linked list.
addAtIndex(index, val) : Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
deleteAtIndex(index) : Delete the index-th node in the linked list, if the index is valid.
Example:

MyLinkedList linkedList = new MyLinkedList();
linkedList.addAtHead(1);
linkedList.addAtTail(3);
linkedList.addAtIndex(1, 2);  // linked list becomes 1->2->3
linkedList.get(1);            // returns 2
linkedList.deleteAtIndex(1);  // now the linked list is 1->3
linkedList.get(1);            // returns 3
Note:

All values will be in the range of [1, 1000].
The number of operations will be in the range of [1, 1000].
Please do not use the built-in LinkedList library.
 * @author Johnny
 */
public class Solution707 {
    public class ListNode {
        int val = 0;
        ListNode previous = null;
        ListNode next = null;
        public ListNode(int val) {
            this.val = val;
        }
    }
    
    private ListNode head;
    private ListNode tail;
    List<ListNode> list;
    /** Initialize your data structure here. */
    public Solution707() {
        list = new ArrayList<ListNode>();
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index < 0 || index >= list.size()) {
            return -1;
        }
        
        return list.get(index).val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        if (head == null) {
            head = new ListNode(val);
            tail = head;
            list.add(head);
        } else {
            ListNode node = new ListNode(val);
            node.next = head;
            head = node;
            list.add(0, head);
        }
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if (tail == null) {
            tail = new ListNode(val);
            head = tail;
            list.add(tail);
        } else {
            tail.next = new ListNode(val);
            tail = tail.next;
            list.add(tail);
        }
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > list.size()) {
            return;
        }
        
        if (index == 0) {
            addAtHead(val);
        } else if (index == list.size()) {
            addAtTail(val);
        } else {
            ListNode node = list.get(index - 1);
            ListNode next = node.next;
            node.next = new ListNode(val);
            node.next.next = next;
            list.add(index, node.next);
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= list.size()) {
            return;
        }
        
        if (index == 0) {
            head = head.next;
            list.remove(0);
        } else if (index == list.size() - 1) {
            ListNode node = list.get(index - 1);
            node.next = null;
            tail = node;
            list.remove(index);
        } else {
            ListNode node = list.get(index - 1);
            node.next = node.next.next;
            list.remove(index);
        }
    }
}