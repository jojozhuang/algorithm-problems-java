/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Largest Number.
 * Given a list of non negative integers, arrange them such that they form the 
 * largest number.
 * 
 * For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.
 * 
 * Note: The result may be very large, so you need to return a string instead
 * of an integer.
 * 
 * @author Johnny
 */
public class Solution179 {
    //http://www.programcreek.com/2014/02/leetcode-largest-number-java/
    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }
        String[] strs = new String[nums.length];
        for(int i=0; i < nums.length; i++){
            strs[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strs, new Comparator<String>(){
            public int compare(String s1, String s2){
                String leftRight = s1 + s2;
                String rightLeft = s2 + s1;
                return rightLeft.compareTo(leftRight); // big to small
            }
        });

        StringBuilder sb = new StringBuilder();
        for(String s: strs){
            sb.append(s);
        }

        while(sb.charAt(0) == '0' && sb.length() > 1){
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }
    
    public String largestNumber2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }
        
        int[] arr = QuickSort(nums, 0, nums.length - 1);
        if (arr[0] == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for(int item: arr) {
            sb.append(item);
        }
        return sb.toString();
    }
    
    private int[] QuickSort(int[] nums, int start, int end) {
        if (nums == null || nums.length < 2 || start >= end) {
            return nums;
        }
        
        int pivot = Partition(nums, start, end);
        nums = QuickSort(nums, start, pivot - 1);
        nums = QuickSort(nums, pivot + 1, end);

        return nums;
    }   
    
    // one way
    private int Partition(int[] nums, int start, int end) {       
        int m = start; //index of the last less value
        
        for (int i = start + 1; i <= end; i++) {
            int flag = compare(nums[i], nums[start]);
            if (flag == 1) {
                m++;
                int temp = nums[m];
                nums[m] = nums[i];
                nums[i] = temp;
            }
        }
        
        int temp = nums[m];
        nums[m] = nums[start];
        nums[start] = temp;
        return m;
    }    
    
    // 0: val1 = val2; 1: val1 > val2; -1: val1 < val2
    private int compare(int val1, int val2) {
        if (val1 == val2) {
            return 0;
        }
        
        String str1 = String.valueOf(val1);
        String str2 = String.valueOf(val2);
        int i = 0;
        while(i < str1.length() && i < str2.length()) {
            if (str1.charAt(i) > str2.charAt(i)) {
                return 1;
            } else if (str1.charAt(i) < str2.charAt(i)) {
                return -1;
            } else {
                i++;
            }
        }
        
        if (i >= str1.length()) {
            if (str2.charAt(i) == '0') { //val1 = 345, val2 = 3450
                return 1;
            } else { //val1 = 345, val2 = 345678 or val2 = 345123
                return compare(val1, Integer.parseInt(str2.substring(i)));
            }
        } else { // if (i >= str2.length()) 
            if (str1.charAt(i) == '0') { //val1 = 3450, val2 = 345
                return -1;
            } else { //val1 = 345678 or val1 = 345123, val2 = 345
                return compare(Integer.parseInt(str1.substring(i)), val2);
            }
        }
    }
}
