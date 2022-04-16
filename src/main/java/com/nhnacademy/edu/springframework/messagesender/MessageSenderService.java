package com.nhnacademy.edu.springframework.messagesender;

public class MessageSenderService {
    private final MessageSender messageSender;
    private User user;

    public MessageSenderService(
        MessageSender messageSender,User user) {
        this.messageSender = messageSender;
        this.user = user;
    }

    public void doSendMessage() {
        messageSender.sendMessage(user, " Hello this is IoCMain call");
    }
}
