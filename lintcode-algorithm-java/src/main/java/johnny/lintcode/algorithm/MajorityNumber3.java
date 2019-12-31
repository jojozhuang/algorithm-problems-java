package johnny.lintcode.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Majority Number III.
 * Given an array of integers and a number k, the majority number is the number 
 * that occurs more than 1/k of the size of the array.
 * 
 * Find it.
 * 
 * Example
 * Given [3,1,2,3,2,3,3,4,4,4] and k=3, return 3.
 * 
 * Note
 * There is only one majority number in the array.
 * 
 * Challenge
 * O(n) time and O(k) extra space
 * 
 * @author Johnny
 */
public class MajorityNumber3 {
    /**
     * @param nums: A list of integers
     * @param k: As described
     * @return: The majority number
     */
    public int majorityNumber(ArrayList<Integer> nums, int k) {
        if (nums == null || nums.size() == 0) {
            return 0;
        }
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
            
            if (map.size() > k - 1) {
                shrinkMap(map);
            }
        }
        
        // reset
        for (int key: map.keySet()) {
            map.put(key, 0);
        }
        // count
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            }
        }
        
        // find max
        int maxkey = 0;
        int maxval = 0;
        for (int key: map.keySet()) {
            if (map.get(key) > maxval) {
                maxval = map.get(key);
                maxkey = key;
            }
        }
        
        return maxkey;
    }
    
    private void shrinkMap(HashMap<Integer, Integer> hash) {
        for (int key: hash.keySet()) {
            hash.put(key, hash.get(key) - 1);
        }
        
        Iterator<Map.Entry<Integer,Integer>> iter = hash.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<Integer,Integer> entry = iter.next();
            if(entry.getValue() == 0){
                iter.remove();
            }
        }
    }
}
