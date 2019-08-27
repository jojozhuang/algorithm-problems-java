package johnny.lintcode.algorithm;

/**
 * Rotate String.
 * Given a string and an offset, rotate string by offset. (rotate from left to right)
 * 
 * Example
 * Given "abcdefg".
 * offset=0 => "abcdefg"
 * offset=1 => "gabcdef"
 * offset=2 => "fgabcde"
 * offset=3 => "efgabcd"
 * 
 * Challenge
 * Rotate in-place with O(1) extra memory.
 * 
 * @author Johnny
 */
public class RotateString {
    /**
     * @param str: an array of char
     * @param offset: an integer
     * @return: nothing
     */
    public void rotateString(char[] str, int offset) {
        if (str == null || str.length == 0) {
            return;
        }
        
        if (offset < 0 || offset == str.length) {
            return;
        }
        
        if (offset > str.length) {
            offset = offset % str.length;
        }
        
        rotate(str, 0, str.length - offset - 1);
        rotate(str, str.length - offset, str.length - 1);
        rotate(str, 0, str.length - 1);
        
    }
    private void rotate(char[] str, int start, int end) {
        while(start < end) {
            swap(str, start, end);
            start++;
            end--;
        }
    }
    private void swap(char[] str, int first, int second) {
        char temp = str[first];
        str[first] = str[second];
        str[second] = temp;
    }
}
