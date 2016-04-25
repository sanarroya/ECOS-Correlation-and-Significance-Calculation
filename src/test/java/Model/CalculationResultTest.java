/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;
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
public class CalculationResultTest {
    
    public CalculationResultTest() {
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
     * Test of getCorrelationSquareR method, of class CalculationResult.
     */
    @Test
    public void testGetCorrelationSquareR() {
        System.out.println("getCorrelationSquareR");
        CalculationResult instance = new CalculationResult();
        instance.setCorrelationR(0.9544);
        double expResult = 0.91106;
        double result = instance.getCorrelationSquareR();
        assertEquals(expResult, result, 0.2);
    }

    /**
     * Test of getRegressionB0 method, of class CalculationResult.
     */
    @Test
    public void testGetRegressionB0() {
        System.out.println("getRegressionB0");
        CalculationResult instance = new CalculationResult();
        instance.setRegressionB1(1.7279);
        instance.setxAverage(382.8);
        instance.setyAverage(638.9);
        double expResult = -22.5525;
        double result = instance.getRegressionB0();
        assertEquals(expResult, result, 0.2);
    }

    /**
     * Test of getYK method, of class CalculationResult.
     */
    @Test
    public void testGetYK() {
        System.out.println("getYK");
        CalculationResult instance = new CalculationResult();
        instance.setXk(386.0);
        instance.setxAverage(382.8);
        instance.setyAverage(638.9);
        instance.setRegressionB1(1.7279);
        double expResult = 644.4293;
        double result = instance.getYK();
        assertEquals(expResult, result, 0.2);
    }

    /**
     * Test of getCorrelationSignificance method, of class CalculationResult.
     */
    @Test
    public void testGetCorrelationSignificance() {
        System.out.println("getCorrelationSignificance");
        CalculationResult instance = new CalculationResult();
        instance.setXk(386.0);
        instance.setxAverage(382.8);
        instance.setyAverage(638.9);
        instance.setCorrelationR(0.954496574);
        instance.setN(10.0);
        double expResult = 1.77517E-05;
        double result = instance.getCorrelationSignificance();
        assertEquals(expResult, result, 0.2);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getRange method, of class CalculationResult.
     */
    @Test
    public void testGetRange() {
        System.out.println("getRange");
        List<ValuePair> values = new ArrayList<>();
        values.add(new ValuePair(130, 15));
        values.add(new ValuePair(650, 69.9));
        values.add(new ValuePair(99, 6.5));
        values.add(new ValuePair(150, 22.4));
        values.add(new ValuePair(128, 28.4));
        values.add(new ValuePair(302, 65.9));
        values.add(new ValuePair(95, 19.4));
        values.add(new ValuePair(945, 198.7));
        values.add(new ValuePair(368, 38.8));
        values.add(new ValuePair(961, 138.2));
        
        CalculationResult instance = new CalculationResult();
        instance.setValues(values);
        instance.setN(10.0);
        instance.setXk(386.0);
        double expResult = 27.55764748;
        double result = instance.getRange();
        assertEquals(expResult, result, 0.2);
    }
    
}
