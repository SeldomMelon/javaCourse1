package lesson_05;
//Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
//Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.
//
//Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
//Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.
//Программа выводит слова на экран.


import java.util.Locale;
import java.util.Scanner;

public class zdch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        while (true) {
            if (word == null || word.isEmpty())
                break;

        }
        System.out.print(word.toUpperCase());
    }

}

