package johnny.algorithm.leetcode;

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
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<Integer>();
        
        if (rowIndex <= 0) {
            res.add(1);
            return res;
        }
        
        res.add(1);
        for(int i = 1; i <= rowIndex; i++) {
            for (int j = res.size() - 2; j >=0 ; j--) {
                res.set(j + 1, res.get(j) + res.get(j + 1));
            }
            res.add(1);
        }
        return res;
    }
    // no extra space
    public List<Integer> getRow5(int rowIndex) {
        List<Integer> res = new ArrayList<Integer>();
        
        if (rowIndex <= 0) {
            res.add(1);
            return res;
        }
        
        res.add(1);
        for(int i = 1; i <= rowIndex; i++) {
            for (int j = res.size() - 2; j >=0 ; j--) {
                res.set(j + 1, res.get(j) + res.get(j + 1));
            }
            res.add(1);
        }
        return res;
    }
    //rowIndex starts from 0
    //just enhanced from Solution118 
    public List<Integer> getRow4(int rowIndex) {
        if (rowIndex<0)
            return new ArrayList<Integer>();
        
        List<List<Integer>> listpath = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i<=rowIndex; i++) {
            list = new ArrayList<Integer>();
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
            return new ArrayList<Integer>();
        
        List<List<Integer>> previousRow = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i<=rowIndex; i++) {
            list = new ArrayList<Integer>();
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
            return new ArrayList<Integer>();
        
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i<=rowIndex; i++) {
            list = new ArrayList<Integer>();
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
