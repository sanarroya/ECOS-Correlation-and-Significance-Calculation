/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author SantiagoAvila
 */
public class SimpsonCalculationManager {
    
    static public final double ACCEPTABLE_ERROR = 0.00001;
    
    /**
     *Calculates the integral using the Simpson method
     * 
     * @param integralInfo
     * @return
     */
    static public IntegralInfo simpsonIntegral(IntegralInfo integralInfo) {
        return integralInfo;
    }
    
    /**
     *Calculates the p value
     * 
     * @param integralInfo
     * @return p value
     */
    static private double calculateP(IntegralInfo integralInfo) {
        
        return  0.0;
        
    }
    
    /**
     * Calculates the gamma function of a given value
     * 
     * @param value
     * @return Result of calculating gamma function to the given value
     */
    static private double gammaFunction(double value) {
        
        return 0.0;
    }
    
    /**
     * Calculates the tDistribution of a value
     * @param integralInfo Integral parameters
     * @param value to calculate the t distribution
     * @return Result of the t distribution
     */
    static private double tDistributionFunction(IntegralInfo integralInfo, double value) {
        
        return 0.0;
    }
    
    /**
     * Calculates the sumatory of the even numbers
     * 
     * @param integralInfo Integral parameters
     * @return sumatory result
     */
    static private double evenSumatory(IntegralInfo integralInfo) {
        return 0.0;
    }
    
    /**
     * Calculates the sumatory of the odd numbers
     * @param integralInfo Integral parameters
     * @return Sumatory result
     */
    static private double oddSumatory(IntegralInfo integralInfo) {
        
        return 0.0;
    }
}
