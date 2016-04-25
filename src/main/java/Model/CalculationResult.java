/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;

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
    private double n;
    private List<ValuePair> values;
    
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
     * N  attribute getter
     * @return N value
     */
    public double getN() {
        return n;
    }

    /**
     * N attribute setter
     * @param n
     */
    public void setN(double n) {
        this.n = n;
    }
    
    /**
     * N  attribute getter
     * @return N value
     */
    public List<ValuePair> getValues() {
        return values;
    }

    /**
     * N attribute setter
     * @param n
     */
    public void setValues(List<ValuePair> values) {
        this.values = values;
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
    
    public double getCorrelationSignificance() {
        
        double correlationSignificance = 0.0;
        double integralUpperlimit = calculateIntegralUpperLimit();

        IntegralInfo integralInfo = new IntegralInfo(this.n - 2.0, 10.0, 0.0, integralUpperlimit, 0.0);
        integralInfo = SimpsonCalculationManager.simpsonIntegral(integralInfo);
        correlationSignificance = 1 - (2 * integralInfo.getIntegralResult());

        return correlationSignificance;
    }
    
    public double getRange() {
        
        IntegralInfo integralInfo = new IntegralInfo(this.n - 2.0, 10.0, 0.0, 0.0, 0.35);
        
        integralInfo = Search.xValue(integralInfo);
        
        double xValue = integralInfo.getIntegralUpperLimit();
        double standardDeviation = StatisticCalculationManager.standardDeviation(this.values);
        System.out.println("x: " + xValue);
        System.out.println("Std: " + standardDeviation);
        System.out.println("third: " + rangeThirdTerm());
        return xValue * standardDeviation * rangeThirdTerm();
    }
    
    private double calculateIntegralUpperLimit() {
        
        double numerator = Math.abs(this.correlationR) * Math.sqrt(this.n - 2.0);
        double enumarator = Math.sqrt(1 - this.getCorrelationSquareR());
        
        return numerator / enumarator;
    }
    
    private double rangeThirdTerm() {
        
        double rangeThirdTerm = 1 + (1 / (double) values.size());
        
        double numerator = Math.pow((xk - xAverage), 2.0);
        double enumerator = 0.0;
        
        for(ValuePair value : values) {
            enumerator += Math.pow(value.getX() - xAverage, 2.0);
        }
        
        double fraction = numerator / enumerator;
        rangeThirdTerm += fraction; 
        return Math.sqrt(rangeThirdTerm);
    }
}
