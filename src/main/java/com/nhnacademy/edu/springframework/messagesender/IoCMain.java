package com.nhnacademy.edu.springframework.messagesender;

public class IoCMain {
    public static void main(String[] args) {
        User user = new User("bunsung92","010");

        new MessageSenderService(new SmsMessageSender(user,"sexy"),user).doSendMessage();
        new MessageSenderService(new EmailMessageSender(user,"sexy"),user).doSendMessage();

    }
}
