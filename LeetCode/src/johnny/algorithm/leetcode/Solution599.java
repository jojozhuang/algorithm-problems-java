package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Minimum Index Sum of Two Lists
 * 
 * Suppose Andy and Doris want to choose a restaurant for dinner, and they both 
 * have a list of favorite restaurants represented by strings.
 * 
 * You need to help them find out their common interest with the least list 
 * index sum. If there is a choice tie between answers, output all of them with 
 * no order requirement. You could assume there always exists an answer.
 * 
 * Example 1:
 * Input:
 * ["Shogun", "Tapioca Express", "Burger King", "KFC"]
 * ["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
 * Output: ["Shogun"]
 * 
 * Explanation: The only restaurant they both like is "Shogun".
 * 
 * Example 2:
 * Input:
 * ["Shogun", "Tapioca Express", "Burger King", "KFC"]
 * ["KFC", "Shogun", "Burger King"]
 * Output: ["Shogun"]
 * 
 * Explanation: The restaurant they both like and have the least index sum is "Shogun" with index sum 1 (0+1).
 * 
 * Note:
 * 1. The length of both lists will be in the range of [1, 1000].
 * 2. The length of strings in both lists will be in the range of [1, 30].
 * 3. The index is starting from 0 to the list length minus 1.
 * 4. No duplicates in both lists.
 * 
 * @author Johnny
 */
public class Solution599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        Map<String, Integer> map1 = new HashMap<String, Integer>();
        for (int i = 0; i < list1.length; i++) {
            map1.put(list1[i], i);
        }
        
        Map<String, Integer> map2 = new HashMap<String, Integer>();
        for (int j = 0; j < list2.length; j++) {
            if (map1.containsKey(list2[j])) {
                map2.put(list2[j], map1.get(list2[j]) + j);
            }
        }
        
        SortedMap<Integer, List<String>> sortMap = new TreeMap<Integer, List<String>>();
        for (String str : map2.keySet()) {
            int index = map2.get(str);
            List<String> list;
            if (!sortMap.containsKey(index)) {
                list = new ArrayList<String>();
            } else {
                list = sortMap.get(index);
            }
            list.add(str);
            sortMap.put(index, list);
            //sortMap.put(map.get(str), (sortMap.getOrDefault(map.get(str), new ArrayList<String>()).add(str)));
        }
        
        
        List<String> largest = sortMap.get(sortMap.firstKey());
        return largest.toArray(new String[largest.size()]);
    }
}
