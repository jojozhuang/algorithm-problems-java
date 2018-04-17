package johnny.algorithm.leetcode.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Johnny
 */
public class ListUtil {
    public static List<Integer> buildIntegerList(Integer[] array) {
        if (array == null || array.length == 0) {
            return new ArrayList<Integer>();
        }
        return Arrays.asList(array);
    }
    
    public static List<List<Integer>> buildIntegerList2(Integer[][] array) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (array == null || array.length == 0) {
            return res;
        }
        for (int i = 0; i < array.length; i++) {
            res.add(buildIntegerList(array[i]));
        }
        return res;
    }
    
    public static List<String> buildStringList(String[] array) {
        if (array == null || array.length == 0) {
            return new ArrayList<String>();
        }
        return new ArrayList<String>(Arrays.asList(array));
    }
    
    public static boolean equalLists(List<String> one, List<String> two){
        if (one == null && two == null){
            return true;
        }

        if((one == null && two != null) 
          || one != null && two == null
          || one.size() != two.size()){
            return false;
        }

        //to avoid messing the order of the lists we will use a copy
        //as noted in comments by A. R. S.
        one = new ArrayList<String>(one);
        two = new ArrayList<String>(two);

        Collections.sort(one);
        Collections.sort(two);
        return one.equals(two);
    }
}
