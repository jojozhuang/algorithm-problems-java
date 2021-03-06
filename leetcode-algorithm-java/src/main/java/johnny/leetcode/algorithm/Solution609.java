package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Find Duplicate File in System
 * <p>
 * Given a list of directory info including directory path, and all the files
 * with contents in this directory, you need to find out all the groups of
 * duplicate files in the file system in terms of their paths.
 * <p>
 * A group of duplicate files consists of at least two files that have exactly the same content.
 * <p>
 * A single directory info string in the input list has the following format:
 * <p>
 * "root/d1/d2/.../dm f1.txt(f1_content) f2.txt(f2_content) ... fn.txt(fn_content)"
 * <p>
 * It means there are n files (f1.txt, f2.txt ... fn.txt with content f1_content, f2_content ... fn_content, respectively) in directory root/d1/d2/.../dm. Note that {@code n >= 1 and m >= 0}. If m = 0, it means the directory is just the root directory.
 * The output is a list of group of duplicate file paths. For each group, it contains all the file paths of the files that have the same content. A file path is a string that has the following format:
 * <p>
 * "directory_path/file_name.txt"
 * <p>
 * Example 1:
 * Input:
 * ["root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"]
 * Output:
 * [["root/a/2.txt","root/c/d/4.txt","root/4.txt"],["root/a/1.txt","root/c/3.txt"]]
 * <p>
 * Note:
 * 1. No order is required for the final output.
 * 2. You may assume the directory name, file name and file content only has letters and digits, and the length of file content is in the range of [1,50].
 * 3. The number of files given is in the range of [1,20000].
 * 4. You may assume no files or directories share the same name in the same directory.
 * 5. You may assume each given directory info represents a unique directory. Directory path and file info are separated by a single blank space.
 * <p>
 * Follow-up beyond contest:
 * 1. Imagine you are given a real file system, how will you search files? DFS or BFS?
 * 2. If the file content is very large (GB level), how will you modify your solution?
 * 3. If you can only read the file by 1kb each time, how will you modify your solution?
 * 4. What is the time complexity of your modified solution? What is the most time-consuming part and memory consuming part of it? How to optimize?
 * 5. How to make sure the duplicated files you find are not false positive?
 *
 * @author Johnny
 */
public class Solution609 {
    public List<List<String>> findDuplicate(String[] paths) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String path : paths) {
            String[] values = path.split(" ");
            for (int i = 1; i < values.length; i++) {
                String[] content = values[i].split("\\(");
                content[1] = content[1].replace(")", "");
                List<String> list = map.getOrDefault(content[1], new ArrayList<String>());
                list.add(values[0] + "/" + content[0]);
                map.put(content[1], list);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key).size() > 1) {
                res.add(map.get(key));
            }
        }

        return res;
    }

    public List<List<String>> findDuplicate2(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();
        for (String path : paths) {
            String[] tokens = path.split(" ");
            for (int i = 1; i < tokens.length; i++) {
                String file = tokens[i].substring(0, tokens[i].indexOf('('));
                String content = tokens[i].substring(tokens[i].indexOf('(') + 1, tokens[i].indexOf(')'));
                map.putIfAbsent(content, new ArrayList<>());
                map.get(content).add(tokens[0] + "/" + file);
            }
        }
        return map.values().stream().filter(e -> e.size() > 1).collect(Collectors.toList());
    }
}
