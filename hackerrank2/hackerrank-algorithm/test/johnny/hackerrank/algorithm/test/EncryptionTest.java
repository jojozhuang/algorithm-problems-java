package johnny.hackerrank.algorithm.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.hackerrank.algorithm.Encryption;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class EncryptionTest {
    
    public EncryptionTest() {
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
     * Test of encrypt method, of class Encryption.
     */
    @Test
    public void testEncrypt() {
        System.out.println("encrypt");
        String s = "";
        String expResult = "";
        String result = Encryption.encrypt(s);
        assertEquals(expResult, result);
        
        assertEquals("hae and via ecy", Encryption.encrypt("haveaniceday"));
        assertEquals("fto ehg ee dd", Encryption.encrypt("feedthedog"));
        assertEquals("clu hlt io", Encryption.encrypt("chillout"));
    }
}
