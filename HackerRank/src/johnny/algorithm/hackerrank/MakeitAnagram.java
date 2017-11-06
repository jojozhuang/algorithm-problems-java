/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.hackerrank;

/**
 *
 * @author Johnny
 */
public class MakeitAnagram {
    public int makeAnagram(String a, String b) {
        if (a == null || a.isEmpty() || b == null || b.isEmpty()) {
            return 0;
        }
        int[] diffs = new int['z' - 'a' + 1];
        for(char c : a.toCharArray()){
            diffs[c - 'a']++;
        }
        for(char c : b.toCharArray()){
            diffs[c - 'a']--;
        }
        int sum = 0;
        for(int diff : diffs){
            sum += Math.abs(diff);
        }
        return sum;
    }
}
