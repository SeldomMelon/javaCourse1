package lesson_04;
//1. Создать массив на 10 строк.
//2. Создать массив на 10 чисел.
//3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
//4. В каждую ячейку массива чисел записать длину строки из массива строк,
// индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.

import java.util.Scanner;

public class Zdch9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = new String[10];
        int[] numbers = new int[10];

        for (int i = 0; i < line.length; i++) {
            line[i] = scanner.nextLine();
            numbers[i] = line[i].length();
        System.out.println(numbers[i]);
        }
    }
}