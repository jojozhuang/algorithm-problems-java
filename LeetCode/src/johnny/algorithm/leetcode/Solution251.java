package johnny.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Flatten 2D Vector.
 * Implement an iterator to flatten a 2d vector.
 * 
 * For example, Given 2d vector =
 * 
 * [
 *   [1,2],
 *   [3],
 *   [4,5,6]
 * ] 
 * By calling next repeatedly until hasNext returns false, the order of 
 * elements returned by next should be: [1,2,3,4,5,6].
 * 
 * @author Johnny
 */
public class Solution251 implements Iterator<Integer> {    
    //https://segmentfault.com/a/1190000003791233
    List<Iterator<Integer>> list;
    int curr = 0;
    
    public Solution251(List<List<Integer>> vec2d) {
        this.list = new ArrayList<Iterator<Integer>>();
        for(List<Integer> item : vec2d){
            if(item.size() > 0){
               this.list.add(item.iterator()); 
            }
        }
    }
    
    @Override
    public Integer next() {
        Integer res = list.get(curr).next();
        if(!list.get(curr).hasNext()){
            curr++;
        }
        return res;
    }
    
    @Override
    public boolean hasNext() {
        return curr < list.size() && list.get(curr).hasNext();
    }
}
