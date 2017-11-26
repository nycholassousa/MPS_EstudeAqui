package estudeaqui.model;

import java.util.Arrays;

public class Questions {

    private String statment;
    private String type;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String answer5;
    private int correct;

    private Questions(String statment, String type, String answer1, String answer2, String answer3, String answer4, String answer5, int correct) {
        this.statment = statment;
        this.type = type;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answer5 = answer5;
        this.correct = correct;
    }
    
    public static Questions createQuestion(String statment, String type, String answer1, String answer2, String answer3, String answer4, String answer5, int correct) {
        return new Questions(statment, type, answer1, answer2, answer3, answer4, answer5, correct);
    }

    public String getStatment() {
        return statment;
    }

    public void setStatment(String statment) {
        this.statment = statment;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public String getAnswer5() {
        return answer5;
    }

    public void setAnswer5(String answer5) {
        this.answer5 = answer5;
    }

    public int getCorrect() {
        return correct;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }
}
