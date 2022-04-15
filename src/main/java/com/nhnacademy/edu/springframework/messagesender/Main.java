package com.nhnacademy.edu.springframework.messagesender;

public class Main {
    public static void main(String[] args) {
        User user = new User("bunsung92@naver.com", "010123");
        String message = "say! Hello World";

        sendSmsMessage(user,message);
        sendEmailMessage(user,message);

    }

    static void sendSmsMessage(User user, String message){
        System.out.println("SMS Message :"+user.getEmail() + message);
    }

    static void sendEmailMessage(User user, String message){
        System.out.println("Email Message :"+user.getEmail() + message);
    }
}
