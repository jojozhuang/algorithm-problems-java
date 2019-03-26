package johnny.algorithm.advanced;

public class RepeatingWordToTarget {
    public int findRepeatingTimes(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        int i = 0;
        int j = 0;
 
        while (j < len2) {
            char c = t.charAt(j);
            if (c == s.charAt(i%len1)) {
                j++;
            }
            i++;
        }
        if(i%len1 == 0) {
            return i/len1;
        } else {
            return i/len1 + 1;
        }
    }
}
