/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Zigzag Iterator.
 * Given two 1d vectors, implement an iterator to return their elements alternately.
 * 
 * For example, given two 1d vectors:
 * 
 * v1 = [1, 2]
 * v2 = [3, 4, 5, 6] 
 * By calling next repeatedly until hasNext returns false, the order of elements
 * returned by next should be: [1, 3, 2, 4, 5, 6].
 * 
 * Follow up: What if you are given k 1d vectors? How well can your code be 
 * extended to such cases?
 * 
 * @author Johnny
 */
public class Solution281 {
    //Solution1: https://leetcode.com/discuss/100385/c%23-easy-solution
    //Solution2: https://leetcode.com/discuss/74897/clean-c%23-based-on-queue
    Queue<List<Integer>> queue = new LinkedList<List<Integer>>();
    /*public Solution281(List<Integer> v1, List<Integer> v2) {
        if (v1 != null && v1.size() > 0) {
            queue.offer(v1);
        }
        if (v2 != null && v2.size() > 0) {
            queue.offer(v2);
        }
    }*/
    
    // k list
    public Solution281(List<List<Integer>> klist) {        
        for(List<Integer> listitem: klist) {
            if (listitem != null && listitem.size() > 0) {
                queue.offer(listitem);
            }
        }
    }

    public int next() {
        List<Integer> list = queue.poll();
        int next = list.get(0);
        list.remove(0);
        if (!list.isEmpty()) {
            queue.offer(list);
        }
        return next;
    }

    public boolean hasNext() {
        return !queue.isEmpty();
    }
}
