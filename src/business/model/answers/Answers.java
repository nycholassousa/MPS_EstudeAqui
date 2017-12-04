package business.model.answers;

public class Answers {

    private int idStudent;
    private int idQuestion;
    private int answers;

    public Answers() {

    }

    public Answers(int idStudent, int idQuestion, int answers) {
        this.idStudent = idStudent;
        this.idQuestion = idQuestion;
        this.answers = answers;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public int getAnswers() {
        return answers;
    }

    public void setAnswers(int answers) {
        this.answers = answers;
    }
    
    public String getInfo(){
        return "ID Student: " + this.idStudent + " | ID Question: " + this.idQuestion + " | Answer: " + this.answers;
    }

}
