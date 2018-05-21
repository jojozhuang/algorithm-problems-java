package johnny.algorithm.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 838. Push Dominoes
 * There are N dominoes in a line, and we place each domino vertically upright.

In the beginning, we simultaneously push some of the dominoes either to the left or to the right.



After each second, each domino that is falling to the left pushes the adjacent domino on the left.

Similarly, the dominoes falling to the right push their adjacent dominoes standing on the right.

When a vertical domino has dominoes falling on it from both sides, it stays still due to the balance of the forces.

For the purposes of this question, we will consider that a falling domino expends no additional force to a falling or already fallen domino.

Given a string "S" representing the initial state. S[i] = 'L', if the i-th domino has been pushed to the left; S[i] = 'R', if the i-th domino has been pushed to the right; S[i] = '.', if the i-th domino has not been pushed.

Return a string representing the final state. 

Example 1:

Input: ".L.R...LR..L.."
Output: "LL.RR.LLRRLL.."
Example 2:

Input: "RR.L"
Output: "RR.L"
Explanation: The first domino expends no additional force on the second domino.
Note:

0 <= N <= 10^5
String dominoes contains only 'L', 'R' and '.'
 * @author Johnny
 */
public class Solution838 {
    public String pushDominoes(String dominoes) {
        if (dominoes == null || dominoes.length() == 0) {
            return "";
        }
        
        StringBuilder sb = new StringBuilder();
        Queue<Character> queue = new LinkedList<Character>();
        int count = 0; // Counts how many 'R's
        boolean isRight = false; // Indicates the preceding items are 'R's
        
        for (int i = 0; i < dominoes.length(); i++) {
            char c = dominoes.charAt(i);
            if (c == '.') {
                if (isRight) {
                    queue.add('R');
                    count++;
                } else {
                    queue.add(c);
                }
            } else if (c == 'R') {
                while(!queue.isEmpty()) {
                    sb.append(queue.remove());
                }
                isRight = true;
                queue.add(c);
                count = 1;
            } else { // 'L'
                if (!isRight) {
                    while(!queue.isEmpty()) {
                        queue.remove();
                        sb.append('L');
                    }
                } else {
                    int j = 0;
                    while(j < ((count + 1) / 2)) { // 1. add 'R'
                        sb.append(queue.remove());
                        j++;
                    }
                    if (count % 2 == 0) { // 2. add middle '.' if necessary
                        queue.remove();
                        sb.append('.');
                    }
                    while(!queue.isEmpty()) { // 3. add 'L'
                        queue.remove();
                        sb.append('L');
                    }
                    isRight = false;
                }
                sb.append(c); // 'L'
            }
        }
        
        while(!queue.isEmpty()) {
            sb.append(queue.remove());
        }
        return sb.toString();
    }
}
