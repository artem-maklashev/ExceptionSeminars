package org.example;

public class Task3 {
        public static void main(String[] args) {
            try {
                methodA();
            } catch (Exception e) {
                System.out.println("Вывод catch");
                e.printStackTrace();
            }
            System.out.println("После вывода catch");
        }

        public static void methodA() throws Exception {
            methodB();
        }

        public static void methodB() throws Exception {
            throw new Exception("Пример исключения");
        }
    }

