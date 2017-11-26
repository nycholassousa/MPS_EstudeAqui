package estudeaqui.model;

import estudeaqui.util.MysqlConnect;
import java.sql.SQLException;
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
    private MysqlConnect mysql;

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

    public String getStatment() throws SQLException {
        return mysql.query("SELECT statment FROM questions").getString(1);
    }

    public String getType() throws SQLException {
        return mysql.query("SELECT type FROM questions").getString(1);
    }

    public String getAnswer1() throws SQLException {
        return mysql.query("SELECT answer1 FROM questions").getString(1);
    }

    public String getAnswer2() throws SQLException {
        return mysql.query("SELECT answer2 FROM questions").getString(1);
    }

    public String getAnswer3() throws SQLException {
        return mysql.query("SELECT answer3 FROM questions").getString(1);
    }

    public String getAnswer4() throws SQLException {
        return mysql.query("SELECT answer4 FROM questions").getString(1);
    }

    public String getAnswer5() throws SQLException {
        return mysql.query("SELECT answer5 FROM questions").getString(1);
    }

    public int getCorrect() throws SQLException {
        return mysql.query("SELECT correct FROM questions").getInt(1);

    }
}
