package johnny.algorithm.leetcode.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Johnny
 */
public class ListUtil {
    public static <T> List<List<T>> buildList2(T[][] array) {
        List<List<T>> res = new ArrayList<List<T>>();
        if (array == null || array.length == 0) {
            return res;
        }
        for (int i = 0; i < array.length; i++) {
            res.add(buildList(array[i]));
        }
        return res;
    }
    
    public static <T> List<T> buildList(T[] array) {
        if (array == null || array.length == 0) {
            return new ArrayList<T>();
        }
        //return Arrays.asList(array); // return unmodifiable list.
        // return modifiable list.
        return new LinkedList<>(Arrays.asList(array));
    }
    
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
    
    public static List<int[]> buildIntegerList3(int[][] array) {
        List<int[]> res = new ArrayList<int[]>();
        if (array == null || array.length == 0) {
            return res;
        }
        for (int i = 0; i < array.length; i++) {
            int[] elem = new int[array[i].length];
            for (int j = 0; j < array[i].length; j++) {
                elem[j] = array[i][j];
            }
            res.add(elem);
        }
        return res;
    }
    
    public static List<String> buildStringList(String[] array) {
        if (array == null || array.length == 0) {
            return new ArrayList<String>();
        }
        return new ArrayList<String>(Arrays.asList(array));
    }
    
    public static List<List<String>> buildStringList2(String[][] array) {
        List<List<String>> res = new ArrayList<List<String>>();
        if (array == null || array.length == 0) {
            return res;
        }
        for (int i = 0; i < array.length; i++) {
            res.add(buildStringList(array[i]));
        }
        return res;
    }
    /*
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
    }*/
    
    public static <T> boolean equalsIgnoreOrder(List<T> list1, List<T> list2) {
        if (list1 == null && list2 == null){
            return true;
        }

        if((list1 == null && list2 != null) 
          || list1 != null && list2 == null
          || list1.size() != list2.size()){
            return false;
        }

        return (list1.containsAll(list2) && list2.containsAll(list1));
        //Set<T> set1 = new HashSet<>(list1);
        //Set<T> set2 = new HashSet<>(list2);
        
        //return set1.equals(set2);
    }
    
    public static <T extends Comparable> boolean equalLists(List<T> list1, List<T> list2){
        if (list1 == null && list2 == null){
            return true;
        }

        if((list1 == null && list2 != null) 
          || list1 != null && list2 == null
          || list1.size() != list2.size()){
            return false;
        }

        //to avoid messing the order of the lists we will use a copy
        //as noted in comments by A. R. S.
        list1 = new ArrayList<T>(list1);
        list2 = new ArrayList<T>(list2);

        Collections.sort(list1);
        Collections.sort(list2);
        return list1.equals(list2);
    }
}
