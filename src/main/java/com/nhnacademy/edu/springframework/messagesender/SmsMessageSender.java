package com.nhnacademy.edu.springframework.messagesender;

public class SmsMessageSender implements MessageSender{
    private User user;
    private String message;

    public SmsMessageSender(){
        System.out.println("SmsMessageSender initiated!!");
    };

    public SmsMessageSender(User user, String message) {
        this.user = user;
        this.message = message;
    }

    @Override
    public void sendMessage(User user, String message) {
        System.out.println("Email Message :"+user.getEmail() + message);

    }
}
