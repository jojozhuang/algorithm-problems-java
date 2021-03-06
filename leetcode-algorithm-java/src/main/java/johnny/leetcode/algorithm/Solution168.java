package johnny.leetcode.algorithm;

import java.util.Stack;

/**
 * Excel Sheet Column Title.
 * Given a positive integer, return its corresponding column title as appear
 * in an Excel sheet.
 * For example:
 * <pre>{@code
 *     1 -> A
 *     2 -> B
 *     3 -> C
 *     ...
 *     26 -> Z
 *     27 -> AA
 *     28 -> AB
 * }</pre>
 *
 * @author Johnny
 */
public class Solution168 {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            if (n % 26 == 0) {
                sb.append("Z");
            } else {
                sb.append((char) (n % 26 - 1 + 'A'));
            }

            n = (n - 1) / 26;
        }

        return sb.reverse().toString();
    }

    public String convertToTitle3(int n) {
        if (n <= 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            n--;
            sb.append(Character.toChars(n % 26 + 65)); // 65 is 'A'
            n = n / 26;
        }

        sb.reverse();
        return sb.toString();
    }

    public String convertToTitle2(int n) {
        if (n <= 0)
            return "";

        int NUM26 = 26;
        String ret = "";
        int quotient = n;
        int remainder = 0;
        Stack<String> st = new Stack<String>();

        while (quotient > 0) {
            remainder = quotient % NUM26;
            if (remainder == 0)
                remainder = 26;
            st.push(getLetter(remainder));
            quotient = (quotient - remainder) / NUM26;
        }

        while (!st.empty())
            ret = ret + st.pop();

        return ret;

    }

    private String getLetter(int num) {
        String ret;
        switch (num) {
            case 0:
                ret = "Z";
                break;
            case 1:
                ret = "A";
                break;
            case 2:
                ret = "B";
                break;
            case 3:
                ret = "C";
                break;
            case 4:
                ret = "D";
                break;
            case 5:
                ret = "E";
                break;
            case 6:
                ret = "F";
                break;
            case 7:
                ret = "G";
                break;
            case 8:
                ret = "H";
                break;
            case 9:
                ret = "I";
                break;
            case 10:
                ret = "J";
                break;
            case 11:
                ret = "K";
                break;
            case 12:
                ret = "L";
                break;
            case 13:
                ret = "M";
                break;
            case 14:
                ret = "N";
                break;
            case 15:
                ret = "O";
                break;
            case 16:
                ret = "P";
                break;
            case 17:
                ret = "Q";
                break;
            case 18:
                ret = "R";
                break;
            case 19:
                ret = "S";
                break;
            case 20:
                ret = "T";
                break;
            case 21:
                ret = "U";
                break;
            case 22:
                ret = "V";
                break;
            case 23:
                ret = "W";
                break;
            case 24:
                ret = "X";
                break;
            case 25:
                ret = "Y";
                break;
            case 26:
                ret = "Z";
                break;
            default:
                ret = "";
        }

        return ret;

    }
}
