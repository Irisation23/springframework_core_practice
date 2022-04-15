package com.nhnacademy.edu.springframework.messagesender;

public class EmailMessageSender implements MessageSender{
    private User user;
    private String message;

    public EmailMessageSender(){};

    public EmailMessageSender(User user, String message) {
        this.user = user;
        this.message = message;
    }

    @Override
    public void sendMessage(User user, String message) {
        System.out.println("SMS Message :"+user.getPhoneNumber() + message);
    }
}
