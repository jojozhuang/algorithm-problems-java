/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 3Sum.
 * Given an array S of n integers, are there elements a, b, c in S such that 
 * a + b + c = 0? Find all unique triplets in the array which gives the sum of 
 * zero.
 * 
 * Note:
 * 1. Elements in a triplet (a,b,c) must be in non-descending order. 
 * (ie, a ≤ b ≤ c)
 * 2. The solution set must not contain duplicate triplets.
 *    For example, given array S = {-1 0 1 2 -1 -4},
 *    A solution set is:
 *    (-1, 0, 1)
 *    (-1, -1, 2)
 * 
 * @author Johnny
 */
public class Solution015 {
    //Brute force solution, O(N3)
    public List<List<Integer>> threeSum1(int[] num) {
        if(num.length < 3)
            return null;
        
        Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        List<Integer> zeroList = new ArrayList<Integer>();
        for (int i=0; i < num.length; i++) {
            for (int j=i+1; j < num.length; j++) {
                for (int k=j+1; k < num.length; k++) {
                    if (num[i]+num[j]+num[k]==0) {
                        zeroList = new ArrayList<Integer>();
                        zeroList.add(num[i]);
                        zeroList.add(num[j]);
                        zeroList.add(num[k]);
                        Collections.sort(zeroList);
                        if (!map.containsKey(getName(zeroList))) {
                            map.put(getName(zeroList), zeroList);
                            list.add(zeroList);
                        }
                    }
                }
            }
        }       
        
        return list;
    }    
    
    public List<List<Integer>> threeSum2(int[] num) {
        
        if(num==null||num.length < 3)
            return null;
              
        //final return list
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        //final hashmap which is stored the unique list for ret.
        Map<String, List<Integer>> retMap = new HashMap<String, List<Integer>>();
        //hashmap used for checking whether the valid integer list exists
        Map<Integer, List<List<Integer>>> map = new HashMap<Integer, List<List<Integer>>>();
        //temporary list, combined with item
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        //temporary item
        List<Integer> item = new ArrayList<Integer>();
        
        int i = 1;
        int j = 0;
        int sum = 0;
        while(i<num.length) {
            j=0;
            if(map.containsKey(num[i])) {
                list = buildList(num[i], map.get(num[i]));
                for(int k=0; k<list.size();k++) {
                    item = list.get(k);
                    if (!retMap.containsKey(getName(item))) {
                        retMap.put(getName(item), item);
                        ret.add(item);
                    }
                }
            }
            while(j<i) {
                sum = num[j]+num[i];
                item = new ArrayList<Integer>();
                if(num[j]>num[i]) {
                    item.add(num[i]);
                    item.add(num[j]);
                }
                else {
                    item.add(num[j]);
                    item.add(num[i]);
                }
                if(!map.containsKey(-sum)) {                    
                    list = new ArrayList<List<Integer>>();
                    list.add(item);
                    map.put(-sum,list);
                }
                else {
                    list = new ArrayList<List<Integer>>();
                    list = map.get(-sum);                                       
                    list.add(item);
                    map.replace(-sum,list);
                }
                j++;
            }
            i++;
        }
        
        return ret;
    }    
    
    private String getName(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<list.size(); i++) {
            sb.append(String.valueOf(list.get(i)));
            sb.append(",");
        }
        return sb.toString();                
    }
    
    private List<List<Integer>> buildList(int third, List<List<Integer>> firstTwo) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        for(int i=0; i<firstTwo.size();i++) {
            ret.add(buildItem(third, firstTwo.get(i)));
        }
        return ret;
    }
    private List<Integer> buildItem(int third, List<Integer> firstTwo) {
        List<Integer> ret = new ArrayList<Integer>();
        
        if (third <= firstTwo.get(0)) {
            ret.add(third);
            ret.addAll(firstTwo);
        }
        else if (third >= firstTwo.get(1)) {
            ret.addAll(firstTwo);
            ret.add(third);            
        }
        else {
            ret.add(firstTwo.get(0));
            ret.add(third);     
            ret.add(firstTwo.get(1));
        }
        
        return ret;
    }
    
    //List<List<Integer>>, O(n^2)
    public List<List<Integer>> threeSum3(int[] num) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
 
	if (num.length < 3)
            return ret;
 
	//sort array
	Arrays.sort(num);
 
	for (int i = 0; i < num.length - 2; i++) {
            //avoid duplicate solutions
            if (i == 0 || num[i] > num[i - 1]) {
                int negative = -num[i];

                int start = i + 1;
                int end = num.length - 1;

                while (start < end) {
                    //case 1
                    if (num[start] + num[end] == negative) {
                        ArrayList<Integer> item = new ArrayList<Integer>();
                        item.add(num[i]);
                        item.add(num[start]);
                        item.add(num[end]);
                        ret.add(item);

                        start++;
                        end--;
                        //avoid duplicate solutions
                        while (start < end && num[end] == num[end + 1])
                            end--;

                        while (start < end && num[start] == num[start - 1])
                            start++;
                    //case 2
                    } else if (num[start] + num[end] < negative) {
                        start++;
                    //case 3
                    } else {
                        end--;
                    }
                }      
            }
	}
 
	return ret;
     }    
}
