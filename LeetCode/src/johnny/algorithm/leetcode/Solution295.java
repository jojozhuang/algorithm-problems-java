package johnny.algorithm.leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Find Median from Data Stream.
 * 
 * Median is the middle value in an ordered integer list. If the size of the 
 * list is even, there is no middle value. So the median is the mean of the two 
 * middle value.
 * 
 * Examples: 
 * [2,3,4] , the median is 3
 * 
 * [2,3], the median is (2 + 3) / 2 = 2.5
 * 
 * Design a data structure that supports the following two operations:
 * 
 * void addNum(int num) - Add a integer number from the data stream to the data structure.
 * double findMedian() - Return the median of all elements so far.
 * For example:
 * 
 * add(1)
 * add(2)
 * findMedian() -> 1.5
 * add(3) 
 * findMedian() -> 2
 * 
 * @author Johnny
 */
public class Solution295 {
    private Queue<Long> small = new PriorityQueue<Long>(),
            large = new PriorityQueue<Long>();

    public void addNum(int num) {
        large.add((long) num);
        small.add(-large.poll());
        if (large.size() < small.size()) {
            large.add(-small.poll());
        }
    }
    
    public double findMedian() {
        return large.size() > small.size()
           ? large.peek()
           : (large.peek() - small.peek()) / 2.0;
    }
    //http://www.geeksforgeeks.org/median-of-stream-of-integers-running-integers/
    //https://segmentfault.com/a/1190000003709954
    //left: maxHeap, right: minHeap
    /*
    PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(new MedianComparator());

    // Adds a number into the data structure.
    public void addNum(int num) {
        if(maxHeap.isEmpty() || num <= maxHeap.peek()){
            if(maxHeap.size() > minHeap.size()){
                minHeap.offer(maxHeap.poll());
            }
            maxHeap.offer(num);
        } else if (minHeap.isEmpty() || num > minHeap.peek()){
            if(minHeap.size() > maxHeap.size()){
                maxHeap.offer(minHeap.poll());
            }
            minHeap.offer(num);
        } else {
            if(maxHeap.size() <= minHeap.size()){
                maxHeap.offer(num);
            } else {
                minHeap.offer(num);
            }
        }
    }

    // Returns the median of current data stream
    public double findMedian() {
        if(maxHeap.size() > minHeap.size()){
            return maxHeap.peek();
        } else if (maxHeap.size() < minHeap.size()){
            return minHeap.peek();
        } else if (maxHeap.isEmpty() && minHeap.isEmpty()){
            return 0;
        } else {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        }
    }
    
    private class MedianComparator implements Comparator<Integer> {
        public int compare(Integer i1, Integer i2) {
            return i2 - i1;
        }
    }
    */
}
