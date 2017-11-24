/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudeaqui.util;

import java.io.FileReader;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author victor
 */

/*
Json Example:

{
"Questoes": {
   "statement" : "É extraido da seringueira",

    "answer1": "Chocolate donut",
    "answer2": "Malte",
    "answer3": "Latex",
    "answer4": "Leite",
    "answer5": "Laca Vegetal",

    "correct": 2
}

 */
public class AdapterJsonImport {

    PreparedStatement preparedStatement = null;
    MysqlConnect mysql = new MysqlConnect();

    public int getJsonData(String file) throws SQLException, Exception {
        JSONParser parser = new JSONParser();
        int status = 0;

        try {
            preparedStatement = mysql.getConn().prepareStatement("insert into questions values (?, ?, ?, ?, ?, ?, ?)");

            Object obj = parser.parse(new FileReader(file));
            JSONObject jsonObject = (JSONObject) obj;
            
            JSONObject itemize = (JSONObject) jsonObject.get("Questoes");
            
            String statement = (String) itemize.get("statement");
            preparedStatement.setString(1, statement);
            String answer1 = (String) itemize.get("answer1");
            preparedStatement.setString(2, answer1);
            String answer2 = (String) itemize.get("answer2");
            preparedStatement.setString(3, answer2);
            String answer3 = (String) itemize.get("answer3");
            preparedStatement.setString(4, answer3);
            String answer4 = (String) itemize.get("answer4");
            preparedStatement.setString(5, answer4);
            String answer5 = (String) itemize.get("answer5");
            preparedStatement.setString(6, answer5);
            int correct = (int) itemize.get("correct");
            preparedStatement.setInt(7, correct);

            status = preparedStatement.executeUpdate();

        } catch (IOException | SQLException | ParseException e) {
            throw e;
        } finally {
            try {
                if (mysql.getConn() != null) {
                    mysql.getConn().close();
                }

            } catch (SQLException e) {

            }
        }
        return status;
    }
}
