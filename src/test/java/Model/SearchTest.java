/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SantiagoAvila
 */
public class SearchTest {
    
    public SearchTest() {
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
     * Test of xValue method, of class Search.
     */
    /**
     * Test of xValue method, of class Search.
     */
    @Test
    public void testXValue() {
        System.out.println("xValue");
        IntegralInfo integralInfo = new IntegralInfo(8.0, 10.0, 0.0, 0.0, 0.35);
        double expResult = 1.10791015625;
        double result = Search.xValue(integralInfo).getIntegralUpperLimit();
        assertEquals(expResult, result, 0.2);
    }
    
}
