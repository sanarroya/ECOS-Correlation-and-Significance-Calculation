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
        instance.setRegressionB1(0.16812664988162895);
        double expResult = -4.038881574687551;
        double result = instance.getRegressionB0();
        assertEquals(expResult, result, 0.2);
    }

    /**
     * Test of getYK method, of class CalculationResult.
     */
    @Test
    public void testGetYK() {
        System.out.println("getYK");
        
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
        instance.setXk(386.0);
        instance.setRegressionB1(0.16812664988162895);
        double expResult = 60.8580052;
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
        double expResult = 27.5517;
        double result = instance.getRange();
        assertEquals(expResult, result, 0.2);
    }
    
    /**
     * Test of getUPI method, of class CalculationResult.
     */
    @Test
    public void testGetUPI() {
        System.out.println("getUPI");
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
        
        List<Double> xElements = new ArrayList<>();
        List<Double> yElements = new ArrayList<>();
        
        for(ValuePair value : values) {
            xElements.add(value.getX());
            yElements.add(value.getY());
        }
        
        CalculationResult instance = new CalculationResult();
        instance.setValues(values);
        instance.setN(10.0);
        instance.setXk(386.0);
        instance.setRegressionB1(StatisticCalculationManager.calculateRegressionB1(values));
        instance.setCorrelationR(StatisticCalculationManager.calculateCorrelationCoefficient(values));
        
        double expResult = 88.41565276;
        double result = instance.getUPI();
        assertEquals(expResult, result, 0.2);
    }
}
