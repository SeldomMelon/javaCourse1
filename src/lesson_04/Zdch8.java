package lesson_04;

//1.1. Создай массив на 10 чисел
//1.2. Считай с консоли 10 чисел и заполни ими массив
//2. Найти максимальное число из элементов массива

import java.util.Scanner;

public class Zdch8 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        int max=0;

        for (int i = 0; i < 10; i++) {
            array [i] = scanner.nextInt();
            if (max < array[i]) {
                max = array[i];
            }

        }
        System.out.println(max);


    }
}





