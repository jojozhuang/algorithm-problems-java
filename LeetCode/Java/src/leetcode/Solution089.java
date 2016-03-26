/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Gray Code.
 * The gray code is a binary numeral system where two successive values differ 
 * in only one bit.
 * 
 * Given a non-negative integer n representing the total number of bits in the 
 * code, print the sequence of gray code. A gray code sequence must begin with 0.
 * 
 * For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:
 * 
 * 00 - 0
 * 01 - 1
 * 11 - 3
 * 10 - 2
 * Note:
 * For a given n, a gray code sequence is not uniquely defined.
 * 
 * For example, [0,2,3,1] is also a valid gray code sequence according to the 
 * above definition.
 * 
 * For now, the judge is able to judge based on one instance of gray code 
 * sequence. Sorry about that.
 * 
 * @author Johnny
 */
public class Solution089 {
    //http://fisherlei.blogspot.com/2012/12/leetcode-gray-code.html
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList();
        if (n <= 0) {
            res.add(0);
            return res;
        }
        
        if (n == 1) {
            res.add(0);
            res.add(1);
            return res;
        }
        
        List<Integer> list = grayCode(n - 1);
        res.addAll(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            int num = (1 << n - 1) + list.get(i);
            res.add(num);
        }
        
        return res;
    }
}
