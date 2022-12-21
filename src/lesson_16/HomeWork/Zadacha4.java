package lesson_16.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadacha4 {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        List<String> vowel = new ArrayList<>();
        List<String> consonants = new ArrayList<>();
        String words = scanner.nextLine();

        char[] stringToArray = words.toCharArray();
        for (char c : stringToArray) {
            if (isVowel(c)) {
                System.out.print(c + " ");
            }
        }
        System.out.println();

        for (char c : stringToArray) {
            if (!isVowel(c)) {
                System.out.print(c + " ");
            }
        }
    }
        // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character); // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) { // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}
