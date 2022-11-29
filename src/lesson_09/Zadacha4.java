package lesson_09;
//4
//1. Создай список строк в методе main.
//2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
//3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.

import java.util.ArrayList;
import java.util.Scanner;

public class Zadacha4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<String>();


        for (int i = 0; i < 10; i++) {
            lines.add(scanner.nextLine());
        }

        for (int i = 0; i < lines.size(); i++) {
            System.out.println(lines.get(i));

        }
    }
}
