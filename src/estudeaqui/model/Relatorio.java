/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudeaqui.model;

/**
 *
 * @author nycho
 */
public class Relatorio {

    private int qtde_respondidas;
    private int qtde_erros;
    private int qtde_acertos;

    public Relatorio(int qtde_respondidas, int qtde_erros, int qtde_acertos) {
        this.qtde_respondidas = qtde_respondidas;
        this.qtde_erros = qtde_erros;
        this.qtde_acertos = qtde_acertos;
    }

    public int getQtde_respondidas() {
        return qtde_respondidas;
    }

    public void setQtde_respondidas(int qtde_respondidas) {
        this.qtde_respondidas = qtde_respondidas;
    }

    public int getQtde_erros() {
        return qtde_erros;
    }

    public void setQtde_erros(int qtde_erros) {
        this.qtde_erros = qtde_erros;
    }

    public int getQtde_acertos() {
        return qtde_acertos;
    }

    public void setQtde_acertos(int qtde_acertos) {
        this.qtde_acertos = qtde_acertos;
    }
}
