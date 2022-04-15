package com.nhnacademy.edu.springframework.messagesender;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {

    public static void main(String[] args) {
        User user = new User("bunsung92","01058500345");
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"))
        {
            EmailMessageSender emailMessageSender = context.getBean("emailMessageSender", EmailMessageSender.class);
            EmailMessageSender emailMessageSender1 = context.getBean("emailMessageSender", EmailMessageSender.class);
            SmsMessageSender smsMessageSender = context.getBean("smsMessageSender", SmsMessageSender.class);
            SmsMessageSender smsMessageSender1 = context.getBean("smsMessageSender", SmsMessageSender.class);


            emailMessageSender.sendMessage(user," this is emailSender");
            smsMessageSender.sendMessage(user," this is smsSender");
        }

    }
}
