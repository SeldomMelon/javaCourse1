package lesson_04;

import java.util.Scanner;

public class zdch6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int day = scanner.nextInt();
        int mouth = scanner.nextInt();
        int year = scanner.nextInt();

        System.out.printf("Меня зовут " + name);
        System.out.println();
        System.out.println("Я родился "+ day +"." + mouth + "." + year);
    }
}
