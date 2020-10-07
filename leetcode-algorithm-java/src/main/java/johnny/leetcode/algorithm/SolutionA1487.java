package johnny.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * 1487. Making File Names Unique
 *
 * Given an array of strings names of size n. You will create n folders in your file system such that, at the ith minute, you will create a folder with the name names[i].
 *
 * Since two files cannot have the same name, if you enter a folder name which is previously used, the system will have a suffix addition to its name in the form of (k), where, k is the smallest positive integer such that the obtained name remains unique.
 *
 * Return an array of strings of length n where ans[i] is the actual name the system will assign to the ith folder when you create it.
 *
 *
 *
 * Example 1:
 *
 * Input: names = ["pes","fifa","gta","pes(2019)"]
 * Output: ["pes","fifa","gta","pes(2019)"]
 * Explanation: Let's see how the file system creates folder names:
 * "pes" --> not assigned before, remains "pes"
 * "fifa" --> not assigned before, remains "fifa"
 * "gta" --> not assigned before, remains "gta"
 * "pes(2019)" --> not assigned before, remains "pes(2019)"
 * Example 2:
 *
 * Input: names = ["gta","gta(1)","gta","avalon"]
 * Output: ["gta","gta(1)","gta(2)","avalon"]
 * Explanation: Let's see how the file system creates folder names:
 * "gta" --> not assigned before, remains "gta"
 * "gta(1)" --> not assigned before, remains "gta(1)"
 * "gta" --> the name is reserved, system adds (k), since "gta(1)" is also reserved, systems put k = 2. it becomes "gta(2)"
 * "avalon" --> not assigned before, remains "avalon"
 * Example 3:
 *
 * Input: names = ["onepiece","onepiece(1)","onepiece(2)","onepiece(3)","onepiece"]
 * Output: ["onepiece","onepiece(1)","onepiece(2)","onepiece(3)","onepiece(4)"]
 * Explanation: When the last folder is created, the smallest positive valid k is 4, and it becomes "onepiece(4)".
 * Example 4:
 *
 * Input: names = ["wano","wano","wano","wano"]
 * Output: ["wano","wano(1)","wano(2)","wano(3)"]
 * Explanation: Just increase the value of k each time you create folder "wano".
 * Example 5:
 *
 * Input: names = ["kaido","kaido(1)","kaido","kaido(1)"]
 * Output: ["kaido","kaido(1)","kaido(2)","kaido(1)(1)"]
 * Explanation: Please note that system adds the suffix (k) to current name even it contained the same suffix before.
 *
 */
public class SolutionA1487 {
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
