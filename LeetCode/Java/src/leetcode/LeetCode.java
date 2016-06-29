/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;

/**
 *
 * @author Johnny
 */
public class LeetCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Hello, World!");
        strings.add("Welcome to CoderPad.");
        strings.add("This pad is running Java 8.");

        for (String string : strings) {
          System.out.println(string);
        }
        
        //reverse string
        System.out.println(reverse(""));
        System.out.println(reverse("W"));
        System.out.println(reverse("Welcome to coderpad!"));
        //reverse linkedlist
        
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        ListNode res = reverse(root);
        while (res != null) {
          System.out.println(res.val);
          res = res.next;
        }       
    }
    
    public static String reverse(String str) {
        if (str == null || str.length() == 0) {
          return "";
        }

        int start = 0;
        int end = str.length() - 1;
        char[] chs = str.toCharArray();
        while (start < end) {
          char c = chs[start];
          chs[start] = chs[end];
          chs[end] = c;
          start++;
          end--;
        }

        return new String(chs);
    }
    
    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
          ListNode next = head.next;
          head.next = prev;
          prev = head;
          head = next;
        }

        return prev;
    }   
}

class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int val) {
      this.val = val;
      this.next = null;
    }
}
