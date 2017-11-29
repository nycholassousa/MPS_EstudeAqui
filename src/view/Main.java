package view;

import business.control.StudentControl;
import business.control.adapter.AdapterImport;
import business.control.adapter.JsonImport;
import business.control.util.MysqlConnect;
import business.model.exception.StudentNotExistException;
import business.model.student.Student;
import com.mysql.jdbc.MySQLConnection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    /* Padroes de Projeto propostos pelo professor:
    Adapter: Usado para importar um arquivo JSON para o Mysql - FEITO, adicionar outro modo (CSV)?
    Template Method: 
    Fachada: 
    Factory Method/Abstract Factory: Pacote business.control.questions.factory, arquivo QuestionsFactory - FEITO, precisa melhorar, acho
    Command: 
    Memento: 
     */

    /* Padroes adicionais propostos:
    Singleton: Usado na classe MysqlConnect - FEITO
    Observer: 
    State: Pacote business.mode.student.state - FEITO, precisa analisar melhor
    DAO: 
     */
    
    /* RF Feitos:
    RF001: Usuário Admin - Feito, função setAccess na classe Student
    RF002: Relatório de Admin
    RF003: Cadastro de Usuário - Feito, construtor na classe Student
    RF004: Exibir Questionários
    RF005: Relatório de Usuário
    RF006: Login de Usuário - Feito, classe StudentControl
    RF007: Notificação
    RF008: Importar Questões - Feito, usando Adapter para importar Json
    RF009: Ordenar por tipos - RF será cancelado, ajustar no doc
    RF010: Passar Questão
     */
    
    /* Coisas feitas até o momento:
    * Conexão Mysql, conexão funciona normalmente, dados são adicionados e pesquisados normalmente.
    * Criação da Tabela e da Classe responsável pelo usuário
    * Criação da Tabela e da Classe responsável pelas questões
    
    
     */
    public static void main(String[] args) throws StudentNotExistException, SQLException {
        MysqlConnect mysql = MysqlConnect.getDbCon();
        //mysql.insert("INSERT INTO `students` (`email`, `password`, `page_admin`) VALUES ('email@email.email', '123', '0')");
        
        //ResultSet rs = StudentControl.getStudent("email@email.email", "123");
        //while (rs.next()) {
        //    System.out.println(rs.getString("password"));
        //}
        
        
        //student.setAccess(0, "email@email.email");
        //System.out.println(student.getStudent("email@email.email").first());
        //mysql.insert("INSERT INTO `students` (`id`, `email`, `password`, `page_admin`) VALUES (1, 'email@email.email', '123456', '0')");
        
        //AdapterImport adapter = new JsonImport();
        //adapter.parseData("import.json");
        
    }

}
