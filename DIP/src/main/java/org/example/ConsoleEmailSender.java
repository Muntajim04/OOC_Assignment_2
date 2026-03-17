package org.example;

public class ConsoleEmailSender implements EmailSender {
    @Override
    public void send(Email email){
        System.out.println(
                "To: " + email.getTo() +
                        ", Subject: " + email.getSubject() +
                        ", Message: " + email.getMessage()
        );
    }
}