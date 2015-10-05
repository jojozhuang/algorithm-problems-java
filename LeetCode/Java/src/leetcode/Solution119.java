/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Pascal's Triangle II.
 * Given an index k, return the kth row of the Pascal's triangle.
 * 
 * For example, given k = 3,
 * Return [1,3,3,1].
 * Note:
 * Could you optimize your algorithm to use only O(k) extra space?
 * 
 * @author Johnny
 */
public class Solution119 {
    
    //rowIndex starts from 0
    //just enhanced from Solution118 
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex<0)
            return new ArrayList();
        
        List<List<Integer>> listpath = new ArrayList();
        List<Integer> list = new ArrayList();

        for (int i = 0; i<=rowIndex; i++) {
            list = new ArrayList();
            if (i==0) {
                list.add(1);
            }
            else if(i==1) {
                list.add(1);
                list.add(1);
            }
            else {
                list.add(1);
                List<Integer> previous = listpath.get(i-1);
                for(int j=0; j<previous.size()-1;j++) {
                    list.add((previous.get(j) + previous.get(j+1)));
                }
                list.add(1);
            }
            listpath.add(list);
        }
        
        return listpath.get(rowIndex);
    }
    
    //improved with smaller storage space
    public List<Integer> getRow2(int rowIndex) {
        if (rowIndex<0)
            return new ArrayList();
        
        List<List<Integer>> previousRow = new ArrayList();
        List<Integer> list = new ArrayList();

        for (int i = 0; i<=rowIndex; i++) {
            list = new ArrayList();
            if (i==0) {
                list.add(1);
                previousRow.add(list);
            }
            else if(i==1) {
                list.add(1);
                list.add(1);
                previousRow.clear();
                previousRow.add(list);
            }
            else {
                list.add(1);
                List<Integer> previous = previousRow.get(0);
                for(int j=0; j<previous.size()-1;j++) {
                    list.add((previous.get(j) + previous.get(j+1)));
                }
                list.add(1);
                previousRow.clear();
                previousRow.add(list);
            }            
        }
        
        return list;
    }
    
    //implemented with recursive approach
    public List<Integer> getRow3(int rowIndex) {
        if (rowIndex<0)
            return new ArrayList();
        
        List<Integer> list = new ArrayList();

        for (int i = 0; i<=rowIndex; i++) {
            list = new ArrayList();
            if (i==0) {
                list.add(1);
            }
            else if(i==1) {
                list.add(1);
                list.add(1);
            }
            else {
                list.add(1);
                List<Integer> previous = getRow3(i-1);
                for(int j=0; j<previous.size()-1;j++) {
                    list.add((previous.get(j) + previous.get(j+1)));
                }
                list.add(1);
            }            
        }
        
        return list;
    }
}
