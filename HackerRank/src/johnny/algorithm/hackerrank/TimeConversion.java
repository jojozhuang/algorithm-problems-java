/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.hackerrank;

/**
 *
 * @author Johnny
 */
public class TimeConversion {
    public static String convertTime(String time) {
        if (time == null || time.isEmpty()) {
            return time;
        }    
        
        boolean isMorning = time.substring(time.length() - 2).equals("AM");
        int firstColon = time.indexOf(":");
        int hour = Integer.parseInt(time.substring(0,firstColon));
        if (isMorning) {
            if (hour < 12) {
                if (hour < 10) {                    
                    return "0" + String.valueOf(hour) + time.substring(firstColon, firstColon + 6);
                } else {
                    return time.substring(0, 8);
                }
            } else {
                return "00" + time.substring(firstColon, firstColon + 6);
            }
        } else {
            if (hour < 12) {
                hour += 12;
                return String.valueOf(hour) + time.substring(firstColon, firstColon + 6);
            } else {
                return time.substring(0, time.length() - 2);
            }
        }        
    }
}
