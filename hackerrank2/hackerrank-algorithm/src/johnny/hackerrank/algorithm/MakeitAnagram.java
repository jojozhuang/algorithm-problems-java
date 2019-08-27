package johnny.hackerrank.algorithm;

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
