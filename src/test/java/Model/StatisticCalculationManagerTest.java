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
public class StatisticCalculationManagerTest {
    
    public StatisticCalculationManagerTest() {
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
     * Test of calculateMean method, of class StatisticCalculation.
     */
    @Test
    public void testCalculateMean() {
        System.out.println("calculateMean");
        List<Double> dataList = new ArrayList<>();
        dataList.add(1.0);
        dataList.add(3.0);
        dataList.add(6.0);
        dataList.add(8.0);
        dataList.add(600.0);
        dataList.add(123.0);
        double expResult = 123.5    ;
        double result = StatisticCalculationManager.calculateMean(dataList);
        assertEquals(expResult, result, result);
        
    }

    /**
     * Test of calculateRegressionB1 method, of class StatisticCalculation.
     */
    @Test
    public void testCalculateRegressionB1() {
        System.out.println("calculateRegressionB1");
        List<ValuePair> values = new ArrayList<>();
        values.add(new ValuePair(130, 186));
        values.add(new ValuePair(650, 699));
        values.add(new ValuePair(99, 132));
        values.add(new ValuePair(150, 272));
        values.add(new ValuePair(128, 291));
        values.add(new ValuePair(302, 331));
        values.add(new ValuePair(95, 199));
        values.add(new ValuePair(945, 1890));
        values.add(new ValuePair(368, 788));
        values.add(new ValuePair(961, 1601));
        double expResult = 1.7279 ;
        double result = StatisticCalculationManager.calculateRegressionB1(values);
        assertEquals(expResult, result, 0.2);
    }

    /**
     * Test of calculateCorrelationCoefficient method, of class StatisticCalculation.
     */
    @Test
    public void testCalculateCorrelationCoefficient() {
        System.out.println("calculateCorrelationCoefficient");
        List<ValuePair> values = new ArrayList<>();
        values.add(new ValuePair(130, 186));
        values.add(new ValuePair(650, 699));
        values.add(new ValuePair(99, 132));
        values.add(new ValuePair(150, 272));
        values.add(new ValuePair(128, 291));
        values.add(new ValuePair(302, 331));
        values.add(new ValuePair(95, 199));
        values.add(new ValuePair(945, 1890));
        values.add(new ValuePair(368, 788));
        values.add(new ValuePair(961, 1601));
        double expResult = 0.95;
        double result = StatisticCalculationManager.calculateCorrelationCoefficient(values);
        assertEquals(expResult, result, result);
    }

    /**
     * Test of standardDeviation method, of class StatisticCalculationManager.
     */
    @Test
    public void testStandardDeviation() {
        System.out.println("standardDeviation");
        List<ValuePair> values = new ArrayList<>();
        values.add(new ValuePair(130, 186));
        values.add(new ValuePair(650, 699));
        values.add(new ValuePair(99, 132));
        values.add(new ValuePair(150, 272));
        values.add(new ValuePair(128, 291));
        values.add(new ValuePair(302, 331));
        values.add(new ValuePair(95, 199));
        values.add(new ValuePair(945, 1890));
        values.add(new ValuePair(368, 788));
        values.add(new ValuePair(961, 1601));
        double expResult = 197.8955;
        double result = StatisticCalculationManager.standardDeviation(values);
        assertEquals(expResult, result, 0.2);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
