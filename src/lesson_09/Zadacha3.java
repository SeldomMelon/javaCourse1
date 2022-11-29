package lesson_09;
//3
//1. Создай список строк.
//2. Считай с клавиатуры 5 строк и добавь в список.
//3. Используя цикл, найди самую короткую строку в списке.
//4. Выведи найденную строку на экран.
//5. Если таких строк несколько, выведи каждую с новой строки.

import java.util.ArrayList;
import java.util.Scanner;

public class Zadacha3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            lines.add(scanner.nextLine());
        }

        int min = lines.get(0).length();
        for (String s : lines) {
            if (s.length() < min)
                min = s.length();
        }

        for (String s : lines)
            if (s.length() == min)
                System.out.println(s);
    }


}
