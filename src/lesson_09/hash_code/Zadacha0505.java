package lesson_09.hash_code;
//1. Введи с клавиатуры 10 слов в список строк.
//2. Определить, является ли список упорядоченным по возрастанию длины строки.
//3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.

import java.util.ArrayList;
import java.util.Scanner;

public class Zadacha0505 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lines.add(scanner.nextLine());
        }

        for (int i = 1; i < lines.size(); i++) {
            if (lines.get(i).length() >= lines.get(i-1).length()) {
                i++;
            }else {
                System.out.println(i);
                break;
            }
        }
    }
}


