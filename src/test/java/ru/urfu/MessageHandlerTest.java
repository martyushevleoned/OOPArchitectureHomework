package ru.urfu;

import org.junit.Test;

public class MessageHandlerTest {

    private final MessageHandler messageHandler = new EchoMessageHandler();

    @Test
    public void echoMessageTest() {
        String userMessage = "привет";
        String botMessage = messageHandler.handle(userMessage);
        assert botMessage.equals("Ваше сообщение: 'привет'");
    }
}