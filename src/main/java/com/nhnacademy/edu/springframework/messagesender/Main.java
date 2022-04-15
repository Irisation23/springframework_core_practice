package com.nhnacademy.edu.springframework.messagesender;

public class Main {
    public static void main(String[] args) {
        User user = new User("bunsung92@naver.com", "010123");
        String message = "say! Hello World";

        EmailMessageSender emailMessageSender = new EmailMessageSender(user,message);
        SmsMessageSender smsMessageSender= new SmsMessageSender(user,message);

        emailMessageSender.sendMessage(user,message);
        smsMessageSender.sendMessage(user,message);

    }
}
