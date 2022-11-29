package lesson_09.hash_code;
//1. Введи с клавиатуры 10 слов в список строк.
//
//        2. Метод doubleValues должен удваивать слова по принципу:
//        "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
//
//        3. Выведи результат на экран, каждое значение с новой строки.

import java.util.ArrayList;
import java.util.Scanner;

public class Zadacha0404 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lines.add(scanner.nextLine());
        }

        ArrayList<String> print = doubleValues(lines);
        for (int i = 0; i < print.size(); i++) {
            System.out.println(print.get(i));
        }
    }
    public static ArrayList<String> doubleValues(ArrayList<String> list){
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            list.add(i + 1, s);
            i+=1;
        }
        return list;
    }
}



