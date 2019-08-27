package johnny.lintcode.algorithm;

/**
 * Permutation Index.
 * 
 * Given a permutation which contains no repeated number, find its index in all 
 * the permutations of these numbers, which are ordered in lexicographical order. 
 * The index begins at 1.
 * 
 * Example
 * Given [1,2,4], return 1.
 * 
 * @author Johnny
 */
public class PermutationIndex {
    public long permutationIndex(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        
        long index = 1;
        long fact = 1;
        
        for (int i = A.length - 1; i >= 0; i--) {
            int successor = 0;
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    successor++;
                }
            }
            
            index += fact * successor;
            fact *= A.length - i;
        }
        
        return index;
    }
}
