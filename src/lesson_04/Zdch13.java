package lesson_04;
//Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.

import java.util.Scanner;

public class Zdch13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();

        }
        int max = array [0];


        boolean sorted = true;
        while (sorted) {
            sorted = false;
            for (int i = 1; i < array.length; i++) {
                if (max > array[i]) {
                    array[i] = max;
                    array[i] = array[i - 1];
                    array[i - 1] = max;
                    sorted = true;
                }
                System.out.print(array[i] + " ");
            }


        }


    }
}


