package johnny.leetcode.algorithm;

/**
 * 917. Reverse Only Letters
 * Given a string S, return the "reversed" string where all characters that are not a letter stay in the same place, and all letters reverse their positions.
 * <p>
 * Example 1:
 * Input: "ab-cd"
 * Output: "dc-ba"
 * <p>
 * Example 2:
 * Input: "a-bC-dEf-ghIj"
 * Output: "j-Ih-gfE-dCba"
 * <p>
 * Example 3:
 * Input: "Test1ng-Leet=code-Q!"
 * Output: "Qedo1ct-eeLg=ntse-T!"
 * <p>
 * Note:
 * <pre>{@code
 * S.length <= 100
 * 33 <= S[i].ASCIIcode <= 122
 * S doesn't contain \ or "
 * }</pre>
 *
 * @author Johnny
 */
public class Solution917 {
    public String reverseOnlyLetters(String S) {
        if (S == null || S.length() == 0) {
            return S;
        }

        int left = 0;
        int right = S.length() - 1;

        char[] arr = S.toCharArray();
        while (left < right) {
            while (left < S.length() && !Character.isLetter(arr[left])) {
                left++;
            }
            while (right >= 0 && !Character.isLetter(arr[right])) {
                right--;
            }
            if (left >= right) {
                break;
            }
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return new String(arr);
    }
}
