/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author SantiagoAvila
 */
public class Search {
 
    /**
     *Search the x value for which the Simpson Integral resolves to a given P 
     * @param integralInfo
     * @return All the integral information with the x value updated
     */
    static public IntegralInfo xValue(IntegralInfo integralInfo) {
			
	return integralInfo;
    }
    
    /**
     * Determines if x value should be adjusted to continue the search
     *  
     * @param mustAdjustX
     * @param integralUpperLimit
     * @param d
     * @return New x Value
     */
    static private double adjustX(boolean mustAdjustX, double integralUpperLimit, double d) {	
	return 0.0;    
    }
	
    /**
     * Adjust the d value, which is the value to increase o decrease the x value 
     * @param d
     * @param integralUpperLimit
     * @return New d value
     */
    static private double adjustDValue(double d, double integralUpperLimit) {
        return 0.0;
    }
    
    /**
     * Formats x value
     * @param d
     * @return Value of x Formatted
     */
    static private double valueFormatted(double d) {
        return d;
    }
}
