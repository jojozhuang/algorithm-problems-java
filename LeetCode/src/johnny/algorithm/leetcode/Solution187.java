package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
        List<String> res = new ArrayList<String>();
        if (s == null || s.length() == 0) {
            return res;
        }
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('A', 0);
        map.put('C', 1);
        map.put('G', 2);
        map.put('T', 3);
        
        HashMap<Integer, Integer> sumMap = new HashMap<Integer, Integer>();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum = ((sum << 2) + map.get(s.charAt(i))) & 0xFFFFF;
            if (i < 9) {
                continue;
            }
            if (!sumMap.containsKey(sum)) {
                sumMap.put(sum, 1);
            } else {
                sumMap.put(sum, sumMap.get(sum) + 1);
                if (sumMap.get(sum) == 2) {
                    res.add(s.substring(i - 9, i + 1));
                }
            }
        }
        
        return res;
    }
}
