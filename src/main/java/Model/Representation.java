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
public class Representation {
    
    /**
     * Creates HTML to present the results in the view
     * @param results
     * @return String with HTML tags to present a table in the browser
     */
    static public String htmlRepresentation(List<CalculationResult> results) {
        String htmlRepresentation = "";
        int count = 1;
        for(CalculationResult result : results) {
            
            htmlRepresentation += String.format("<h3>Test %d</h3><br><table border=\"1\">", count);
            htmlRepresentation += String.format("<tr align=\"center\"><td>Parameter</td><td>Expected Value</td><td>Actual Value</td></tr>");
            htmlRepresentation += String.format("<tr align=\"center\"><td>r</td><td>%f</td><td>%f</td></tr>", result.getExpR(), result.getCorrelationR());
            htmlRepresentation += String.format("<tr align=\"center\"><td>r^2</td><td>%f</td><td>%f</td></tr>", result.getExpR2(), result.getCorrelationSquareR());
            htmlRepresentation += String.format("<tr align=\"center\"><td>significance</td><td>%f</td><td>%f</td></tr>", result.getExpSignificance(), result.getCorrelationSignificance());
            htmlRepresentation += String.format("<tr align=\"center\"><td>B0</td><td>%f</td><td>%f</td></tr>", result.getExpB0(), result.getRegressionB0());
            htmlRepresentation += String.format("<tr align=\"center\"><td>B1</td><td>%f</td><td>%f</td></tr>", result.getExpB1(), result.getRegressionB1());
            htmlRepresentation += String.format("<tr align=\"center\"><td>yK</td><td>%f</td><td>%f</td></tr>", result.getExpYk(), result.getYK());
            htmlRepresentation += String.format("<tr align=\"center\"><td>Range</td><td>%f</td><td>%f</td></tr>", result.getExpRange(), result.getRange());
            htmlRepresentation += String.format("<tr align=\"center\"><td>UPI</td><td>%f</td><td>%f</td></tr>", result.getExpUPI(), result.getUPI());
            htmlRepresentation += String.format("<tr align=\"center\"><td>LPI</td><td>%f</td><td>%f</td></tr>", result.getExpLPI(), result.getLPI());
            htmlRepresentation += String.format("</table>");
            count++;
        }
        
        return htmlRepresentation;
    }
    
}
