package lesson_04;
//1. Создать массив на 10 чисел.
//2. Ввести с клавиатуры 10 чисел и записать их в массив.
//3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.

import java.util.Scanner;

public class Zdch10 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner array1 = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            array[i] = array1.nextInt();
        }
        for (int i = 9; i >= 0 ; i--) {
            System.out.println(array[i]);

        }
    }
}