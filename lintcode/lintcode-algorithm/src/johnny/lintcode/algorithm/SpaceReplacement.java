package johnny.lintcode.algorithm;

/**
 * Space Replacement.
 * Write a method to replace all spaces in a string with %20. The string is given in a characters array, you can assume it has enough space for replacement and you are given the true length of the string.
 * You code should also return the new length of the string after replacement.
 * 
 * Example
 * Given "Mr John Smith", length = 13.
 * 
 * The string after replacement should be "Mr%20John%20Smith".
 * 
 * Note
 * If you are using Java or Python，please use characters array instead of string.
 * 
 * Challenge
 * Do it in-place.
 * 
 * @author Johnny
 */
public class SpaceReplacement {
     /**
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
    public int replaceBlank(char[] string, int length) {
        if (string == null || string.length == 0) {
            return 0;
        }
        
        int cnt = 0;
        for (int i = 0; i < length; i++) {
            if (string[i] == ' ') {
                cnt++;
            }
        }
        
        if (cnt == 0) {
            return length;
        }
        
        int newlength = length + 2 * cnt;
        int k = newlength;

        for (int j = length - 1; j >= 0; j--) {
            if (string[j] == ' ') {
                string[k - 1] = '0';
                string[k - 2] = '2';
                string[k - 3] = '%';
                k = k - 3;
            }
            else {
                string[k - 1] = string[j];
                k = k - 1;
            }
        }
        
        return newlength;        
        
    }
}
