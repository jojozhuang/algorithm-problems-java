/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.lintcode;

import java.util.HashMap;

/**
 * Two Sum.
 * Given an array of integers, find two numbers such that they add up to a 
 * specific target number.
 * The function twoSum should return indices of the two numbers such that they 
 * add up to the target, where index1 must be less than index2. Please note that
 * your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution.
 * 
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 * 
 * @author Johnny
 */
public class Solution001 {
    public int[] twoSum1(int[] numbers, int target) {
        int index1 =0, index2 = 0;
        for(int ix = 0; ix < numbers.length; ix++)
        {
            if (numbers[ix] >= target)
            {
            	break;
            }
            else
            {
              index1=ix;
              for (int jx = ix; jx<numbers.length; jx++)
              {
            	  if(numbers[jx]>=target)
                  {
            		  break;
                  }
            	  else if (numbers[jx] == target - numbers[ix])
                  {
                     index2=jx;
                     return new int[]{index1+1, index2+1};
                  }
              }
            }                 	
        }

        return new int[]{0,0};         
    }
    
    public int[] twoSum2(int[] numbers, int target) {
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); 
        int[] result = new int[2];
        for(int ix=0; ix<numbers.length; ix++)
        {
        	if(map.containsKey(numbers[ix]))
        	{
        		result[0] = map.get(numbers[ix]) + 1;
        		result[1] = ix+1;
        		return result;
        	}
        	else
        	{
        		map.put(target - numbers[ix], ix);
        	}
        }
        return result;
    }
}
