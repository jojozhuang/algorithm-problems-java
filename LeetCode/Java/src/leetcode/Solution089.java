/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Gray Code.
 * The gray code is a binary numeral system where two successive values differ 
 * in only one bit.
 * 
 * Given a non-negative integer n representing the total number of bits in the 
 * code, print the sequence of gray code. A gray code sequence must begin with 0.
 * 
 * For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:
 * 
 * 00 - 0
 * 01 - 1
 * 11 - 3
 * 10 - 2
 * Note:
 * For a given n, a gray code sequence is not uniquely defined.
 * 
 * For example, [0,2,3,1] is also a valid gray code sequence according to the 
 * above definition.
 * 
 * For now, the judge is able to judge based on one instance of gray code 
 * sequence. Sorry about that.
 * 
 * @author Johnny
 */
public class Solution089 {
    public List<Integer> grayCode(int n) {
        List<List<Integer>> codeList = grayCodeList(n);
        List<Integer> ret = new ArrayList<Integer>();
        //Binary to decimal
        for(List<Integer> item: codeList) {
            ret.add(binaryToDecimal(item));
        }
        return ret;
    }
    
    private List<List<Integer>> grayCodeList(int n) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (n<=0){
            List<Integer> item = new ArrayList<Integer>();
            item.add(0);
            ret.add(item);
        }            
        else if(n==1) {
            List<Integer> item = new ArrayList<Integer>();
            item.add(0);
            ret.add(item);
            item = new ArrayList<Integer>();
            item.add(1);
            ret.add(item);
        }
        else {
            List<List<Integer>> list = grayCodeList(n-1);
            
            int i;
            List<Integer> item;
            //build the first part
            for(i=0; i<list.size(); i++) {
                item = new ArrayList<Integer>(); 
                item.add(0);
                item.addAll(list.get(i));
                ret.add(item);
            }
            //build the second part by reverse
            for(i=list.size()-1; i>=0; i--) {
                item = new ArrayList<Integer>(); 
                item.add(1);
                item.addAll(list.get(i));
                ret.add(item);
            }            
        }
        
        return ret;
    }
    
    private int binaryToDecimal(List<Integer> list) {
        int ret = 0;
        
        for (int i=0; i<list.size(); i++) {
            if (list.get(i)==1)
                ret = ret + (int)(Math.pow(2, (list.size()-i-1)));
        }
        
        return ret;
    }
}
