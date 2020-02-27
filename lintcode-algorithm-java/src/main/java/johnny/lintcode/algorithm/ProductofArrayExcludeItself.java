package johnny.lintcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integers array A.
 * <p>
 * Define B[i] = A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1], calculate B WITHOUT divide operation.
 *
 * @author Johnny
 */
public class ProductofArrayExcludeItself {
    // b[i] = left * right, divide and conquer
    public List<Long> productExcludeItself(List<Integer> A) {
        if (A == null || A.size() == 0) {
            return null;
        }

        List<Long> ret = new ArrayList<>();

        for (int i = 0; i < A.size(); i++) {
            long left = multiple(A, 0, i - 1);
            long right = multiple(A, i + 1, A.size() - 1);
            ret.add(left * right);
        }

        return ret;
    }

    private long multiple(List<Integer> A, int start, int end) {
        if (start < 0 || end > A.size() || end < start) {
            return 1;
        }

        long ret = 1;
        for (int i = start; i <= end; i++) {
            ret = ret * A.get(i);
        }
        return ret;
    }
}
