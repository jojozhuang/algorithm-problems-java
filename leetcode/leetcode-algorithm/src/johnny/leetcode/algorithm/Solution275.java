package johnny.leetcode.algorithm;

/**
 * H-Index II.
 * 
 * Follow up for H-Index: What if the citations array is sorted in ascending 
 * order? Could you optimize your algorithm?
 * 
 * Hint:
 * Expected runtime complexity is in O(log n) and the input is sorted.
 * 
 * @author Johnny
 */
public class Solution275 {
    public int hIndex(int[] citations) {
        if (citations == null || citations.length == 0) {
            return 0;
        }
        
        int len = citations.length;
        int start = 0;
        int end = len - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (len - mid == citations[mid]) {                
                return len - mid;
            } else if (len - mid > citations[mid]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }        
        
        return len - start;
    }
}
