package lesson_16.HomeWork;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadacha5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = scanner.nextLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String st : array) {
            System.out.println(st);
        }
    }

    public static void sort(String[] array) {
        String line = null;
        int num1 = Integer.MIN_VALUE;
        int num2 = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (letters(array[j], array[i]) && !isNum(array[i])) {
                    line = array[i];
                    array[i] = array[j];
                    array[j] = line;
                }
                if (isNum(array[i]) && isNum(array[j])) {
                    num1 = Integer.parseInt(array[i]);
                    num2 = Integer.parseInt(array[j]);
                    if (num1 > num2) {
                        line = array[j];
                        array[j] = array[i];
                        array[i] = line;
                    }
                }
            }
        }
    }

    public static boolean letters(String a, String b) {
        return a.compareTo(b) > 0;
    }

    public static boolean isNum(String s) {
        if (s.length() == 0) return false;
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c) && c != ' ') return false;
        }
        return true;
    }
}