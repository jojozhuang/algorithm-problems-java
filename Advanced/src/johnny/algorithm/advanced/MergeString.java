package johnny.algorithm.advanced;

import java.util.ArrayList;
import java.util.List;

public class MergeString {
    
    public void merge(String s1, String s2) {
        //int i = 0;
        //int j = 0;
        List<List<Character>> ans = new ArrayList<>();
        dfs(s1.toCharArray(), 0, s2.toCharArray(), 0, new ArrayList<>(), ans);
        System.out.println(ans);
        //retu
    }
    
    /*public List<List<Character>> merge(String[] strs) {
        List<List<Character>> ans = new ArrayList<>();
        if (strs == null || strs.length == 0) {
            return ans;
        }

        dfs(arr1, 0, new ArrayList<>(), ans);

        return ans;
    }*/

    private void dfs(char[] arr1, int pos1, char[] arr2, int pos2, List<Character> list, List<List<Character>> ans) {
        ans.add(new ArrayList<>(list));

        for (int i = pos1; i < arr1.length; i++) {
            list.add(arr1[i]);
            for (int j = pos2; j < arr2.length; j++) {
                list.add(arr2[j]);
                dfs(arr1, i + 1, arr2, j + 1, list, ans);
                list.remove(list.size() - 1);
            }
            list.remove(list.size() - 1);
        }
    }
    
    
}
