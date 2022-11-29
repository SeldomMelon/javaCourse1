package lesson_09;
//5
//1. Создай список строк.
//2. Добавь в него 5 строк с клавиатуры.
//3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
//4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.

import java.util.ArrayList;
import java.util.Scanner;

public class Zadacha5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            lines.add(scanner.nextLine());
        }

        for (int i = 0; i < 13; i++) {
            String s = lines.get(4);
            lines.remove(4);
            lines.add(0, s);
        }
        for (String line : lines){
            System.out.println(line);
        }
    }
}

