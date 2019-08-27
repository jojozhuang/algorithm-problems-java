package johnny.lintcode.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Permutation Index II.
 * Given a permutation which may contain repeated numbers, find its index in all 
 * the permutations of these numbers, which are ordered in lexicographical order. 
 * The index begins at 1.
 * 
 * Example
 * Given the permutation [1, 4, 2, 2], return 3.
 * 
 * @author Johnny
 */
public class PermutationIndex2 {
    public long permutationIndex2(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        
        long index = 1;
        long fact = 1;
        long multifact = 1;
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = A.length - 1; i >= 0; i--) {
            if (map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i]) + 1);
                multifact *= map.get(A[i]);
            } else {
                map.put(A[i], 1);
            }
            int successor = 0;
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    successor++;
                }
            }
            
            index += fact * successor / multifact;
            fact *= A.length - i;
        }
        
        return index;
    }
}
