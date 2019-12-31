package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution920;

public class Solution920Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numMusicPlaylists");
        Solution920 instance = new Solution920();

        assertEquals(6, instance.numMusicPlaylists(3,3,1));
        assertEquals(6, instance.numMusicPlaylists(2,3,0));
        assertEquals(2, instance.numMusicPlaylists(2,3,1));
    }
}
