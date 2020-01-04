package johnny.leetcode.algorithm;

/**
 * Integer to English Words.
 * <p>
 * Convert a non-negative integer to its english words representation.
 * Given input is guaranteed to be less than 2^31 - 1.
 * <p>
 * For example,
 * 123 -> "One Hundred Twenty Three"
 * 12345 -> "Twelve Thousand Three Hundred Forty Five"
 * 1234567 -> "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
 * Show Hint
 *
 * @author Johnny
 */
public class Solution273 {
    //https://discuss.leetcode.com/topic/23054/my-clean-java-solution-very-easy-to-understand/9
    final String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    final String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    final String[] THOUSANDS = {"Billion", "Million", "Thousand", ""};
    final int[] radix = {1000000000, 1000000, 1000, 1};

    public String numberToWords(int num) {
        if (num <= 0) {
            return "Zero";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < radix.length; i++) {
            if (num / radix[i] == 0) {
                continue;
            }

            sb.append(helper(num / radix[i])).append(THOUSANDS[i]).append(" ");
            num = num % radix[i];
        }
        return sb.toString().trim();
    }

    private String helper(int num) {
        if (num == 0) {
            return "";
        }
        if (num < 20) {
            return LESS_THAN_20[num] + " ";
        }
        if (num < 100) {
            return TENS[num / 10] + " " + helper(num % 10);
        }
        return LESS_THAN_20[num / 100] + " Hundred " + helper(num % 100);
    }
}
