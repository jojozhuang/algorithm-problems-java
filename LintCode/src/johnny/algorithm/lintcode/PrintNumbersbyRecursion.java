/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Print Numbers by Recursion.
 * Print numbers from 1 to the largest number with N digits by recursion.
 * 
 * Example
 * Given N = 1, return [1,2,3,4,5,6,7,8,9].
 * 
 * Given N = 2, return [1,2,3,4,5,6,7,8,9,10,11,12,...,99].
 * 
 * Note
 * It's pretty easy to do recursion like:
 * 
 * recursion(i) {
 *     if i > largest number:
 *         return
 *     results.add(i)
 *     recursion(i + 1)
 * }
 * however this cost a lot of recursion memory as the recursion depth maybe very large. 
 * Can you do it in another way to recursive with at most N depth?
 * 
 * Challenge
 * Do it in recursion, not for-loop.
 * 
 * @author Johnny
 */
public class PrintNumbersbyRecursion {
    public List<Integer> numbersByRecursion(int n) {
        List<Integer> result = new ArrayList<Integer>();
        if (n <= 0) {
            return result;
        }
        
        helper(n, result);
        
        return result;
    }
    
    private void helper(int n, List<Integer> ret) {
        if (n == 0) {
            return;
        }
        
        helper(n - 1, ret);
        
        int base = (int)Math.pow(10, n - 1);
        int size = ret.size();
        
        for (int i = 1; i < 10; i++) {
            // 10 or 100,,,
            ret.add(base * i);
            for (int j = 0; j < size; j++) {
                // 11, 12, 13
                ret.add(ret.get(j) + base * i);
            }
        }        
    }
}
