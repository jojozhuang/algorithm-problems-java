package johnny.lintcode.algorithm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class ValidWordAbbreviationTest {

    public ValidWordAbbreviationTest() {
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
     * Test of subsets method, of class Subsets.
     */
    @Test
    public void testValidWordAbbreviation() {
        System.out.println("testValidWordAbbreviation");

        ValidWordAbbreviation instance = new ValidWordAbbreviation();
        assertEquals(false, instance.validWordAbbreviation("a", "01"));
        assertEquals(true, instance.validWordAbbreviation("aa", "a1"));
        assertEquals(true, instance.validWordAbbreviation("internationalization", "i12iz4n"));
        assertEquals(false, instance.validWordAbbreviation("apple", "a2e"));


    }
}
