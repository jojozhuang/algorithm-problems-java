/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

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
    public Solution604(String compressedString) {
        
    }
    
    public char next() {
        return 'a';  
    }
    
    public boolean hasNext() {
        return false;
    }
}
/**
 * Your StringIterator object will be instantiated and called as such:
 * StringIterator obj = new StringIterator(compressedString);
 * char param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */