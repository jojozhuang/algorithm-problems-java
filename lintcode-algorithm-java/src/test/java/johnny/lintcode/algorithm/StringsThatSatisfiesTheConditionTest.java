package johnny.lintcode.algorithm;

import org.junit.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class StringsThatSatisfiesTheConditionTest {

    public StringsThatSatisfiesTheConditionTest() {
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
     * Test of replaceBlank method, of class StringsThatSatisfiesTheCondition.
     */
    @Test
    public void testGetAns() {
        System.out.println("getAns");
        StringsThatSatisfiesTheCondition instance = new StringsThatSatisfiesTheCondition();

        String[] input1 = new String[]{"goooogle","abc","google","higoogle","googlg","gowogwle","gogle"};
        String[] result1 = instance.getAns("google", input1);
        String[] expect1 = new String[]{"goooogle","google","higoogle","gowogwle"};
        assertArrayEquals(expect1, result1);

        String[] input2 = new String[]{"helolo","helo","heello","hhepllo","olleh"};
        String[] result2 = instance.getAns("hello", input2);
        String[] expect2 = new String[]{"helolo","heello","hhepllo"};
        assertArrayEquals(expect2, result2);

        String[] input3 = new String[]{"helloworld","heheloolo","heylol","loheyllol"};
        String[] result3 = instance.getAns("hello", input3);
        String[] expect3 = new String[]{"helloworld","heheloolo","loheyllol"};
        assertArrayEquals(expect3, result3);

        String[] input4 = new String[]{"heylol"};
        String[] result4 = instance.getAns("hello", input4);
        String[] expect4 = new String[]{};
        assertArrayEquals(expect4, result4);
    }
}
