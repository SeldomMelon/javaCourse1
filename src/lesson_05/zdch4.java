package lesson_05;
//1. Создать массив на 10 строк.
//2. Создать массив на 10 чисел.
//3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
//4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки
//которой совпадает с текущим индексом из массива чисел.

import java.util.Scanner;

public class zdch4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lines = new String[10];
        int[] number = new int[10];

        for (int i = 0; i < lines.length; i++) {
            lines[i] = scanner.nextLine();
        }
        for (int i = 0; i < number.length; i++) {
            number[i] = lines[i].length();
        }
    }
}

