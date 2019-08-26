package johnny.leetcode.algorithm;

/**
 * Integer to Roman.
 * Given an integer, convert it to a roman numeral
 * Input is guaranteed to be within the range from 1 to 3999.
 * I - 1
 * II- 2
 * III-3
 * IV -4
 * V - 5
 * X - 10
 * L - 50
 * C - 100
 * D - 500
 * M - 1000
 * @author Johnny
 */
public class Solution012 {
    public String intToRoman(int num) {
        if (num <= 0) {
            return "";
        }
        // 1000,2000,3000
        String M[] = {"", "M", "MM", "MMM"};
        // 100,200,300,400,500,600,700,800,900,1000
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        // 10,20,30,40,50,60,70,80,90
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        // 1,2,3,4,5,6,7,8,9
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
    }
    //http://bangbingsyb.blogspot.com/2014/11/leetcode-integer-to-roman.html
    public String intToRoman2(int num) {
        if (num <= 0) {
            return "";
        }
        String[] dict = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] val = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 13; i++) {
            if(num >= val[i]) {
                int count = num / val[i];
                for(int j = 0; j < count; j++) {
                    sb.append(dict[i]);
                }
                num %= val[i];
            }
        }
        return sb.toString();
    }
}
