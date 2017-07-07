/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lintcode;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lintcode.common.Document;
import lintcode.common.OutputCollector;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author i857285
 */
public class TopKFrequentWordsTest {
    
    public TopKFrequentWordsTest() {
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

    @Test
    public void testSomeMethod() {
        System.out.println("testSomeMethod");
        Document doc1 = new Document();
        doc1.id = 1;
        doc1.content = "lintcode is the best online judge I love lintcode";
        
        Document doc2 = new Document();
        doc2.id = 2;
        doc2.content = "lintcode is an online judge for coding interview you can test your code online at lintcode";
        
        TopKFrequentWords.Map map = new TopKFrequentWords.Map();
        OutputCollector output1 = new OutputCollector();
        OutputCollector expect1 = new OutputCollector();
        expect1.collect("lintcode", 1);
        expect1.collect("lintcode", 1);
        expect1.collect("is", 1);
        expect1.collect("the", 1);
        expect1.collect("best", 1);
        expect1.collect("online", 1);
        expect1.collect("judge", 1);
        expect1.collect("I", 1);
        expect1.collect("love", 1);

        map.map("", doc1, output1);
        assertTrue(OutputCollector.isSame(output1, expect1));
        
        TopKFrequentWords.Reduce reduce = new TopKFrequentWords.Reduce();
        reduce.setup(2);
        
        Iterator it1 = output1.map.entrySet().iterator();
        while (it1.hasNext()) {
            Map.Entry entry = (Map.Entry)it1.next();
            reduce.reduce((String)entry.getKey(), ((List)entry.getValue()).iterator());
        }
        
        OutputCollector output2 = new OutputCollector();
        OutputCollector expect2 = new OutputCollector();
        expect2.collect("lintcode", 2);
        expect2.collect("is", 1);
        reduce.cleanup(output2);
        assertTrue(OutputCollector.isSame(output2, expect2));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSomeMethod2() {
        System.out.println("testSomeMethod2");
        Document doc1 = new Document();
        doc1.id = 1;
        doc1.content = "This is  the content of document1";
        
        Document doc2 = new Document();
        doc2.id = 2;
        doc2.content = "This is the       content of document3";
        
        TopKFrequentWords.Map map = new TopKFrequentWords.Map();
        OutputCollector output1 = new OutputCollector();
        OutputCollector expect1 = new OutputCollector();
        expect1.collect("This", 1);
        expect1.collect("This", 1);
        expect1.collect("is", 1);
        expect1.collect("is", 1);
        expect1.collect("the", 1);
        expect1.collect("the", 1);
        expect1.collect("content", 1);
        expect1.collect("content", 1);
        expect1.collect("of", 1);
        expect1.collect("of", 1);
        expect1.collect("document1", 1);
        expect1.collect("document3", 1);

        map.map("", doc1, output1);
        map.map("", doc2, output1);
        assertTrue(OutputCollector.isSame(output1, expect1));
        
        TopKFrequentWords.Reduce reduce = new TopKFrequentWords.Reduce();
        reduce.setup(3);
        
        Iterator it1 = output1.map.entrySet().iterator();
        while (it1.hasNext()) {
            Map.Entry entry = (Map.Entry)it1.next();
            reduce.reduce((String)entry.getKey(), ((List)entry.getValue()).iterator());
        }
        
        OutputCollector output2 = new OutputCollector();
        OutputCollector expect2 = new OutputCollector();
        expect2.collect("This", 2);
        expect2.collect("is", 2);
        expect2.collect("the", 2);
        reduce.cleanup(output2);
        assertTrue(OutputCollector.isSame(output2, expect2));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
