package lesson_05;
//1. Считать 6 строк и заполнить ими массив strings.
//2. Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").

import java.util.Scanner;

public class zdch5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lines = new String[6];

        for (int i = 0; i < lines.length; i++) {
            lines[i] = scanner.nextLine();
        }
        for (int i = 0; i < lines.length - 1; i++) {
            for (int j = i + 1; j < lines.length; j++)
                if (lines[i] != null && lines[i].equals(lines[j]))
                    lines[j] = null;
        }
    }
}