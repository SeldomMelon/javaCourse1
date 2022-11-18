package lesson_04;

import java.util.Scanner;
//Ввести с клавиатуры три числа, вывести на экран среднее из них.
//Т.е. не самое большое и не самое маленькое.
//Если все числа равны, вывести любое из них.

public class Zadch3 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner ch = new Scanner(System.in);

        int sum = 0;
        int a = ch.nextInt();
        int b = ch.nextInt();
        int c = ch.nextInt();

        if (a > b && a < c || a > c && a < b)
            System.out.println(a);
        else if (b > a && b < c || b > c && b < c)
            System.out.println(b);
        else
            System.out.println(c);

    }
}