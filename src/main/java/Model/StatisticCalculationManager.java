/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SantiagoAvila
 */
public class StatisticCalculationManager {
    
    /**
     * Calculates the mean of a set of data
     * @param dataList
     * @return mean of the data
     */
    public static double calculateMean(List<Double> dataList) {
        double sum = 0.0;
        return sum;
    }
    
    /**
     * Calculates regression B1 for a set of data
     * @param values
     * @return
     */
    public static double calculateRegressionB1(List<ValuePair> values) {
        
        return 0.0;
    }
    
    /**
     * Calculate correlation coefficient for a set of data
     * @param values
     * @return
     */
    public static double calculateCorrelationCoefficient(List<ValuePair> values) {
        return 0.0;
    }
    
    /**
     * Sumatory of values product
     * @param values
     * @return 
     */
    private static double calculateSumOfValuesProduct(List<ValuePair> values) {
        double sumOfValuesProduct = 0.0;
      
        return sumOfValuesProduct;
    }
    
    /**
     * Sumatory of square values
     * @param values
     * @return
     */
    private static double calculateSumOfSquareValues(List<Double> values) {
        double sumOfSquareValues = 0.0;
        for(double value : values) {
            sumOfSquareValues += Math.pow(value, 2);
        }
        return sumOfSquareValues;
    }
    
    /**
     * Sumatory of values
     * @param values
     * @return
     */
    private static double calculateSumOfValues(List<Double> values) {
        double sumOfValues = 0.0;
        for(double value : values) {
            sumOfValues += value;
        }
        return sumOfValues;
    }
    
    public static double rangeCalculation(List<Double> values) {
        return 0.0;
    }
    
    public static double standardDeviation(List<Double> values) {
        return 0.0;
    }
    
    
}