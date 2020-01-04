package johnny.leetcode.algorithm;

import java.util.BitSet;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

/**
 *632. Smallest Range
 *You have k lists of sorted integers in ascending order. Find the smallest range that includes at least one number from each of the k lists.

We define the range [a,b] is smaller than range [c,d] if b-a < d-c or a < c if b-a == d-c.

Example 1:
Input:[[4,10,15,24,26], [0,9,12,20], [5,18,22,30]]
Output: [20,24]
Explanation: 
List 1: [4, 10, 15, 24,26], 24 is in range [20,24].
List 2: [0, 9, 12, 20], 20 is in range [20,24].
List 3: [5, 18, 22, 30], 22 is in range [20,24].
Note:
The given list may contain duplicates, so ascending order means >= here.
1 <= k <= 3500
-105 <= value of elements <= 105.
For Java users, please note that the input type has been changed to List<List<Integer>>. And after you reset the code template, you'll see this point.
 * @author Johnny
 */
public class Solution632 {
    public int[] smallestRange(List<List<Integer>> nums) {
        List<int[]> list = IntStream.range(0, nums.size())
                .mapToObj( i -> nums.get(i).stream().map(x -> new int[]{x, i}))
                .flatMap(y -> y)
                .sorted(Comparator.comparingInt(p -> p[0])).collect(toList());
        int[] counts = new int[nums.size()];
        BitSet set = new BitSet(nums.size());
        int start = -1;
        int[] res = new int[2];
        for(int i = 0; i < list.size(); i++) {
            int[] p = list.get(i);
            set.set(p[1]);
            counts[p[1]] += 1;
            if(start == -1) { start = 0; }
            while(start < i && counts[list.get(start)[1]] > 1) {
                counts[list.get(start)[1]]--;
                start++;
            }
            if(set.cardinality() == nums.size()) {
                if( (res[0] == 0 && res[1] == 0) || (list.get(i)[0] - list.get(start)[0]) < res[1] - res[0]) {
                    res[0] = list.get(start)[0];
                    res[1] = list.get(i)[0];
                }
            }
        }
        return res;
    }
}
