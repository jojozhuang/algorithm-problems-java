/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Remove Invalid Parentheses.
 * 
 * Remove the minimum number of invalid parentheses in order to make the input
 * string valid. Return all possible results.
 * 
 * Note: The input string may contain letters other than the parentheses ( and ).
 * 
 * Examples:
 * "()())()" -> ["()()()", "(())()"]
 * "(a)())()" -> ["(a)()()", "(a())()"]
 * ")(" -> [""]
 *  
 * @author Johnny
 */
public class Solution301 {
    //https://leetcode.com/discuss/81710/recommend-beginners-implementation-detailed-explaination
    public List<String> removeInvalidParentheses(String s) {
        List<String> res = new ArrayList<String>();
        if (s == null) {
            return res;
        }
        
        int left = 0, right = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') {
                left++;
            } else if(s.charAt(i) == ')'){
                if(left > 0) {
                    left--;
                } else {
                    right++;
                }
            }
        }

        dfs(res, "", s, 0, 0, left, right);
        
        Set<String> hs = new HashSet<>();
        hs.addAll(res);
        res.clear();
        res.addAll(hs);
        
        return res;
    } 
    
    /***
    list: stores all the satisfied solution string        
    curr: the current produced string
    s: origninal input string
    pos: record the cur-position int the string s
    pair: record the () pair count in the solution
    left: the number of left parentheses needed to delete
    right: the number of right parentheses needed to delete
    ***/
    private void dfs(List<String> list, String cur, String s, int pos, int pair, int left, int right){
        if(pos == s.length()){
            if(pair == 0 && left == 0 && right == 0) {
                list.add(cur);
            }
            return;
        }
        if(s.charAt(pos) == '('){
            if(left > 0){
                //skip by removing the left half parentheses
                dfs(list, cur, s, pos + 1, pair, left - 1, right);
            }
            dfs(list, cur + '(', s, pos + 1, pair + 1, left, right);
        }
        else if(s.charAt(pos) == ')'){
            if(right > 0){
                //skip by removing the right half parentheses
                dfs(list, cur, s, pos+1, pair, left, right-1);
            }
            if(pair > 0){
                dfs(list, cur + ')', s, pos + 1, pair - 1, left, right);
            }
        }
        else{
            dfs(list, cur + s.charAt(pos), s, pos + 1, pair, left, right);
        }
    }
}
