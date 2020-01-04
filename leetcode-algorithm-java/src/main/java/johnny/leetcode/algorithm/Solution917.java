package johnny.leetcode.algorithm;

/**
 * 917. Reverse Only Letters
 * Given a string S, return the "reversed" string where all characters that are not a letter stay in the same place, and all letters reverse their positions.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: "ab-cd"
 * Output: "dc-ba"
 * Example 2:
 * <p>
 * Input: "a-bC-dEf-ghIj"
 * Output: "j-Ih-gfE-dCba"
 * Example 3:
 * <p>
 * Input: "Test1ng-Leet=code-Q!"
 * Output: "Qedo1ct-eeLg=ntse-T!"
 * <p>
 * <p>
 * Note:
 * <p>
 * S.length <= 100
 * 33 <= S[i].ASCIIcode <= 122
 * S doesn't contain \ or "
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
