package lesson_09;
//1
//1. Создай список строк.
//2. Добавь в него 5 различных строк.
//3. Выведи его размер на экран.
//4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.

import java.util.ArrayList;

public class Zadacha1 {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<String>();
        lines.add("Hello");
        lines.add("Good Game");
        lines.add("Java");
        lines.add("Panzer");
        lines.add("Apple");

        System.out.println(lines.size());
            for (int i = 0; i < 5; i++) {
                System.out.println(lines.get(i));
            }
    }
}


