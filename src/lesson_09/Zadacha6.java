package lesson_09;
//6
//1. Создай список строк.
//2. Добавь в него 10 строчек с клавиатуры.
//3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
//Если таких строк несколько, то должны быть учтены самые первые из них.
//4. Выведи на экран строку из пункта 3. Должна быть выведена одна строка.

import java.util.ArrayList;
import java.util.Scanner;

public class Zadacha6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        int max = 0;
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < 10; i++) {
            lines.add(scanner.nextLine());
        }

        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).length() > max) {
                max = lines.get(i).length();
                maxIndex = i;
            }
            if (lines.get(i).length() < min) {
                min = lines.get(i).length();
                minIndex = i;
            }
        }
        if(minIndex >= maxIndex)
            System.out.println(lines.get(maxIndex));
        else
            System.out.println(lines.get(minIndex));
    }
}


