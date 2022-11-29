package lesson_05;

import java.util.Locale;
import java.util.Scanner;

public class zdch1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lines = new String[50];


        for (int i = 0; i < lines.length; i++) {
            lines[i] = scanner.nextLine();
            if (lines[i].isEmpty())
                break;
        }

        for (int i = 0; i < lines.length; i++) {
            if (lines[i] != null)
                if (lines[i].length() % 2 == 0) {
                    System.out.println(lines[i].toUpperCase() + " " + lines[i].toUpperCase());
                } else {
                    System.out.println(lines[i].toUpperCase() + " " + lines[i].toUpperCase() + " " + lines[i].toUpperCase());
                }
        }
    }
}







