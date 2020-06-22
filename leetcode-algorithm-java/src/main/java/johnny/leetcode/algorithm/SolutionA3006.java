package johnny.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class SolutionA3006 {
    List<String> list;
    int index =-1;
    public SolutionA3006(String homepage) {
        list = new ArrayList<>();
        list.add(homepage);
        index = 0;
    }

    public void visit(String url) {
        if (index != list.size() - 1) {
            list = list.subList(0, index + 1);
        }
        list.add(url);
        index = list.size() - 1;
    }

    public String back(int steps) {
        index -= steps;
        if (index < 0) {
            index = 0;
        }
        return list.get(index);
    }

    public String forward(int steps) {
        index += steps;
        if (index >= list.size()) {
            index = list.size() - 1;
        }
        return list.get(index);
    }
}
