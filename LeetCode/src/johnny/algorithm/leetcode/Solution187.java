package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<String>();
        if (s == null || s.length() == 0) {
            return res;
        }
        
        Set<String> seen = new HashSet<String>(); 
        Set<String> repeated = new HashSet<String>();
        for (int i = 0; i + 9 < s.length(); i++) {
            String ten = s.substring(i, i + 10);
            if (!seen.add(ten))
                repeated.add(ten);
        }
        return new ArrayList<String>(repeated);
    }
    //http://yuanhsh.iteye.com/blog/2185976
    //There are only four letters ACGT. The total combination is 4^10 = 1048576. Encode ACGT as
    //A = 00
    //C = 01
    //G = 10
    //T = 11
    // eg: AAACCC = 00 00 00 01 01 01(Binary) = 21(Decimal)
    // Each DNA(10 letters) can be represented as binary code. Each letter occupies 2 bits.
    // So, we need 20 bits to generate one DNA substring. Use 0xFFFFF as mask to eliminate
    // the first 10 bits. Use hashmap to store the encoded DNA substring. Compare new one with
    // existing one in the hashmap to get the substrings that occur more than once.
    public List<String> findRepeatedDnaSequences2(String s) {
        List<String> res = new ArrayList<String>();
        if (s == null || s.length() == 0) {
            return res;
        }
        
        HashMap<Character, Integer> codeMap = new HashMap<Character, Integer>();
        codeMap.put('A', 0); // 00
        codeMap.put('C', 1); // 01
        codeMap.put('G', 2); // 10
        codeMap.put('T', 3); // 11
        
        HashMap<Integer, Integer> dnaMap = new HashMap<Integer, Integer>();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            // use sum to keep the latest substring with 10 letters at most(20 bits)
            sum = ((sum << 2) + codeMap.get(s.charAt(i))) & 0xFFFFF;
            if (i < 9) {
                continue;
            }
            if (!dnaMap.containsKey(sum)) {
                dnaMap.put(sum, 1);
            } else {
                dnaMap.put(sum, dnaMap.get(sum) + 1);
                if (dnaMap.get(sum) == 2) {
                    res.add(s.substring(i - 9, i + 1));
                }
            }
        }
        
        return res;
    }
}
