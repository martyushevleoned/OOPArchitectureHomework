package ru.urfu;

/**
 * Обработчик сообщений
 */
public interface MessageHandler {

    /**
     * обрабатывает текст сообщения и возвращает текст ответа
     */
    String handle(String message);
}
