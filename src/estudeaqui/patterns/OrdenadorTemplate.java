package estudeaqui.patterns;

import estudeaqui.model.Questions;
import java.util.ArrayList;

public abstract class OrdenadorTemplate {

    public abstract boolean typeOrd(Questions question1, Questions question2);

    public ArrayList<Questions> ordenarQuestoes(ArrayList<Questions> lista) {
        ArrayList<Questions> novaLista = new ArrayList<Questions>();
        
        for (Questions questions : lista){
            novaLista.add(questions);
        }
        
        for (int i = 0; i < novaLista.size(); i++){
            for (int j = 0; j <novaLista.size(); j++){
                if (!typeOrd(novaLista.get(i), novaLista.get(j))) {
                    Questions temp = novaLista.get(j);
                    novaLista.set(j, novaLista.get(i));
                    novaLista.set(i, temp);
                }
            }
        }
        
        return novaLista;
    }
}
