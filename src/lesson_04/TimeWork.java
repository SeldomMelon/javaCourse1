package lesson_04;

import java.util.Scanner;

//циклы и масивы
public class TimeWork {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner num = new Scanner(System.in);
        int m = num.nextInt();
        int n = num.nextInt();

        for (int i = 1; i<=m; i++ ) {
            for (int j = 1; j <= n; j++) {
                System.out.print("8");
            }
            System.out.println();
        }

        }

    }






