package johnny.leetcode.algorithm.common;
import java.util.HashMap;
/**
 *
 * @author Johnny
 */
public class VersionControl {
    public HashMap<Integer, Boolean> map = new HashMap<>();
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
