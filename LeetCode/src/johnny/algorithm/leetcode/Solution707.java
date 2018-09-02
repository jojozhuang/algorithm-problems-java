package johnny.algorithm.leetcode;

import java.util.ArrayList;

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
    class DoublyNode {
        public int val;
        public DoublyNode prev;
        public DoublyNode next;
        public DoublyNode(int val) {
            this.val = val;
        }
    }
    
    private DoublyNode head;
    private DoublyNode tail;
    private ArrayList<DoublyNode> list;
    /** Initialize your data structure here. */
    public Solution707() {
        list = new ArrayList<DoublyNode>();
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (list.isEmpty() || index < 0 || index > list.size() - 1) {
            return -1;
        }
        return list.get(index).val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        DoublyNode node = new DoublyNode(val);
        if (head == null) {
            head = node;
            tail = node;
            list.add(head);
        } else {
            node.next = head;
            head.prev = node;
            head = node;
            list.add(0,  head);
        }
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        DoublyNode node = new DoublyNode(val);
        if (tail == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = tail.next;
            list.add(tail);
        }
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index < 0) {
            return;
        }
        if (index == 0) {
            addAtHead(val);
        } else if (index > list.size() - 1) {
            addAtTail(val);
        } else {
            DoublyNode prev = list.get(index - 1);
            DoublyNode curr = list.get(index);
            DoublyNode node = new DoublyNode(val);
            prev.next = node;
            node.prev = prev;
            node.next = curr;
            curr.prev = node;
            list.add(index, node);
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index < 0 || index > list.size() - 1) {
            return;
        }
        
        if (index == 0) {
            head = head.next;
            head.prev = null;
            list.remove(0);
        } else {
            DoublyNode prev = list.get(index - 1);
            DoublyNode curr = list.get(index);
            prev.next = curr.next;
            if (curr.next != null && curr.next.prev != null ) {
                curr.next.prev = prev;
            }
            list.remove(index);
        }
    }
}