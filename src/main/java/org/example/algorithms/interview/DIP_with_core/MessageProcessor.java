package org.example.algorithms.interview.DIP_with_core;

public class MessageProcessor {
    private final MessageService messageService;

    public MessageProcessor(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message, String recipient) {
        // Можно добавить дополнительную логику обработки сообщения здесь
        messageService.sendMessage(message, recipient);
    }
}
