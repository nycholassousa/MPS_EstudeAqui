package business.control.questions.observer;

import business.control.StudentControl;
import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class QuestionsObserver extends Observer {

    public QuestionsObserver(QuestionsSubject questions) {
        super(questions);
    }

    @Override
    public void update() {
        Properties props = new Properties();

        //Parâmetros de conexão com servidor Gmail
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("email@gmail.com", "password");
            }
        });

        session.setDebug(true);

        try {

            Message message = new MimeMessage(session);
            //Remetente
            message.setFrom(new InternetAddress("email@gmail.com"));

            //Destinatário
            Address[] toUser = InternetAddress.parse(StudentControl.student.getEmail());

            message.setRecipients(Message.RecipientType.TO, toUser);
            message.setSubject("Novas Questões no Estude Aqui!");//Assunto
            message.setText("Novas Questões Adicionadas! Agora o total de questoes são: " + questions.getState() + "\n\n"
                    + "Tenha um ótimo dia e uma boa sessão de estudo!");
            /**
             * Método para enviar a mensagem criada
             */
            Transport.send(message);

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

}
