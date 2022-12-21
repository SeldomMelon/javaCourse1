package lesson_16.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadacha3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        sort(array);

        System.out.println(array[9]);
        System.out.println(array[10]);
    }
    public static void sort(int[] array) {
        for (int i = 0; i < array.length ; i++) {
            for (int k = 0; k < array.length ; k++) {
                if (array[i] < array[k]) {
                    int min = array[k];
                    array[k] = array[i];
                    array[i] = min;
                }
            }
        }
    }
}

