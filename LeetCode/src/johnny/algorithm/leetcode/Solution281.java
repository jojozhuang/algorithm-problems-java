package johnny.algorithm.leetcode;

import java.util.Iterator;
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
    LinkedList<Iterator<Integer>> list;
    public Solution281(List<Integer> v1, List<Integer> v2) {
        list = new LinkedList<Iterator<Integer>>();
        if(!v1.isEmpty()) list.add(v1.iterator());
        if(!v2.isEmpty()) list.add(v2.iterator());
    }

    public int next() {
        Iterator<Integer> poll = list.remove();
        int result = (Integer)poll.next();
        if(poll.hasNext()) list.add(poll);
        return result;
    }

    public boolean hasNext() {
        return !list.isEmpty();
    }
    
    public class KList {
        //Solution1: https://leetcode.com/discuss/100385/c%23-easy-solution
        //Solution2: https://leetcode.com/discuss/74897/clean-c%23-based-on-queue
        Queue<List<Integer>> queue = new LinkedList<List<Integer>>();
        // k list
       
        public KList(List<List<Integer>> klist) {
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
}
