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
public class CalculationResult {
    
    private double xk;
    private double regressionB1;
    private double xAverage;
    private double yAverage;
    private double correlationR;
    
    /**
     * Empty constructor of the class
     */
    public CalculationResult() {
        
    }

    /**
     *xk attribute getter
     * 
     * @return xk value
     */
    public double getXk() {
        return xk;
    }

    /**
     * xk attribute setter
     * @param xk
     */
    public void setXk(double xk) {
        this.xk = xk;
    }

    /**
     *RegressionB1  attribute getter
     * @return RegressionB1 getter
     */
    public double getRegressionB1() {
        return regressionB1;
    }

    /**
     * RegressionB1 attribute setter
     * @param regressionB1
     */
    public void setRegressionB1(double regressionB1) {
        this.regressionB1 = regressionB1;
    }

    /**
     *X Average  attribute getter
     * @return X Average value
     */
    public double getxAverage() {
        return xAverage;
    }

    /**
     * X Average attribute setter
     * @param xAverage
     */
    public void setxAverage(double xAverage) {
        this.xAverage = xAverage;
    }

    /**
     * Y Average attribute getter
     * @return Y Average value
     */
    public double getyAverage() {
        return yAverage;
    }

    /**
     *Y Average attribute setter
     * @param yAverage
     */
    public void setyAverage(double yAverage) {
        this.yAverage = yAverage;
    }

    /**
     * CorrelationR  attribute getter
     * @return CorrelationR value
     */
    public double getCorrelationR() {
        return correlationR;
    }

    /**
     *CorrelationR attribute setter
     * @param correlationR
     */
    public void setCorrelationR(double correlationR) {
        this.correlationR = correlationR;
    }
    
    /**
     * CorrelationSquareR attribute getter
     * @return CorrelationSquareR value
     */
    public double getCorrelationSquareR() {
        return this.correlationR * this.correlationR;
    }
    
    /**
     * RegressionB0 attribute getter
     * @return RegressionB0 value
     */
    public double getRegressionB0() {
        return this.yAverage - (this.xAverage * this.regressionB1);
    }
    
    /**
     * YK attribute getter
     * @return YK value
     */
    public double getYK() {
        return this.getRegressionB0() + (this.regressionB1 * xk);
    }
}
