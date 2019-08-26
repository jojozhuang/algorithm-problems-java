package johnny.leetcode.algorithm.common;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetUtil {
    public static <T> Set<T> buildList(T[] array) {
        if (array == null || array.length == 0) {
            return new HashSet<T>();
        }
        
        return new HashSet<T>(Arrays.asList(array));
    }
}
