package DUJS.methods;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {
    
    public static void sendMail(String Emto,String Emsub,String Emcon,String Emotp){
        
        String host = "smtp.gmail.com"; //gmail host
        String PrimEmail = "DailyUtilitiesandJobSolution";

        Properties properties = System.getProperties(); //getting system properties

        //configuring host settings

        properties.put("mail.smtp.host",host);
        properties.put("mail.smtp.port","465");
        properties.put("mail.smtp.ssl.enable","true");
        properties.put("mail.smtp.auth","true");

        //session creation
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("symbiconnect.info@gmail.com","Askmyname");
            }
        });
        
        //compose text
        MimeMessage m =  new MimeMessage(session);
        try {
            m.setFrom(PrimEmail); //sender
            m.addRecipient(Message.RecipientType.TO,new InternetAddress(Emto)); //recipient
            m.setSubject(Emsub); //subject
            m.setText(Emcon); //email content

            Transport.send(m); //message sent
        }catch (Exception e){
            e.printStackTrace();
        }
    
    }
    
}
