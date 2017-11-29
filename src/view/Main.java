package view;

import business.control.StudentControl;
import infra.adapter.AdapterImport;
import infra.adapter.JsonImport;
import infra.database.MysqlConnect;
import business.model.exceptions.StudentNotExistException;
import business.model.student.Student;
import com.mysql.jdbc.MySQLConnection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {    
    
    /* Padroes de Projeto propostos pelo professor:
    Adapter: Usado para importar um arquivo JSON ou CSV para o Mysql - FEITO
    Template Method: Relatorios de usuário - FEITO, falta relatório de admin
    Fachada: Iniciar o observer - TODO
    Factory Method/Abstract Factory: Pacote business.control.questions.factory - FEITO
    Command: Responder Questionario, business.control.command, necesário fazer Composite - TODO
    Memento: ???
     */

    /* Padroes adicionais propostos:
    Singleton: Usado na classe MysqlConnect - FEITO
    Observer: Verificar se o valor no arquivo no sistema bate com o valor da db_config, caso bata, ok, senao, dar aviso ao usuario - TODO
    State: Pacote business.mode.student.state - FEITO
    DAO: Pacote business.database - FEITO
    Composite: Funcionar lado a lado do Command - TODO
     */
    
    /* RFs:
    RF001: Usuário Admin - FEITO, função setAccess na classe StudentControl
    RF002: Relatório de Admininistrador - TODO
    RF003: Cadastro de Usuário - FEITO, função addStudent na classe StudentControl
    RF004: Exibir Questionários - FEITO, Pacote business.control, classe QuestionsControl, método getAllQuestions
    RF005: Relatório de Usuário - FEITO, Salvando em PDF ou exibindo no programa
    RF006: Login de Usuário - FEITO, classe StudentControl
    RF007: Notificação de novas questões - TODO, será usado padrão observer
    RF008: Importar Questões - FEITO, usando Adapter com Factory para importar Json/CSV
    RF009: Responder Questionário - TODO, Será feito usando command
    RF010: Passar Questão
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