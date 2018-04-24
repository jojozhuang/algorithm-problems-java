package johnny.algorithm.leetcode;

/**
 * 644. Maximum Average Subarray II
 * 
 * Given an array consisting of n integers, find the contiguous subarray whose length is greater than or equal to k that has the maximum average value. And you need to output the maximum average value.

Example 1:
Input: [1,12,-5,-6,50,3], k = 4
Output: 12.75
Explanation:
when length is 5, maximum average value is 10.8,
when length is 6, maximum average value is 9.16667.
Thus return 12.75.
Note:
1 <= k <= n <= 10,000.
Elements of the given array will be in range [-10,000, 10,000].
The answer with the calculation error less than 10-5 will be accepted
 * 
 * @author Johnny
 */
public class Solution644 {
    boolean check(int[] nums,int k,double x) //Check whether we can find a subarray whose average is bigger than x
    {
        int n=nums.length;
        double[] a=new double[n];
        for (int i=0;i<n;i++) a[i]=nums[i]-x; //Transfer to a[i], find whether there is a subarray whose sum is bigger than 0
        double now=0,last=0;
        for (int i=0;i<k;i++) now+=a[i];
        if (now>=0) return true;
        for (int i=k;i<n;i++)
        {
            now+=a[i];
            last+=a[i-k];
            if (last<0) 
            {
                now-=last;
                last=0;
            }
            if (now>=0) return true;
        }
        return false;
    }
    public double findMaxAverage(int[] nums, int k) {
        double l=Integer.MIN_VALUE,r=Integer.MAX_VALUE;
        while (r-l>0.000004) //Binary search the answer
        {
            double mid=(l+r)/2;
            if (check(nums,k,mid)) l=mid; else r=mid;
        }
        return r;
    }
}
