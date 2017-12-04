package business.control;

import business.model.questions.Questions;
import java.util.ArrayList;

public class QuestionsControl {

    public static Questions question = new Questions();
    public static ArrayList<Questions> questions = new ArrayList<>();

    public static Questions getQuestion(int id) {
        return questions.get(id);
    }
}
