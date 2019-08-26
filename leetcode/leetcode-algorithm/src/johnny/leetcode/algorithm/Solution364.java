package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import johnny.leetcode.algorithm.common.NestedInteger;

/**
 * Nested List Weight Sum II .
 * 
 * Given a nested list of integers, return the sum of all integers in the list 
 * weighted by their depth.
 * 
 * Each element is either an integer, or a list -- whose elements may also be
 * integers or other lists.
 * 
 * Different from the previous question where weight is increasing from root to 
 * leaf, now the weight is defined from bottom up. i.e., the leaf level integers
 * have weight 1, and the root level integers have the largest weight.
 * 
 * Example 1:
 * Given the list [[1,1],2,[1,1]], return 8. (four 1's at depth 1, one 2 at depth 2)
 * 
 * Example 2:
 * Given the list [1,[4,[6]]], return 17. (one 1 at depth 3, one 4 at depth 2, 
 * and one 6 at depth 1; 1*3 + 4*2 + 6*1 = 17) 
 * 
 * @author Johnny
 */
public class Solution364 {
    public int depthSumInverse(List<NestedInteger> nestedList) {
        if (nestedList == null) {
            return 0;
        }
        Queue<NestedInteger> queue = new LinkedList<>();
        int prev = 0; // previous level
        int total = 0;
        for (NestedInteger next: nestedList) {
            queue.offer(next);
        }
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            int levelSum = 0;
            for (int i = 0; i < size; i++) {
                NestedInteger current = queue.poll();
                if (current.isInteger()) {
                    levelSum += current.getInteger();
                } else {
                    List<NestedInteger> nextList = current.getList();
                    for (NestedInteger next: nextList) {
                        queue.offer(next);
                    }
                }
            }
            prev += levelSum;
            total += prev;
        }
        return total;
    }
    public int depthSumInverse2(List<NestedInteger> nestedList) {
        if (nestedList == null || nestedList.size() == 0) {
            return 0;
        }
        
        int unweighted = 0, weighted = 0;
        while (!nestedList.isEmpty()) {
            List<NestedInteger> nextLevel = new ArrayList<>();
            for (NestedInteger ni : nestedList) {
                if (ni.isInteger())
                    unweighted += ni.getInteger();
                else
                    nextLevel.addAll(ni.getList());
            }
            weighted += unweighted;
            nestedList = nextLevel;
        }
        return weighted;
    }
}
