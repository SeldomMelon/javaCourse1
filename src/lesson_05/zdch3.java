package lesson_05;
//1. Создать массив на 10 строк.
//2. Ввести с клавиатуры 8 строк и сохранить их в массив.
//3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки

import java.util.Scanner;

public class zdch3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lines = new String[10];

        for (int i = 0; i < 8; i++) {
            lines[i] = scanner.nextLine();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(lines[i]);
        }
    }
}
