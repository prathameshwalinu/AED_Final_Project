package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/**
 *
 * @author prathamesh
 */
public class EmailFun {



    public static void sendMail(String recepient, String message)
    {
        try {
            Properties pro = new Properties();
            pro.put("mail.smtp.auth", "true");
            pro.put("mail.smtp.starttls.enable", "true");
            pro.put("mail.smtp.host", "smtp.gmail.com");
            pro.put("mail.smtp.port", "587");

            String myAccEMail =    "hulkrobert25@gmail.com";
            String password = "pblqxfiyclbgtpvp";

            Session ses = Session.getInstance(pro, new Authenticator()
            {
                @Override
                protected PasswordAuthentication getPasswordAuthentication(){
                    return new PasswordAuthentication(myAccEMail, password);
                }
            });

            Message msg = prepareMessage(ses, myAccEMail, recepient, message);

            Transport.send(msg);    
            System.out.println("Message sent successfully");
        } catch (MessagingException ex) {
            Logger.getLogger(EmailFun.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
        private static Message prepareMessage(Session ses, String myAccEMail, String recepient, String mainMessage)
        {
        try {
            Message message = new MimeMessage(ses);
            message.setFrom(new InternetAddress(myAccEMail));

            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient ) );
            message.setSubject("Your Booking Confirmation");
            message.setText(mainMessage);
            return message;
        } catch (Exception ex) {
            Logger.getLogger(EmailFun.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        }

}