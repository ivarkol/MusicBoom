package ru.bugmakers.exceptions;

/**
 * Created by Ivan
 */
public enum MbError {

    //Неизвестная ошибка
    UNE01("Неизвестная ошибка", "Что-то пошло не так"),

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
    AUE16("Ошибка аутентификации", "Невалидный token или id пользователя в социальной сети"),
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
    RGE10("Ошибка регистрации", "Аккаунт социальной сети vk.com уже привязан к другому пользователю"),
    RGE11("Ошибка регистрации", "Аккаунт социальной сети facebook.com уже привязан к другому пользователю"),
    RGE12("Ошибка регистрации", "Аккаунт социальной сети google.com уже привязан к другому пользователю"),

    //Ошибки редактирования профиля
    APE01("Ошибка редактирования профиля", "Пользователь не найден"),
    APE02("Ошибка редактирования профиля", "Пользоатель не является артистом"),
    APE03("Ошибка редактирования профиля", "Не удалось сохранить пользователя"),
    APE04("Ошибка редактирования профиля", "Не удалось сохранить файл"),
    APE05("Ошибка редактирования профиля", "Старый пароль не совпадает с текущим"),
    APE06("Ошибка редактирования профиля", "Аватар не найден в запросе"),


    //Общие ошибки
    CME01("Общая ошибка", "Не удалось сохранить файл"),
    CME02("Общая ошибка", "У пользователя нет активных выступлений"),
    CME03("Общая ошибка", "Пользователь не найден"),
    CME04("Общая ошибка", "Не удалось сохранить пользователя"),
    CME05("Общая ошибка", "Не корректные входящие данные"),
    CME06("Общая ошибка", "Некорректный email"),
    CME07("Общая ошибка", "Некорректный код подтверждения email"),
    CME08("Общая ошибка", "Пользователя с таким id не существует"),

    //Ошибка отправки сообщения
    SEE01("Ошибка отправки сообщения", "Не удалось отправить сообщение"),
    SEE02("Ошибка отправки сообщения", "Не удалось сохранить пользователя"),
    SEE03("Ошибка отправки сообщения", "У пользователя не заполнено в профиле поле email"),
    SEE04("Ошибка отправки сообщения", "Пользователя с таким email не существует"),
    SEE05("Ошибка отправки сообщения", "Email пользователя не подтвержден"),

    //Ошибки редактирования финансовых данных пользователя
    FDE01("Ошибки редактирования финансовых данных пользователя", "Пришел не корректный номер карты"),

    //Ошибки транзакций
    TRE01("Ошибка транзакций", "Сумма вывода превышает досутпный лимит"),
    TRE02("Ошибка транзакций", "Транзакция не найдена"),
    TRE03("Ошибка транзакций", "Передан некорректный статус транзакции"),
    TRE04("Ошибка транзакций", "У пользователя нет карт для вывода денежных средств"),
    TRE05("Ошибка транзакций", "Некорректный callback от Яндекс"),
    TRE06("Ошибка транзакций", "Транзакция не соответствует транзакции вывода денежных средств пользователем"),

    //Ошибки восстановления пароля
    PRE01("Ошибка восстановления пароля", "Код неверный"),
    PRE02("Ошибка восстановления пароля", "Повторно введенный пароль не совпадает с паролем"),
    ;

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
