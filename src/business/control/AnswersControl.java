package business.control;

import business.model.answers.Answers;
import java.util.ArrayList;

public class AnswersControl {

    public static ArrayList<Answers> answers = new ArrayList<>();

    public static Answers getAnswer(int id) {
        return answers.get(id);
    }
}
