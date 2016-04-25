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
public class IntegralInfoTest {
    
    public IntegralInfoTest() {
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
     * Test of setNumberOfSegments method, of class IntegralInfo.
     */
    @Test
    public void testSetNumberOfSegments() {
        System.out.println("setNumberOfSegments");
        double numberOfSegments = 0.0;
        IntegralInfo instance = new IntegralInfo();
        instance.setNumberOfSegments(numberOfSegments);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfSegments method, of class IntegralInfo.
     */
    @Test
    public void testGetNumberOfSegments() {
        System.out.println("getNumberOfSegments");
        IntegralInfo instance = new IntegralInfo();
        double expResult = 0.0;
        double result = instance.getNumberOfSegments();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSegmentWidth method, of class IntegralInfo.
     */
    @Test
    public void testGetSegmentWidth() {
        System.out.println("getSegmentWidth");
        IntegralInfo instance = new IntegralInfo();
        double expResult = 0.0;
        double result = instance.getSegmentWidth();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDegreesOfFreedom method, of class IntegralInfo.
     */
    @Test
    public void testGetDegreesOfFreedom() {
        System.out.println("getDegreesOfFreedom");
        IntegralInfo instance = new IntegralInfo();
        double expResult = 0.0;
        double result = instance.getDegreesOfFreedom();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDegreesOfFreedom method, of class IntegralInfo.
     */
    @Test
    public void testSetDegreesOfFreedom() {
        System.out.println("setDegreesOfFreedom");
        double degreesOfFreedom = 0.0;
        IntegralInfo instance = new IntegralInfo();
        instance.setDegreesOfFreedom(degreesOfFreedom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIntegralLowerLimit method, of class IntegralInfo.
     */
    @Test
    public void testGetIntegralLowerLimit() {
        System.out.println("getIntegralLowerLimit");
        IntegralInfo instance = new IntegralInfo();
        double expResult = 0.0;
        double result = instance.getIntegralLowerLimit();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIntegralLowerLimit method, of class IntegralInfo.
     */
    @Test
    public void testSetIntegralLowerLimit() {
        System.out.println("setIntegralLowerLimit");
        double integralLowerLimit = 0.0;
        IntegralInfo instance = new IntegralInfo();
        instance.setIntegralLowerLimit(integralLowerLimit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIntegralUpperLimit method, of class IntegralInfo.
     */
    @Test
    public void testGetIntegralUpperLimit() {
        System.out.println("getIntegralUpperLimit");
        IntegralInfo instance = new IntegralInfo();
        double expResult = 0.0;
        double result = instance.getIntegralUpperLimit();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIntegralUpperLimit method, of class IntegralInfo.
     */
    @Test
    public void testSetIntegralUpperLimit() {
        System.out.println("setIntegralUpperLimit");
        double integralUpperLimit = 0.0;
        IntegralInfo instance = new IntegralInfo();
        instance.setIntegralUpperLimit(integralUpperLimit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIntegralResult method, of class IntegralInfo.
     */
    @Test
    public void testGetIntegralResult() {
        System.out.println("getIntegralResult");
        IntegralInfo instance = new IntegralInfo();
        double expResult = 0.0;
        double result = instance.getIntegralResult();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIntegralResult method, of class IntegralInfo.
     */
    @Test
    public void testSetIntegralResult() {
        System.out.println("setIntegralResult");
        double integralResult = 0.0;
        IntegralInfo instance = new IntegralInfo();
        instance.setIntegralResult(integralResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExpectedResult method, of class IntegralInfo.
     */
    @Test
    public void testGetExpectedResult() {
        System.out.println("getExpectedResult");
        IntegralInfo instance = new IntegralInfo();
        double expResult = 0.0;
        double result = instance.getExpectedResult();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExpectedResult method, of class IntegralInfo.
     */
    @Test
    public void testSetExpectedResult() {
        System.out.println("setExpectedResult");
        double expectedResult = 0.0;
        IntegralInfo instance = new IntegralInfo();
        instance.setExpectedResult(expectedResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExpectedUpperLimit method, of class IntegralInfo.
     */
    @Test
    public void testSetExpectedUpperLimit() {
        System.out.println("setExpectedUpperLimit");
        double expectedUpperLimit = 0.0;
        IntegralInfo instance = new IntegralInfo();
        instance.setExpectedUpperLimit(expectedUpperLimit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExpectedUpperLimit method, of class IntegralInfo.
     */
    @Test
    public void testGetExpectedUpperLimit() {
        System.out.println("getExpectedUpperLimit");
        IntegralInfo instance = new IntegralInfo();
        double expResult = 0.0;
        double result = instance.getExpectedUpperLimit();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
