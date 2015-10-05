/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Permutations II.
 * Given a collection of numbers that might contain duplicates, return all 
 * possible unique permutations.
 * 
 * For example,
 * [1,1,2] have the following unique permutations:
 * [1,1,2], [1,2,1], and [2,1,1].
 * 
 * @author Johnny
 */
public class Solution047 {
    public List<List<Integer>> permuteUnique(int[] num) {
        List<Integer> permutation = new ArrayList<Integer>();
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        if (num==null||num.length==0)
            return list;
        
        Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();        
        int[] next = num;
        boolean hasnext = true;
        
        permutation = convert(next);
        map.put(getName(permutation), permutation);
        list.add(permutation);
        while(hasnext) {
            next = nextPermutation(next);
            permutation = convert(next);
            if (!map.containsKey(getName(permutation))) {
                map.put(getName(permutation), permutation);
                list.add(permutation);
            }
            else
                hasnext = false;
        }
   
        return list;
        
    }
    
    private String getName(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<list.size(); i++) {
            sb.append(String.valueOf(list.get(i)));
            sb.append(",");
        }
        return sb.toString();                
    }
    
    private List<Integer> convert(int[] num) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<num.length; i++) {
            list.add(num[i]);
        }
        return list;
    }
    
    private int[] nextPermutation(int[] num) {
        //http://fisherlei.blogspot.com/2012/12/leetcode-next-permutation.html
        if (num==null||num.length==0)
            return num;
        
        int partitionindex = -1;
        int changeindex = -1;
        int i = num.length - 1;
        //find partition number which is the first descending number
        while(i>0) {
            if (num[i]>num[i-1]) {
                partitionindex = i-1;
                break;
            }
            i--;
        }
        if (partitionindex==-1) {
            return reverse(num, 0, num.length - 1);
        }
        //find the first number which is bigger than partition number
        i = num.length - 1;
        while(i>0) {
            if (num[i]>num[partitionindex]) {
                changeindex = i;
                break;
            }
            i--;
        }
        //swap
        swap(num, partitionindex, changeindex);
        //int[] leftpart = Arrays.copyOfRange(num, 0, partitionindex);
        //int[] rightpart = Arrays.copyOfRange(num, partitionindex+1, num.length - 1);
        
        return reverse(num, partitionindex+1, num.length - 1);
    }
    
    private void swap (int[] num, int i, int j) {
        int t = num[i];
        num[i] = num[j];
        num[j] = t;
      }
    
    private int[] reverse(int[] nums, int start, int end) {
        if (nums==null||nums.length==0)
            return nums;       
        
        while(start<=end) {
            swap(nums, start, end);
            start++;
            end--;
        }
        return nums;
    }
}
