package johnny.leetcode.algorithm;

/**
 * Multiply Strings.
 * Given two numbers represented as strings, return multiplication of the 
 * numbers as a string.
 * 
 * Note: The numbers can be arbitrarily large and are non-negative.
 * 
 * @author Johnny
 */
public class Solution043 {
    public String multiply(String num1, String num2) {
        if (num1 == null || num2 == null) {
            return null;
        }
        int m = num1.length(), n = num2.length();
        int[] pos = new int[m + n];
       
        for(int i = m - 1; i >= 0; i--) {
            for(int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0'); 
                int p1 = i + j, p2 = i + j + 1;
                int sum = mul + pos[p2];

                pos[p1] += sum / 10;
                pos[p2] = (sum) % 10;
            }
        }  
        
        StringBuilder sb = new StringBuilder();
        for(int p : pos) if(!(sb.length() == 0 && p == 0)) sb.append(p);
        return sb.length() == 0 ? "0" : sb.toString();
    }

    //http://www.programcreek.com/2014/05/leetcode-multiply-strings-java/
    public String multiply2(String num1, String num2) {
        if (num1 == null || num2 == null) {
            return null;
        }
        if (num1.isEmpty() || num2.isEmpty()) {
            return "";
        }
       
        int len1 = num1.length();
        int len2 = num2.length();
        String n1 = new StringBuilder(num1).reverse().toString();
        String n2 = new StringBuilder(num2).reverse().toString();

        int[] d = new int[len1 + len2];

        //multiply each digit and sum at the corresponding positions
        for(int i = 0; i < n1.length(); i++){
            for(int j = 0; j < n2.length(); j++){
                d[i+j] += (n1.charAt(i) - '0') * (n2.charAt(j) - '0');
            }
        }

        StringBuilder sb = new StringBuilder();

        //calculate each digit
        for(int i = 0; i < d .length; i++){
            int mod = d[i] % 10;
            int carry = d[i] / 10;
            if(i + 1 < d.length){
                d[i+1] += carry;
            }
            sb.insert(0, mod);
        }

        //remove front 0's
        while(sb.charAt(0) == '0' && sb.length() > 1){
            sb.deleteCharAt(0);
        }

        return sb.toString();
    } 
}
