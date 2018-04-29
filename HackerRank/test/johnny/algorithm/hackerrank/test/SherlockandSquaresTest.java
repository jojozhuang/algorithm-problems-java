/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.hackerrank.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.hackerrank.SherlockandSquares;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class SherlockandSquaresTest {
    
    public SherlockandSquaresTest() {
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
     * Test of squareNumber method, of class SherlockandSquares.
     */
    @Test
    public void testSquareNumber() {
        System.out.println("squareNumber");
        int start = 1;
        int end = 1;
        int expResult = 1;
        int result = SherlockandSquares.squareNumber(start, end);
        assertEquals(expResult, result);
        
        assertEquals(1, SherlockandSquares.squareNumber(1, 3));
        assertEquals(0, SherlockandSquares.squareNumber(2, 3));
        assertEquals(2, SherlockandSquares.squareNumber(1, 4));
        assertEquals(1, SherlockandSquares.squareNumber(2, 4));
        assertEquals(2, SherlockandSquares.squareNumber(3, 9));
        assertEquals(0, SherlockandSquares.squareNumber(17, 24));
        assertEquals(10, SherlockandSquares.squareNumber(1, 100));
    }
}
