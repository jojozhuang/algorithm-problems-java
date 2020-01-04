package johnny.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 895. Maximum Frequency Stack
 * Implement FreqStack, a class which simulates the operation of a stack-like data structure.
 * <p>
 * FreqStack has two functions:
 * <p>
 * push(int x), which pushes an integer x onto the stack.
 * pop(), which removes and returns the most frequent element in the stack.
 * If there is a tie for most frequent element, the element closest to the top of the stack is removed and returned.
 * <p>
 * Example 1:
 * Input:
 * ["FreqStack","push","push","push","push","push","push","pop","pop","pop","pop"],
 * [[],[5],[7],[5],[7],[4],[5],[],[],[],[]]
 * Output: [null,null,null,null,null,null,null,5,7,5,4]
 * Explanation:
 * After making six .push operations, the stack is [5,7,5,7,4,5] from bottom to top.  Then:
 * <p>
 * pop() -> returns 5, as 5 is the most frequent.
 * The stack becomes [5,7,5,7,4].
 * <p>
 * pop() -> returns 7, as 5 and 7 is the most frequent, but 7 is closest to the top.
 * The stack becomes [5,7,5,4].
 * <p>
 * pop() -> returns 5.
 * The stack becomes [5,7,4].
 * <p>
 * pop() -> returns 4.
 * The stack becomes [5,7].
 * <p>
 * Note:
 * <p>
 * Calls to FreqStack.push(int x) will be such that {@code 0 <= x <= 10^9}.
 * It is guaranteed that FreqStack.pop() won't be called if the stack has zero elements.
 * The total number of FreqStack.push calls will not exceed 10000 in a single test case.
 * The total number of FreqStack.pop calls will not exceed 10000 in a single test case.
 * The total number of FreqStack.push and FreqStack.pop calls will not exceed 150000 across all test cases.
 *
 * @author Johnny
 */
public class Solution895 {
    Map<Integer, Integer> map; // value, frequency
    Map<Integer, Stack<Integer>> freqMap; // frequency, value stack
    int maxFreq;

    public Solution895() {
        map = new HashMap<>();
        freqMap = new HashMap<>();
        maxFreq = 0;
    }

    public void push(int x) {
        int freq = map.getOrDefault(x, 0) + 1;
        map.put(x, freq);
        if (freq > maxFreq) {
            maxFreq = freq;
        }

        if (!freqMap.containsKey(freq)) {
            freqMap.put(freq, new Stack<Integer>());
        }

        freqMap.get(freq).push(x);
    }

    public int pop() {
        int res = freqMap.get(maxFreq).pop();
        map.put(res, map.get(res) - 1);
        if (freqMap.get(maxFreq).size() == 0) {
            maxFreq--;
        }
        return res;
    }
    
    /*
    Map<Integer, Integer> freq;
    Map<Integer, Stack<Integer>> group;
    int maxfreq;

    public Solution895() {
        freq = new HashMap<Integer, Integer>();
        group = new HashMap<Integer, Stack<Integer>>();
        maxfreq = 0;
    }

    public void push(int x) {
        int f = freq.getOrDefault(x, 0) + 1;
        freq.put(x, f);
        if (f > maxfreq)
            maxfreq = f;

        group.computeIfAbsent(f, z-> new Stack<Integer>()).push(x);
    }

    public int pop() {
        int x = group.get(maxfreq).pop();
        freq.put(x, freq.get(x) - 1);
        if (group.get(maxfreq).size() == 0)
            maxfreq--;
        return x;
    }*/
}
