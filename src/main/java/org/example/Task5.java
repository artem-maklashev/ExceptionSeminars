/*
Задача: Проверка правильности ввода пароля
Напишите программу, которая запрашивает у пользователя пароль. Правила для пароля следующие:

Длина пароля должна быть не менее 8 символов.
Пароль должен содержать хотя бы одну заглавную букву.
Пароль должен содержать хотя бы одну цифру.
Пароль должен содержать хотя бы один специальный символ (!@#$%^&*).
Если пользователь вводит неправильный пароль, программа должна выбрасывать исключение
InvalidPasswordException с сообщением о причине ошибки. Необходимо обработать исключение и вывести соответствующее сообщение.
 */
package org.example;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль:");
        String password = scanner.next();
        try {
            checkPassword(password);
        } catch(InvalidPasswordException ex){
            System.out.println("Ошибка"+ex.getMessage());
        } finally {
            System.out.println("Пароль проверен");
        }
    }
    public static void checkPassword(String password) throws InvalidPasswordException {
        if(password.length() <8){
            throw new InvalidPasswordException("Длина пароля меньше 8 символов");
        }
        if(!password.matches(".*[A-Z].*")){
            throw new InvalidPasswordException("Необходима хотя бы одна заглавная буква");
        }
        if(!password.matches(".*[0-9].*")){
            throw new InvalidPasswordException("Пароль должен содержать хотя бы одну цифру");
        }
        if(!password.matches(".*[!@#$%^&*_].*")){
            throw new InvalidPasswordException("Должен присутствовать хотя бы один спецсимвол");
        }
        System.out.println("Пароль корректный" );

    }
}

class InvalidPasswordException extends Exception{
    public InvalidPasswordException(String message){
        super(message);
    }
}
