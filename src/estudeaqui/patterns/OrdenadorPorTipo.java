package estudeaqui.patterns;

import estudeaqui.model.Questions;

public class OrdenadorPorTipo extends OrdenadorTemplate {

    @Override
    public boolean typeOrd(Questions question1, Questions question2) {
        if (question1.getType().compareTo(question2.getType()) <= 0) {
            return true;
        }
        return false;
    }

}
