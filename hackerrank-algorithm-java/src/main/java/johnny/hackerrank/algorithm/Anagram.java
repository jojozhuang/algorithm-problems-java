package johnny.hackerrank.algorithm;

/**
 *
 * @author Johnny
 */
public class Anagram {
    public int makeAnagram(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        
        if (s.length() % 2 != 0) {
            return -1;
        }
        int index = s.length() / 2;
        String a = s.substring(0, index);
        String b = s.substring(index);
        int[] diffs = new int['z' - 'a' + 1];
        for(char c : a.toCharArray()){
            diffs[c - 'a']++;
        }
        for(char c : b.toCharArray()){
            diffs[c - 'a']--;
        }
        int sum1 = 0;
        int sum2 = 0;
        for(int diff : diffs){
            if (diff > 0) {
                sum1 += diff;
            } else if (diff < 0) {
                sum2 += -diff;
            }
        }
        
        return Math.max(sum1, sum2);
    }
}
