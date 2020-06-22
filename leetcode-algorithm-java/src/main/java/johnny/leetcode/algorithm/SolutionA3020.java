package johnny.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class SolutionA3020 {
    public String[] getFolderNames(String[] names) {
        Map<String, Integer> map = new HashMap<>();
        String[] ans = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            if (!map.containsKey(names[i])) {
                ans[i] = names[i];
                map.put(names[i], 0);
            } else {
                int index = map.get(names[i]) + 1;
                String first = names[i] + "(" + index + ")";
                String name = first;
                while (map.containsKey(name)) {
                    name = names[i] + "(" + (++index) + ")";
                }
                ans[i] = name;
                map.put(names[i], index);
                if (!map.containsKey(name)) {
                    map.put(name, 0);
                }
            }
        }

        return ans;
    }
}
