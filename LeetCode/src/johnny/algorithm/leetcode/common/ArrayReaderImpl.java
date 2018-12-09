package johnny.algorithm.leetcode.common;

public class ArrayReaderImpl implements ArrayReader {
    private int[] nums;
    public ArrayReaderImpl(int[] nums) {
        this.nums = nums;
    }
    
    public int get(int k) {
        if (k >= nums.length) {
            return Integer.MAX_VALUE;
        }
        
        return nums[k];
    }
}
