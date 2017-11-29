package infra.adapter;

import business.model.questions.Questions;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/*
Json Example to Import:
{
	"Questoes": {
		"statement" : "É extraido da seringueira",

		 "alternative1": "Chocolate donut",
		 "alternative2": "Malte",
		 "alternative3": "Latex",
		 "alternative4": "Leite",
		 "alternative5": "Laca Vegetal",

		 "correct": 2
	}
}
 */
public class JsonImport implements AdapterImport {

    @Override
    public Questions parseData(String file) {
        JSONParser parser = new JSONParser();
        Questions question = new Questions();

        try {
            Object obj = parser.parse(new FileReader(file));
            JSONObject jsonObject = (JSONObject) obj;
            JSONObject itemize = (JSONObject) jsonObject.get("Questoes");

            question.setStatment((String) itemize.get("statement"));
            question.setAlternative1((String) itemize.get("alternative1"));
            question.setAlternative2((String) itemize.get("alternative2"));
            question.setAlternative3((String) itemize.get("alternative3"));
            question.setAlternative4((String) itemize.get("alternative4"));
            question.setAlternative5((String) itemize.get("alternative5"));
            question.setCorrect((String) itemize.get("correct"));
            return question;

        } catch (IOException e) {
            try {
                throw e;
            } catch (IOException ex) {
                Logger.getLogger(JsonImport.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ParseException ex) {
            Logger.getLogger(JsonImport.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
