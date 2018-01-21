package ru.bugmakers.exceptions;

/**
 * Created by Ivan
 */
public enum MbError {

    //Неизвестная ошибка
    UNE01("Неизвестная ошибка",""),

    //Ошибки аутентификации
    AUE01("Ошибка аутентификации", "Сервис Вконтакте вернул некорректный code"),
    AUE02("Ошибка аутентификации", "Сервис Вконтакте вернул некорректный token"),
    AUE03("Ошибка аутентификации", "Сервис Вконтакте вернул некорректный id пользователя"),
    AUE04("Ошибка аутентификации", "Введенные логин и пароль некорректные или отсутствуют в запросе"),
    AUE05("Ошибка аутентификации", "Введена неверная пара логин:пароль"),
    AUE06("Ошибка аутентификации", "Аккаунт пользователя с введенным логином отключен"),
    AUE07("Ошибка аутентификации", "Неизвестная ошибка при аутентификации"),
    AUE08("Ошибка аутентификации", "Тип пользователя неизвестен"),

    //Ошибки доступа к защищенным ресурсам
    ACE01("Ошибка доступа", "Для доступа к защищенному ресурсу необходима аутентификация"),

    //Ошибки регистрации
    RGE01("Ошибка регистрации", "Не корректное входящее сообщение"),
    RGE02("Ошибка регистрации", "Пользователь уже существует"),
    RGE03("Ошибка регистрации", "Не удалось создать пользователя"),
    RGE04("Ошибка регистрации", "Не удалось сформировать ответ");

    private String title;
    private String message;
    MbError(String title, String message) {
        this.title = title;
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public String getCode() {
        return this.name();
    }
}
