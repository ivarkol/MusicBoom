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
    AUE09("Ошибка аутентификации", "Сервис Facebook вернул некорректный code"),
    AUE10("Ошибка аутентификации", "Сервис Facebook вернул некорректный token"),
    AUE11("Ошибка аутентификации", "Сервис Facebook вернул некорректный id пользователя"),
    AUE12("Ошибка аутентификации", "Сервис Google вернул некорректный code"),
    AUE13("Ошибка аутентификации", "Сервис Google вернул некорректный token"),
    AUE14("Ошибка аутентификации", "Сервис Google вернул некорректный id пользователя"),
    AUE15("Ошибка аутентификации", "Неопознанный провайдер аутентификации"),
    AUE16("Ошибка аутентификации", "Невалидный token или id пользователя"),
    AUE17("Ошибка аутентификации", "Пользователь неактивен"),
    AUE18("Ошибка аутентификации", "Пользователь незарегистрирован"),

    //Ошибки доступа к защищенным ресурсам
    ACE01("Ошибка доступа", "Для доступа к защищенному ресурсу необходима аутентификация"),

    //Ошибки регистрации
    RGE01("Ошибка регистрации", "Некорректное входящее сообщение"),
    RGE02("Ошибка регистрации", "Пользователь c таким email уже существует"),
    RGE03("Ошибка регистрации", "Не удалось создать пользователя"),
    RGE04("Ошибка регистрации", "Не удалось сформировать ответ"),
    RGE05("Ошибка регистрации", "Пользователь не проходил авторизацию в сервисе vk.com"),
    RGE06("Ошибка регистрации", "Пользователь не проходил авторизацию в сервисе facebook.com"),
    RGE07("Ошибка регистрации", "Пользователь не проходил авторизацию в сервисе google.com"),
    RGE08("Ошибка регистрации", "Неизвестная ошибка при регистрации"),
    RGE09("Ошибка регистрации", "Пользователь c таким номером телефона уже существует"),

    APE01("Ошибка редактирования профиля", "Пользователь не найден"),
    APE02("Ошибка редактирования профиля", "Пользоатель не является слушателем"),
    APE03("Ошибка редактирования профиля", "Не удалось сохранить пользователя"),
    APE04("Ошибка редактирования профиля", "Не удалось сохранить файл"),

    //Общие ошибки
    UE01("Общая ошибка", "Не удалось сохранить файл"),
    //Ошибка отправки сообщения
    SEE01("Ошибка отправки сообщения", "Не удалось отправить сообщение");    ;

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
