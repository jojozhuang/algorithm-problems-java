/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 * Can Place Flowers
 * 
 * Suppose you have a long flowerbed in which some of the plots are planted and
 * some are not. However, flowers cannot be planted in adjacent plots - they 
 * would compete for water and both would die.
 * 
 * Given a flowerbed (represented as an array containing 0 and 1, where 0 means
 * empty and 1 means not empty), and a number n, return if n new flowers can be
 * planted in it without violating the no-adjacent-flowers rule.
 * 
 * Example 1:
 * Input: flowerbed = [1,0,0,0,1], n = 1
 * Output: True
 * 
 * Example 2:
 * Input: flowerbed = [1,0,0,0,1], n = 2
 * Output: False
 * 
 * Note:
 * 1. The input array won't violate no-adjacent-flowers rule.
 * 2. The input array size is in the range of [1, 20000].
 * 3. n is a non-negative integer which won't exceed the input array size.
 * 
 * @author Johnny
 */
public class Solution605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed == null || flowerbed.length == 0 || n > flowerbed.length) {
            return false;
        }
        
        int i = 0;
        int count = 0;
        boolean left = true; // The left is 1, the current position is not valid
        while (i < flowerbed.length) {
            if (flowerbed[i] == 0) {
                if (!left) {
                    left = true;
                    i++;
                    continue;
                }
                if (i + 1 < flowerbed.length) {
                    if (flowerbed[i + 1] == 0) {
                        count++;
                        i += 2;
                        left = true;
                    } else {
                        i += 2;
                        left = false;
                    }
                } else {
                    count++;
                    break;
                }
            } else {
                left = false;
                i++;
            }
            if (count >= n) {
                return true;
            }
        }
        
        return count >= n;
    }
}
