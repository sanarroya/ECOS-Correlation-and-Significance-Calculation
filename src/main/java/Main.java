import Controller.Controller;
import Model.CalculationResult;
import java.sql.*;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

import java.net.URI;
import java.net.URISyntaxException;

import static spark.Spark.*;
import spark.template.freemarker.FreeMarkerEngine;
import spark.ModelAndView;
import static spark.Spark.get;

import com.heroku.sdk.jdbc.DatabaseUrl;
import java.util.List;

/**
 *
 * @author SantiagoAvila
 */
public class Main {

   /**
     * Main method, where the endpoints are defined
     * 
     * @param args
     */
  public static void main(String[] args) {

    port(Integer.valueOf(System.getenv("PORT")));
    staticFileLocation("/public");

    
    get("/calculations", (req, res) -> {
        
        final String FILE_NAME_1 = "result1.txt";
        final String FILE_NAME_2 = "result2.txt";
        final String FILE_NAME_3 = "result3.txt";
        final String FILE_NAME_4 = "result4.txt";
        final String[] FILE_NAMES = {FILE_NAME_1, FILE_NAME_2, FILE_NAME_3, FILE_NAME_4};
        
        List<CalculationResult> data = new ArrayList<>();
        Controller controller = new Controller();
        
        for(String fileName : FILE_NAMES) {
            System.out.println(fileName);
            data.add(controller.loadClassInfo(fileName));
        }
        
        String htmlRepresentation = "";
        int count = 1;
        for(CalculationResult result : data) {
            
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
        
        return data.get(0).getExpR();
    });
    
    
    get("/", (request, response) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("message", "Hello World!");

            return new ModelAndView(attributes, "index.ftl");
        }, new FreeMarkerEngine());

    get("/db", (req, res) -> {
      Connection connection = null;
      Map<String, Object> attributes = new HashMap<>();
      try {
        connection = DatabaseUrl.extract().getConnection();

        Statement stmt = connection.createStatement();
        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS ticks (tick timestamp)");
        stmt.executeUpdate("INSERT INTO ticks VALUES (now())");
        ResultSet rs = stmt.executeQuery("SELECT tick FROM ticks");

        ArrayList<String> output = new ArrayList<String>();
        while (rs.next()) {
          output.add( "Read from DB: " + rs.getTimestamp("tick"));
        }

        attributes.put("results", output);
        return new ModelAndView(attributes, "db.ftl");
      } catch (Exception e) {
        attributes.put("message", "There was an error: " + e);
        return new ModelAndView(attributes, "error.ftl");
      } finally {
        if (connection != null) try{connection.close();} catch(SQLException e){}
      }
    }, new FreeMarkerEngine());

  }

}
