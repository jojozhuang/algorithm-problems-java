package johnny.algorithm.leetcode;

import java.util.TreeMap;

/**
 * 846. Hand of Straights
 * 
 * Alice has a hand of cards, given as an array of integers.

Now she wants to rearrange the cards into groups so that each group is size W, and consists of W consecutive cards.

Return true if and only if she can.

 

Example 1:

Input: hand = [1,2,3,6,2,3,4,7,8], W = 3
Output: true
Explanation: Alice's hand can be rearranged as [1,2,3],[2,3,4],[6,7,8].
Example 2:

Input: hand = [1,2,3,4,5], W = 4
Output: false
Explanation: Alice's hand can't be rearranged into groups of 4.
 

Note:

1 <= hand.length <= 10000
0 <= hand[i] <= 10^9
1 <= W <= hand.length

 * @author Johnny
 */
public class Solution846 {
    public boolean isNStraightHand(int[] hand, int W) {
        if (W > hand.length) {
            return false;
        }
        if (hand.length % W != 0) {
            return false;
        }
        
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        
        for (int card : hand) {
            if (!treeMap.containsKey(card)) {
                treeMap.put(card, 0);
            }
            treeMap.put(card, treeMap.get(card) + 1);
        }
        
        while (treeMap.size() >= W) {
            int first = treeMap.firstKey(); // the smallest one
            for (int i = first; i < first + W; i++) {
                if (!treeMap.containsKey(i)) {
                    return false;
                }
                treeMap.put(i, treeMap.get(i) - 1);
                if (treeMap.get(i) == 0) {
                    treeMap.remove(i);
                }
            }
        }
        
        return treeMap.isEmpty();
    }
}
