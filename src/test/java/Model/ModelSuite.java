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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author SantiagoAvila
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Model.IntegralInfoTest.class, Model.StatisticCalculationManagerTest.class, Model.ValuePairTest.class, Model.LoadDataTest.class, Model.CalculationResultTest.class, Model.SearchTest.class, Model.RepresentationTest.class, Model.SimpsonCalculationManagerTest.class})
public class ModelSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
