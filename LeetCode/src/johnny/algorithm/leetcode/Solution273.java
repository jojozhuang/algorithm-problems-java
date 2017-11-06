/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.HashMap;

/**
 * Integer to English Words.
 * 
 * Convert a non-negative integer to its english words representation. 
 * Given input is guaranteed to be less than 2^31 - 1.
 * 
 * For example,
 * 123 -> "One Hundred Twenty Three"
 * 12345 -> "Twelve Thousand Three Hundred Forty Five"
 * 1234567 -> "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
 * Show Hint 
 *  
 * @author Johnny
 */
public class Solution273 {
    //https://discuss.leetcode.com/topic/23054/my-clean-java-solution-very-easy-to-understand/9
    final String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    final String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    final String[] THOUSANDS = {"Billion", "Million", "Thousand", ""};
    final int[] radix = {1000000000, 1000000, 1000, 1};
    public String numberToWords(int num) {
        if (num <= 0) {
            return "Zero";
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < radix.length; i++) {
            if (num / radix[i] == 0) {
                continue;
            }

            sb.append(helper(num / radix[i])).append(THOUSANDS[i]).append(" ");
            num = num % radix[i];
        }
        return sb.toString().trim();
    }
    
    private String helper(int num) {
        if (num == 0) {
            return "";
        }
        if (num < 20) {
            return LESS_THAN_20[num] + " ";
        }
        if (num < 100) {
            return TENS[num / 10] + " " + helper(num % 10);
        }
        return LESS_THAN_20[num / 100] + " Hundred " + helper(num % 100);
    }
    
    public String numberToWords3(int num) {
        if (num == 0) return "Zero";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < radix.length; i++) {
            if (num / radix[i] == 0) {
                continue;
            }
            sb.append(trans(num / radix[i])).append(THOUSANDS[i]).append(' ');
            num %= radix[i];
        }
        return sb.toString().trim();
    }

    private String trans(int num) {
        if (num == 0) return "";
        if (num < 20) return LESS_THAN_20[num] + " ";
        if (num < 100) return TENS[num / 10] + " " + trans(num % 10);
        return LESS_THAN_20[num / 100] + " Hundred " + trans(num % 100);
    }

    public String numberToWords2(int num) {
        if (num < 0) {
            return "";
        }
        
        HashMap<Integer, String> dict = getDict();
        
        return singleNum(num, dict);
    }
    
    private String singleNum(int num, HashMap<Integer, String> dict) {
        StringBuilder sb = new StringBuilder();
        
        int curr = 0;
        boolean prefix = false;
        if (num >= 1000000000) { // Billion
            curr = num / 1000000000;
            sb.append(singleNum(curr, dict));
            sb.append(" ");
            sb.append(dict.get(1000000000));
            if (num % 1000000000 == 0) {
                return sb.toString();
            } else{
                num = num % 1000000000;
                prefix = true;
            }
        } 
        if (num >= 1000000) { // Million
            if (prefix) {
                sb.append(" ");
            }
            curr = num / 1000000;
            sb.append(singleNum(curr, dict));
            sb.append(" ");
            sb.append(dict.get(1000000));
            if (num % 1000000 == 0) {
                return sb.toString();
            } else{
                num = num % 1000000;
                prefix = true;
            }
        } 
        if (num >= 1000) { // Thousand
            if (prefix) {
                sb.append(" ");
            }
            curr = num / 1000;
            sb.append(singleNum(curr, dict));
            sb.append(" ");
            sb.append(dict.get(1000));
            if (num % 1000 == 0) {
                return sb.toString();
            } else{
                num = num % 1000;
                prefix = true;
            }
        } 
        
        if (prefix) {
            sb.append(" ");
        }
        if (num <= 20) {
            sb.append(dict.get(num));
        } else if (num <= 99) { //21 ~ 99
            int num1 = num % 10; // 34, 4
            int num2 = num - num1; // 30
            sb.append(dict.get(num2));            
            if (num1 != 0) {
                sb.append(" ");
                sb.append(dict.get(num1));
            }
        } else { // 100 ~ 999
            int num1 = num % 100; // 345, 45
            int num2 = num - num1; // 300
            sb.append(dict.get(num2/100));
            sb.append(" ");
            sb.append(dict.get(100));
            if (num1 != 0) {
                sb.append(" ");
                sb.append(singleNum(num1, dict));
            }
        }
        
        return sb.toString();       
    }
    
    private HashMap<Integer, String> getDict() {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(0, "Zero");
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(7, "Seven");
        map.put(8, "Eight");
        map.put(9, "Nine");
        map.put(10, "Ten");
        map.put(11, "Eleven");
        map.put(12, "Twelve");
        map.put(13, "Thirteen");
        map.put(14, "Fourteen");
        map.put(15, "Fifteen");
        map.put(16, "Sixteen");
        map.put(17, "Seventeen");
        map.put(18, "Eighteen");
        map.put(19, "Nineteen");
        map.put(20, "Twenty");
        map.put(30, "Thirty");
        map.put(40, "Forty");
        map.put(50, "Fifty");
        map.put(60, "Sixty");
        map.put(70, "Seventy");
        map.put(80, "Eighty");
        map.put(90, "Ninety");
        map.put(100, "Hundred");
        map.put(1000, "Thousand");
        map.put(1000000, "Million");
        map.put(1000000000, "Billion");
        return map;
    }
}
