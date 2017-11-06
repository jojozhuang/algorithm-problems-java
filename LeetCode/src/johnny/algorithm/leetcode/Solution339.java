/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.List;
import johnny.algorithm.leetcode.common.NestedInteger;

/**
 * Nested List Weight Sum.
 * Given a nested list of integers, return the sum of all integers in the list 
 * weighted by their depth.
 * 
 * Each element is either an integer, or a list -- whose elements may also be 
 * integers or other lists.
 * 
 * Example 1:
 * Given the list [[1,1],2,[1,1]], return 10. (four 1's at depth 2, one 2 at depth 1)
 * 
 * @author Johnny
 */
public class Solution339 {
    public int depthSum(List<NestedInteger> nestedList) {
        return helper(nestedList, 1);
    }

    private int helper(List<NestedInteger> nestedList, int depth){
        if(nestedList == null || nestedList.size() ==0 ) {
            return 0;
        }
        int sum=0;
        for(NestedInteger ni: nestedList){
            if(ni.isInteger()){
                sum += ni.getInteger() * depth;
            }else{
                sum += helper(ni.getList(), depth + 1);
            }
        }

        return sum;
    }
}
