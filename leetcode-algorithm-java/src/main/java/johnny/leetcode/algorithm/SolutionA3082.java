package johnny.leetcode.algorithm;

import java.util.*;

/**
 *
 */
public class SolutionA3082 {
    Map<String, LinkedHashSet<String>> children;
    Set<String> death;
    String king;
    public SolutionA3082(String kingName) {
        king = kingName;
        children = new HashMap<>();
        children.put(kingName, new LinkedHashSet<>());
        death = new HashSet<>();
    }

    public void birth(String parentName, String childName) {
        if (!children.containsKey(parentName)) {
            children.put(parentName, new LinkedHashSet<>());
        }
        children.get(parentName).add(childName);
    }

    public void death(String name) {
        death.add(name);
    }

    public List<String> getInheritanceOrder() {
        List<String> list = new ArrayList<>();
        if (!death.contains(king)) {
            list.add(king);
        }
        helper(children, children.get(king), death, list);
        return list;
    }

    private void helper(Map<String, LinkedHashSet<String>> map, LinkedHashSet<String> set, Set<String> death, List<String> list) {
        if (set == null) {
            return;
        }
        for (String child : set) {
            if (!death.contains(child)) {
                list.add(child);
            }
            helper(map, map.get(child), death, list);
        }
    }
}
