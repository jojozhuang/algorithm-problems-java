package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 914. X of a Kind in a Deck of Cards

In a deck of cards, each card has an integer written on it.

Return true if and only if you can choose X >= 2 such that it is possible to split the entire deck into 1 or more groups of cards, where:

Each group has exactly X cards.
All the cards in each group have the same integer.
 

Example 1:

Input: [1,2,3,4,4,3,2,1]
Output: true
Explanation: Possible partition [1,1],[2,2],[3,3],[4,4]
Example 2:

Input: [1,1,1,2,2,2,3,3]
Output: false
Explanation: No possible partition.
Example 3:

Input: [1]
Output: false
Explanation: No possible partition.
Example 4:

Input: [1,1]
Output: true
Explanation: Possible partition [1,1]
Example 5:

Input: [1,1,2,2,2,2]
Output: true
Explanation: Possible partition [1,1],[2,2],[2,2]

Note:

1 <= deck.length <= 10000
0 <= deck[i] < 10000

 * @author Johnny
 */
public class Solution914 {
    public boolean hasGroupsSizeX(int[] deck) {
        if (deck.length == 1) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int card : deck) {
            map.put(card, map.getOrDefault(card, 0) + 1);
        }
        
        int[] count = new int[map.size()];
        int i = 0;
        for (int value : map.values()) {
            if (value == 1) {
                return false;
            }
            count[i] = value;
            i++;
        }
        
        for (i = 0; i < count.length; i++) {
            for (int j = i + 1; j < count.length; j++) {
                if (gcd(count[i], count[j]) == 1) {
                    return false;
                }
            }
        }
        
        return true;
    }
    public boolean hasGroupsSizeX2(int[] deck) {
        if (deck == null || deck.length < 2) {
            return false;
        }
        
        // number, count
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < deck.length; i++) {
            if (map.containsKey(deck[i])) {
                map.put(deck[i], map.get(deck[i]) + 1);
            } else {
                map.put(deck[i], 1);
            }
        }
        
        if (map.size() == 1) {
            if (map.get(deck[0]) > 1) {
                return true;
            } else {
                return false;
            }
        }
        
        // count (unique only)
        Set<Integer> set = new HashSet<>();
        for(Integer i : map.values()) {
            set.add(i);
        }
        
        List<Integer> list = new ArrayList<>(set);
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if (gcd(list.get(i), list.get(j)) == 1) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    // greatest common divisor
    private int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }
}
