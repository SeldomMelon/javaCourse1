package lesson_04;
//Создать массив на 20 чисел.
//Заполнить его числами с клавиатуры.
//Найти максимальное и минимальное числа в массиве.
//Вывести на экран максимальное и минимальное числа через пробел.

import java.util.Scanner;

public class Zdch12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;

        int[] array = new int[20];
        for(int i = 0; i < array.length; i++) {
            array [i] = scanner.nextInt();
            if (min > array[i]){
                min = array [i];
            }
            if (max < array[i]) {
                max = array[i];
            }

        }
        System.out.println(min + " " + max);

    }


}


