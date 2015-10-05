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
 * Permutation Sequence.
 * The set [1,2,3,…,n] contains a total of n! unique permutations.
 * 
 * By listing and labeling all of the permutations in order,
 * We get the following sequence (ie, for n = 3):
 * 
 * "123"
 * "132"
 * "213"
 * "231"
 * "312"
 * "321"
 * Given n and k, return the kth permutation sequence.
 * 
 * Note: Given n will be between 1 and 9 inclusive.
 * 
 * @author Johnny
 */
public class Solution060 {
    public String getPermutation(int n, int k) {
        if (n<1||k<=0)
            return "";
        
        int[] num = new int[n];
        for(int i=1; i<=n; i++) {
            num[i-1]=i;
        }
        
        List<List<Integer>> list = permute(num);
        List<Integer> ret = new ArrayList<Integer>();
        if (k>list.size())
            return "";
        else
            ret = list.get(k-1);
        
        StringBuilder sb = new StringBuilder();
        for(Integer i: ret) {
            sb.append(i.toString());
        }
        
        return sb.toString();
    }
    
    //comes from solution 46
    private List<List<Integer>> permute(int[] num) {
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
