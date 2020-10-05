package johnny.leetcode.algorithm;

import java.util.Arrays;

/**
 * ZigZag Conversion.
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number
 * of rows like this: (you may want to display this pattern in a fixed font for
 * better legibility)
 * <p>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * <p>
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a
 * number of rows:
 * <p>
 * string convert(string text, int nRows);
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 *
 * @author Johnny
 */
public class Solution006 {
    // https://www.geekxh.com/1.0.%E6%95%B0%E7%BB%84%E7%B3%BB%E5%88%97/009.html#_02%E3%80%81%E9%A2%98%E7%9B%AE%E5%88%86%E6%9E%90
    public String convert(String s, int numRows) {
        if (s == null || s.length() == 0) {
            return "";
        }
        if (numRows <= 1) {
            return s;
        }

        int size = numRows * 2 - 2;
        String[] arr = new String[numRows];
        Arrays.fill(arr, "");
        for (int i = 0; i < s.length(); i++) {
            int row = i % size;
            if (row < numRows) {
                arr[row] += s.charAt(i);
            } else {
                arr[size - row] += s.charAt(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str);
        }
        return sb.toString();
    }

    public String convert2(String s, int nRows) {
        if (s == null || s.length() == 0) {
            return "";
        }
        if (nRows <= 1) {
            return s;
        }
        char[] c = s.toCharArray();
        int len = c.length;
        StringBuffer[] sb = new StringBuffer[nRows];
        for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();

        int i = 0;
        while (i < len) {
            for (int idx = 0; idx < nRows && i < len; idx++) // vertically down
                sb[idx].append(c[i++]);
            for (int idx = nRows - 2; idx >= 1 && i < len; idx--) // obliquely up
                sb[idx].append(c[i++]);
        }
        for (int idx = 1; idx < sb.length; idx++)
            sb[0].append(sb[idx]);
        return sb[0].toString();
    }

    //http://www.cnblogs.com/springfor/p/3889414.html
    public String convert3(String s, int numRows) {
        if (s == null || s.length() == 0) {
            return "";
        }
        if (numRows <= 1) {
            return s;
        }

        StringBuilder res = new StringBuilder();
        int size = 2 * numRows - 2;
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j += size) {
                res.append(s.charAt(j));
                if (i != 0 && i != numRows - 1) {//except the first row and the last row
                    int index = j + size - 2 * i;
                    if (index < s.length()) {
                        res.append(s.charAt(index));
                    }
                }
            }
        }
        return res.toString();
    }
}
