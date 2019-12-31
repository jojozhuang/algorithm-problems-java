package johnny.lintcode.algorithm.common;

import java.util.ArrayList;
import java.util.Arrays;
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
    
    public static List<List<Integer>> buildDoubleIntegerList(Integer[][] array) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (array == null || array.length == 0) {
            return res;
        }
        for (int i = 0; i < array.length; i++) {
            res.add(buildIntegerList(array[i]));
        }
        return res;
    }
}
