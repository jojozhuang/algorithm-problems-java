/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
*728. Self Dividing Numbers
*A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

Also, a self-dividing number is not allowed to contain the digit zero.

Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.

Example 1:
Input: 
left = 1, right = 22
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
Note:

The boundaries of each input argument are 1 <= left <= right <= 10000. 
 * @author Johnny
 */
public class Solution728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<Integer>();
        if (left < 1 || right > 10000 || left > right) {
            return res;
        }
        
        for (int i = left; i <= right; i++) {
            if (isDividingNumber(i)) {
                res.add(i);
            }
        }
        
        return res;
       
    }
    
    private boolean isDividingNumber(int num) {
        int original = num;
        while (num > 0) {
            int remainder = num % 10;
            if (remainder == 0) {
                return false;
            }
            if (original % remainder != 0) {
                return false;
            }
            num = num / 10;
        }
        return true;
    }
}
