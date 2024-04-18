package ru.urfu;

public class EchoMessageHandler implements MessageHandler {

    @Override
    public String handle(String message) {
        return "Ваше сообщение: '" + message + "'";
    }
}
