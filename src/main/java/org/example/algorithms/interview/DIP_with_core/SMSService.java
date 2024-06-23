package org.example.algorithms.interview.DIP_with_core;

public class SMSService implements MessageService {
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("Sending SMS to " + recipient + " with message: " + message);
    }
}
