package business.model.questions;

public class Questions {

    private String statment;
    private String alternative1;
    private String alternative2;
    private String alternative3;
    private String alternative4;
    private String alternative5;
    private String correct;

    public String getStatment() {
        return statment;
    }

    public void setStatment(String statment) {
        this.statment = statment;
    }

    public String getAlternative1() {
        return alternative1;
    }

    public void setAlternative1(String alternative1) {
        this.alternative1 = alternative1;
    }

    public String getAlternative2() {
        return alternative2;
    }

    public void setAlternative2(String alternative2) {
        this.alternative2 = alternative2;
    }

    public String getAlternative3() {
        return alternative3;
    }

    public void setAlternative3(String alternative3) {
        this.alternative3 = alternative3;
    }

    public String getAlternative4() {
        return alternative4;
    }

    public void setAlternative4(String alternative4) {
        this.alternative4 = alternative4;
    }

    public String getAlternative5() {
        return alternative5;
    }

    public void setAlternative5(String alternative5) {
        this.alternative5 = alternative5;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }

    public String getInfo() {
        return "Statment: " + this.statment + "\nAlternative 1: " + this.alternative1 + "\nAlternative 2: " + this.alternative2 + ""
                + "\nAlternative 3: " + this.alternative3 + "\nAlternative 4: " + this.alternative4 + "\nAlternative 5: " + this.alternative5 + ""
                + "Correct: " + this.correct;
    }
}
