package com.amigoscode._3_oop._5_dependencyinjection;

public class NotificationService {

    private final MessageSender messageSender;


    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    void sendMessage(String to, String message) {
        /// it doesn't know which implementation is calling the send method - hiding internals
        messageSender.send(to, message);
    }
}
