package johnny.lintcode.algorithm;

import java.util.HashMap;

/**
 * @author Johnny
 */
public class TwoSum {
    /*
     * @param numbers : An array of Integer
     * @param target : target = numbers[index1] + numbers[index2]
     * @return : [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length == 0) {
            return new int[]{0, 0};
        }

        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                return new int[]{left + 1, right + 1};
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            } else {
                left++;
            }
        }

        return new int[]{0, 0};
    }

    // Hashmap
    public int[] twoSum2(int[] numbers, int target) {
        if (numbers == null || numbers.length == 0) {
            return new int[]{0, 0};
        }

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int index = 0;
        while (index < numbers.length) {
            if (map.containsKey(numbers[index])) {
                return new int[]{map.get(numbers[index]), index + 1};
            } else {
                map.put(target - numbers[index], index + 1);
            }
            index++;
        }

        return new int[]{0, 0};
    }
}
