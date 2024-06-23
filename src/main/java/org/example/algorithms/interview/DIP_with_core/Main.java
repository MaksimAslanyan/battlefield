package org.example.algorithms.interview.DIP_with_core;

public class Main {
    public static void main(String[] args) {
        // Создание реализаций MessageService
        MessageService emailService = new EmailService();
        MessageService smsService = new SMSService();

        // Внедрение зависимостей через конструктор
        MessageProcessor emailProcessor = new MessageProcessor(emailService);
        MessageProcessor smsProcessor = new MessageProcessor(smsService);

        // Использование MessageProcessor для отправки сообщений
        emailProcessor.processMessage("Hello via Email", "email@example.com");
        smsProcessor.processMessage("Hello via SMS", "123-456-7890");
    }
}
