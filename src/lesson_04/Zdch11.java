package lesson_04;
//1. Создать массив на 20 чисел.
//2. Ввести в него значения с клавиатуры.
//3. Создать два массива на 10 чисел каждый.
//4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
//5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.

import java.util.Arrays;
import java.util.Scanner;

public class Zdch11 {
    public static void main(String[] args) {
        int [] arr1 = new int[20];
        int [] arr2 = new int[10];
        int [] arr3 = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            arr1 [i] = scanner.nextInt();
        }
        for (int j = 0; j < arr2.length; j++) {
            arr1 [j] = arr2 [j];
        }
        for (int k = 0; k < arr3.length; k++) {
            arr3 [k] = arr1[k + 10];
            System.out.println(arr3[k]);

        }

    }
}