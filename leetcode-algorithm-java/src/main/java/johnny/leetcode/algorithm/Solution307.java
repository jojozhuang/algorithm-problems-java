package johnny.leetcode.algorithm;

/**
 * Range Sum Query - Mutable.
 * <p>
 * Given an integer array nums, find the sum of the elements between indices
 * i and j ({@code i ≤ j}), inclusive.
 * <p>
 * The update(i, val) function modifies nums by updating the element at
 * index i to val.
 * <p>
 * Example:
 * Given nums = [1, 3, 5]
 * <p>
 * {@code sumRange(0, 2) -> 9}
 * update(1, 2)
 * {@code sumRange(0, 2) -> 8}
 * <p>
 * Note:
 * The array is only modifiable by the update function.
 * You may assume the number of calls to update and sumRange function is distributed evenly.
 *
 * @author Johnny
 */
public class Solution307 {
    // Sqrt decomposition
    private int[] b;
    private int len; // storage size
    private int[] nums;

    public Solution307(int[] nums) {
        this.nums = nums;
        double l = Math.sqrt(nums.length);
        len = (int) Math.ceil(nums.length / l);
        b = new int[len];
        for (int i = 0; i < nums.length; i++)
            b[i / len] += nums[i];
    }

    public int sumRange(int i, int j) {
        if (len <= 0) {
            return 0;
        }
        int sum = 0;
        int startBlock = i / len;
        int endBlock = j / len;
        if (startBlock == endBlock) {
            for (int k = i; k <= j; k++)
                sum += nums[k];
        } else {
            for (int k = i; k <= (startBlock + 1) * len - 1; k++)
                sum += nums[k];
            for (int k = startBlock + 1; k <= endBlock - 1; k++)
                sum += b[k];
            for (int k = endBlock * len; k <= j; k++)
                sum += nums[k];
        }
        return sum;
    }

    public void update(int i, int val) {
        int b_l = i / len;
        b[b_l] = b[b_l] - nums[i] + val;
        nums[i] = val;
    }
    
    /*
    int[] nums;
    int[] BITree;
    int n = 0;

    // Segment tree
    public Solution307(int[] nums)
    {
        this.nums = nums;
        if (nums != null) {
            n = nums.length;
        }
        
        BITree = new int[n + 1];
        // Create and initialize BITree[] as 0
        for (int i = 1; i <= n; i++) {
            BITree[i] = 0;
        }

        // Store the actual values in BITree[] using update()
        for (int i = 0; i < n; i++) {
            initial(i, nums[i]);
        }
    }

    // Returns sum of arr[0..index]. This function assumes
    // that the array is preprocessed and partial sums of
    // array elements are stored in BITree[].
    public int getSum(int index)
    {
        int sum = 0; // Iniialize result
        
        if (BITree.length == 1 || index > BITree.length - 2) {
            return sum;
        }

        // index in BITree[] is 1 more than the index in arr[]
        index = index + 1;
        
        // Traverse ancestors of BITree[index]
        while (index>0)
        {
            // Add current element of BITree to sum
            sum += BITree[index];

            // Move index to parent node in getSum View
            index -= index & (-index);
        }
        return sum;
    }
    
    public int sumRange(int from, int to)
    {
        if (from >= 0 && to >= 0 && to >= from) {
            return getSum(to) - getSum(from - 1);
        } else {
            return -1;
        }
    }

    // Updates a node in Binary Index Tree (BITree) at given index
    // in BITree.  The given value 'val' is added to BITree[i] and 
    // all of its ancestors in tree.
    public void update(int index, int val)
    {
        if (index > nums.length - 1) {
            index = nums.length - 1;
        }
        int diff = val - nums[index];
        nums[index] = val;
        
        // index in BITree[] is 1 more than the index in arr[]
        index = index + 1;        
        
        // Traverse all ancestors and add 'val'
        while (index <= n)
        {
           // Add 'val' to current node of BI Tree
           BITree[index] += diff;

           // Update index to that of parent in update View
           index += index & (-index);
        }
    }
    
    private void initial(int index, int val)
    {
        // index in BITree[] is 1 more than the index in arr[]
        index = index + 1;
        
        // Traverse all ancestors and add 'val'
        while (index <= n)
        {
           // Add 'val' to current node of BI Tree
           BITree[index] += val;

           // Update index to that of parent in update View
           index += index & (-index);
        }
    }
    */
    
    /*
    private int[] nums;
    private int[] sum;
    private Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    private TreeSet<Integer> set = new TreeSet<Integer>();
    
    public Solution307(int[] nums) {
        this.nums = nums;
        if (nums == null || nums.length == 0) {
            sum = new int[] {0, 0};            
        } else {
            sum = new int[nums.length + 1];
            sum[0] = 0;
            for (int i = 0; i < nums.length; i++) {
                sum[i + 1] = sum[i] + nums[i];
            }
        }
    }

    void update(int i, int val) {
        if (i >=0 && i < nums.length) {
            set.add(i);        
            map.put(i, val - nums[i]);
        }
    }

    public int sumRange(int i, int j) {
        if (i < 0 || j > sum.length - 2 || i > j) {
            return 0;
        }
        
        int total = sum[j + 1] - sum[i];
        SortedSet<Integer> subSet = set.subSet(i, j + 1);
        for (Integer index : subSet) {
            total = total + map.get(index);
        }
        return total;
    }
    */
}
