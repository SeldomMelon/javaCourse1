package lesson_09.hash_code;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadacha0101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> lines = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            lines.add(scanner.nextLine());
        }

        lines.remove(2);

        for (int i = lines.size()-1; i >= 0 ; i--) {
            System.out.println(lines.get(i));
        }
    }

}
