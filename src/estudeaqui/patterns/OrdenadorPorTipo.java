package estudeaqui.patterns;

import estudeaqui.model.Questions;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OrdenadorPorTipo extends OrdenadorTemplate {

    @Override
    public boolean typeOrd(Questions question1, Questions question2) {
        try {
            if (question1.getType().compareTo(question2.getType()) <= 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrdenadorPorTipo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
