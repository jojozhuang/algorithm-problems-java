/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import leetcode.common.ListUtil;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution127Test {
    
    public Solution127Test() {
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
     * Test of ladderLength method, of class Solution127.
     */
    @Test
    public void testLadderLength() {
        System.out.println("ladderLength");
        Solution127 instance = new Solution127();

        assertEquals(0, instance.ladderLength("", "", null));

        List<String> wordList2 = ListUtil.buildStringList(new String[]{"hot", "dot", "dog", "lot","log"});
        assertEquals(0, instance.ladderLength("hit", "pet", wordList2));
        
        List<String> wordList3 = ListUtil.buildStringList(new String[]{"hot", "dot", "dog", "lot","log"});
        assertEquals(2, instance.ladderLength("hit", "hot", wordList3));
        
        List<String> wordList4 = ListUtil.buildStringList(new String[]{"hot", "dot", "dog", "lot","log"});
        assertEquals(3, instance.ladderLength("hit", "dot", wordList4));
        
        List<String> wordList5 = ListUtil.buildStringList(new String[]{"hot", "dot", "dog", "lot","log"});
        assertEquals(4, instance.ladderLength("hit", "dog", wordList5));
        
        List<String> wordList6 = ListUtil.buildStringList(new String[]{"hot", "dot", "dog", "lot","log"});
        assertEquals(5, instance.ladderLength("hit", "cog", wordList6));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
