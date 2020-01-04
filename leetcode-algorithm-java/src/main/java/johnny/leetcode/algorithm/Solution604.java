package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Design Compressed String Iterator
 * 
 * Design and implement a data structure for a compressed string iterator. It 
 * should support the following operations: next and hasNext.
 * 
 * The given compressed string will be in the form of each letter followed by a 
 * positive integer representing the number of this letter existing in the 
 * original uncompressed string.
 * 
 * next() - if the original string still has uncompressed characters, return the next letter; Otherwise return a white space.
 * hasNext() - Judge whether there is any letter needs to be uncompressed.
 * 
 * Note:
 * Please remember to RESET your class variables declared in StringIterator, as 
 * static/class variables are persisted across multiple test cases. Please see 
 * here for more details.
 * 
 * Example:
 * StringIterator iterator = new StringIterator("L1e2t1C1o1d1e1");
 * iterator.next(); // return 'L'
 * iterator.next(); // return 'e'
 * iterator.next(); // return 'e'
 * iterator.next(); // return 't'
 * iterator.next(); // return 'C'
 * iterator.next(); // return 'o'
 * iterator.next(); // return 'd'
 * iterator.hasNext(); // return true
 * iterator.next(); // return 'e'
 * iterator.hasNext(); // return false
 * iterator.next(); // return ' '
 * 
 * @author Johnny
 */
public class Solution604 {
    int index = 0;
    List<Character> chars = new ArrayList<>();
    List<Integer> count = new ArrayList<>();
    public Solution604(String compressedString) {
        int i = 0;
        while (i < compressedString.length()) {
            chars.add(compressedString.charAt(i));
            i++;
            int sum = 0;
            while (i < compressedString.length() && Character.isDigit(compressedString.charAt(i))) {
                sum = sum * 10 + (compressedString.charAt(i) - '0');
                i++;
            }
            count.add(sum);
        }
    }
    
    public char next() {
        if (index >= chars.size()) {
            return ' ';
        }
        char c = chars.get(index);
        count.set(index, count.get(index) - 1);
        if (count.get(index) == 0) {
            index++;
        }
        return c;
    }
    
    public boolean hasNext() {
        return index < chars.size();
    }
    
    /*
    Queue<int[]> queue = new LinkedList<>();
    
    public Solution604(String s) {
        int i = 0, n = s.length();
        while (i < n) {
            int j = i+1;
            while (j < n && s.charAt(j) - 'A' < 0) j++;
            queue.add(new int[]{s.charAt(i) - 'A',  Integer.parseInt(s.substring(i+1, j))});
            i = j;
        }
    }
    
    public char next() {
        if (queue.isEmpty()) return ' ';
        int[] top = queue.peek();
        if (--top[1] == 0) queue.poll();
        return (char) ('A' + top[0]);
    }
    
    public boolean hasNext() {
        return !queue.isEmpty();
    }*/
}
/**
 * Your StringIterator object will be instantiated and called as such:
 * StringIterator obj = new StringIterator(compressedString);
 * char param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */