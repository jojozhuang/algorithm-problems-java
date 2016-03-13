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
 * Repeated DNA Sequences.
 * All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T,
 * for example: "ACGAATTCCG". When studying DNA, it is sometimes useful to 
 * identify repeated sequences within the DNA.
 * 
 * Write a function to find all the 10-letter-long sequences (substrings) that 
 * occur more than once in a DNA molecule.
 * 
 * For example,
 * 
 * Given s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT",
 * 
 * Return:
 * ["AAAAACCCCC", "CCCCCAAAAA"].
 * 
 * @author Johnny
 */
public class Solution187 {
    //http://yuanhsh.iteye.com/blog/2185976
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();  
        if(s == null || s.length() < 10) {
            return result;
        }
        
        Map<Character, Integer> map = new HashMap<>();  
        map.put('A', 0);  
        map.put('C', 1);  
        map.put('G', 2);  
        map.put('T', 3);  
        Map<Integer, Integer> sumMap = new HashMap<>();  
       
        int sum = 0;  
        for(int i = 0; i < s.length(); i++) {  
            sum = ((sum << 2) + map.get(s.charAt(i))) & 0xFFFFF;  
            if (i < 9) {
                continue;
            }
            Integer cnt = sumMap.get(sum);
            if (cnt == null) {
                sumMap.put(sum, 1);  
            } else {
                sumMap.put(sum, cnt + 1); 
                if (cnt == 1) {
                    result.add(s.substring(i - 9,i + 1));  
                }
            }           
        }  
        return result;  
    }
}
