/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudeaqui.model;

import java.util.Arrays;

/**
 *
 * @author nycho
 */
public class Questions {

    private int qtde_questions;
    private String[][] questions;
    private final String[] type;
    private int correct[];

    public Questions(int qtde_questions) {
        this.qtde_questions = qtde_questions;
        this.questions = new String[qtde_questions][5];
        this.type = new String[qtde_questions];
        this.correct = new int[qtde_questions];
    }
    
    public int getQtde_questions() {
        return qtde_questions;
    }

    public void setQtde_questions(int qtde_questions) {
        this.qtde_questions = qtde_questions;
    }

    public String[][] getQuestions() {
        return questions;
    }

    public void setQuestions(String[][] questions) {
        this.questions = questions;
    }

    public int[] getCorrect() {
        return correct;
    }

    public void setCorrect(int[] correct) {
        this.correct = correct;
    }

    public void showQuestion(int question_id){
        System.out.println("Questão de Número: " + question_id);
        System.out.println(Arrays.toString(this.questions[question_id]));
        
        System.out.println("Alternativas: ");
        System.out.println("A. " + this.questions[question_id][0]);
        System.out.println("B. " + this.questions[question_id][1]);
        System.out.println("C. " + this.questions[question_id][2]);
        System.out.println("D. " + this.questions[question_id][3]);
        System.out.println("E. " + this.questions[question_id][4]);
    }
}
