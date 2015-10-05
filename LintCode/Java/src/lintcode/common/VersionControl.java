/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lintcode.common;
import java.util.HashMap;
/**
 *
 * @author Johnny
 */
public class VersionControl {
    public HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
    public void setMap(HashMap<Integer, Boolean> map) {
        this.map = map;
    }
    public boolean isBadVersion(int version) {
        if (map == null) {
            return false;
        }
        
        Object result = map.get(version);
        if (result == null) {
            return false;
        }
        else {
            return (boolean)result;
        }
    }
}
