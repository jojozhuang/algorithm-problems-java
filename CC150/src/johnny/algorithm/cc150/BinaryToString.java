/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.cc150;

/**
 * Binary to String
 * Given a real number between 0 and 1 (e.g., 0.72) that is passed in as a double, 
 * print the binary representation. If the number cannot be represented 
 * accurately in binary with at most 32 characters, print "ERROR".
 * 
 * @author i857285
 */
public class BinaryToString {
    public String printBinary(double num) {
        if (num >= 1 || num <= 0) {
            return "ERROR";
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(".");
        while (num > 0) {
            if (sb.length() >= 32) {
                break;
                //return "ERROR";
            }
            
            double r = num * 2;
            if (r >= 1) {
                sb.append("1");
                num = r - 1;
            } else {
                sb.append("0");
                num = r;
            }
        }
        
        return sb.toString();
    }
}
