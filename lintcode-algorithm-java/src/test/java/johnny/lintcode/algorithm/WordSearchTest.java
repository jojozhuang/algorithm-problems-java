package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class WordSearchTest extends JunitBase {

    /**
     * Test of exist method, of class WordSearch.
     */
    @Test
    public void testExist() {
        System.out.println("exist");
        char[][] board = null;
        String word = "";
        WordSearch instance = new WordSearch();
        boolean expResult = false;
        boolean result = instance.exist(board, word);
        assertEquals(expResult, result);
        
        char[][] board2 = new char[][] {
            "ABCE".toCharArray(),"SFCS".toCharArray(), "ADEE".toCharArray()
        };        
        assertEquals(true, instance.exist(board2, "ABCCED"));
        assertEquals(true, instance.exist(board2, "SEE"));
        assertEquals(false, instance.exist(board2, "ABCB"));
        
        char[][] board3 = new char[][] {
            "ABCE".toCharArray(),"SFES".toCharArray(), "ADEE".toCharArray()
        };
        assertEquals(true, instance.exist(board3, "ABCESEEEFS"));
    }
}
