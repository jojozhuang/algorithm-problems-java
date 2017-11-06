/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Text Justification.
 * 
 * Given an array of words and a length L, format the text such that each line
 * has exactly L characters and is fully (left and right) justified.
 * 
 * You should pack your words in a greedy approach; that is, pack as many words 
 * as you can in each line. Pad extra spaces ' ' when necessary so that each 
 * line has exactly L characters.
 * 
 * Extra spaces between words should be distributed as evenly as possible. If 
 * the number of spaces on a line do not divide evenly between words, the empty 
 * slots on the left will be assigned more spaces than the slots on the right.
 * 
 * For the last line of text, it should be left justified and no extra space is
 * inserted between words.
 * 
 * For example,
 * words: ["This", "is", "an", "example", "of", "text", "justification."]
 * L: 16.
 * 
 * Return the formatted lines as:
 * [
 *    "This    is    an",
 *    "example  of text",
 *    "justification.  "
 * ]
 * Note: Each word is guaranteed not to exceed L in length.
 * 
 * @author Johnny
 */
public class Solution068 {
    //https://discuss.leetcode.com/topic/4189/share-my-concise-c-solution-less-than-20-lines/3
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<String>();
        if (words == null || words.length == 0) {
            return res;
        }
        for(int i = 0, k, l; i < words.length; i += k) {
            for(k = l = 0; i + k < words.length && l + words[i+k].length() <= maxWidth - k; k++) {
                l += words[i+k].length();
            }
            String tmp = words[i];
            for(int j = 0; j < k - 1; j++) {
                if(i + k >= words.length) {
                    tmp += " ";
                }
                else {
                    int len = (maxWidth - l) / (k - 1);
                    if (j < (maxWidth - l) % (k - 1)){
                        len++;
                    }
                    char[] spaceArr = new char[len];
                    Arrays.fill(spaceArr, ' ');
                    tmp += new String(spaceArr);
                }
                tmp += words[i+j+1];
            }
            char[] spaceArr = new char[maxWidth - tmp.length()];
            Arrays.fill(spaceArr, ' ');
            tmp += new String(spaceArr);
            res.add(tmp);
        }
        return res;
    }
    public List<String> fullJustify3(String[] words, int L) {
        List<String> list = new LinkedList<String>();
        
        for (int i = 0, w; i < words.length; i = w) {
            int len = -1;
            for (w = i; w < words.length && len + words[w].length() + 1 <= L; w++) {
                len += words[w].length() + 1;
            }
            
            StringBuilder strBuilder = new StringBuilder(words[i]);
            int space = 1, extra = 0;
            if (w != i + 1 && w != words.length) { // not 1 char, not last line
                space = (L - len) / (w - i - 1) + 1;
                extra = (L - len) % (w - i - 1);
            }
            for (int j = i + 1; j < w; j++) {
                for (int s = space; s > 0; s--) strBuilder.append(' ');
                if (extra-- > 0) strBuilder.append(' ');
                strBuilder.append(words[j]);
            }
            int strLen = L - strBuilder.length();
            while (strLen-- > 0) strBuilder.append(' ');
            list.add(strBuilder.toString());
        }
        
        return list;
    }
    
    public List<String> fullJustify2(String[] words, int maxWidth) {
        List<String> ret = new ArrayList<String>();
        if (words == null || words.length == 0) {
            return ret;
        }
        
        int i = 0;
        int len = 0;
        List<String> list = new ArrayList<String>();
        while(i < words.length) {
            if (len + words[i].length() <= maxWidth) {
                len += words[i].length() + 1; // at least one space between words in the same line
                list.add(words[i]);
                i++;
            } else {
                String line = helper(list, maxWidth);
                ret.add(line);
                list.clear();
                len = 0;
            }           
        }
        
        if (!list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < list.size(); j++) {
                sb.append(list.get(j));
                if (j != list.size() - 1) {
                    sb.append(" ");
                }
            }
            int length = sb.toString().length();
            if (length < maxWidth) {
                for (int k = 0; k < maxWidth - length; k++) {
                    sb.append(" ");
                }
            }
            ret.add(sb.toString());
        }
        
        return ret;
    }
    
    private String helper(List<String> list, int maxWidth) {
        int slot = list.size() - 1;
        int space = 0;
        for(String s: list) {
            space += s.length();
        }
        space = maxWidth - space;
        StringBuilder sb = new StringBuilder();
        if (slot == 0) {
            sb.append(list.get(0));
            for (int i = 0; i < space; i++) {
                sb.append(" ");
            }
        } else {
            int unit = space / slot;
            int remainder = space % slot;

            String unitSpace = "";
            for (int i = 0; i < unit; i++) {
                unitSpace += " ";
            }
            
            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i));
                if (i != list.size() - 1) {
                    sb.append(unitSpace);
                    if (remainder > 0) {
                        sb.append(" ");
                        remainder--;
                    }
                }
            }
        }
        
        return sb.toString();
    }
}
