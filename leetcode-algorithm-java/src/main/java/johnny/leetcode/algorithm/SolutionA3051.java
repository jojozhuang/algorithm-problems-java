package johnny.leetcode.algorithm;

/**
 *
 */
public class SolutionA3051 {
    public String modifyString(String s) {
        char[] letters = s.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == '?') {
                for (int j = 0; j < 26; j++) {
                    char c = (char)('a' + j);
                    if (i == 0 && i == letters.length - 1 ||
                            i == 0 && i < letters.length - 1 && letters[i+1] != c ||
                            i > 0 && letters[i-1] != c && i < letters.length - 1 && letters[i+1] != c ||
                            i > 0 && letters[i-1] != c && i == letters.length - 1) {
                        letters[i] = c;
                        break;
                    }
                }
            }
        }
        return new String(letters);
    }
}
