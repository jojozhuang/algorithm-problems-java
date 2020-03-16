package johnny.company.algorithm;

public class AStaticMain {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.maxLength("a");
        System.out.println(ans);

        int ans2 = method2("a");
        System.out.println(ans2);

    }

    static int method2(String s) {
        return s.length();
    }
}

class Solution {
    public int maxLength(String s) {
        return 0;
    }
}
