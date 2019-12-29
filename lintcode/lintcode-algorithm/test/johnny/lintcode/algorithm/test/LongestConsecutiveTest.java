package johnny.lintcode.algorithm.test;

import johnny.lintcode.algorithm.LongestConsecutive;
import johnny.lintcode.algorithm.common.TreeNode;
import org.junit.*;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class LongestConsecutiveTest {

    public LongestConsecutiveTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of longestWords method, of class LongestWords.
     */
    @Test
    public void testLongestConsecutive() {
        System.out.println("longestConsecutive");
        LongestConsecutive instance = new LongestConsecutive();
        assertEquals(0, instance.longestConsecutive(null));

        TreeNode root2 = TreeNode.createInstance("1,#,3,2,4,#,#,#,5");
        assertEquals(3, instance.longestConsecutive(root2));

        TreeNode root3 = TreeNode.createInstance("2,#,3,2,#,1,#");
        assertEquals(2, instance.longestConsecutive(root3));

        TreeNode root4 = TreeNode.createInstance("1,2,3,4,5,#,#");
        assertEquals(2, instance.longestConsecutive(root4));
    }
}
