package johnny.leetcode.algorithm;

/**
 *
 */
public class SolutionA3030 {
    public char findKthBit(int n, int k) {
        char[] arr = new char[]{'0'};
        // 1, 3, 7, 15
        for (int i = 1; i < n; i++) {
            char[] next = new char[arr.length*2+1];
            for (int j = 0; j < arr.length; j++) {
                next[j] = arr[j];
            }
            next[arr.length] = '1';
            char[] tail = arr.clone();
            invert(tail);
            reverse(tail);
            for (int j = arr.length + 1; j < next.length; j++) {
                next[j] = tail[j - arr.length - 1];
            }
            arr = next.clone();
        }

        return arr[k-1];
    }

    private void reverse(char[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private void invert(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '0') {
                arr[i] = '1';
            } else {
                arr[i] = '0';
            }
        }
    }
}
