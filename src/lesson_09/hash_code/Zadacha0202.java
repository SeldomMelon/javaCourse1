package lesson_09.hash_code;

import java.util.ArrayList;

public class Zadacha0202 {
    public static void main(String[] args) {
        ArrayList<String> line = new ArrayList<>();
        line.add("мама");
        line.add("мыла");
        line.add("раму");

        for (int i = 0; i < line.size(); i++) {
            String imenno = "именно";
            line.add(i + 1, imenno);
            i++;
        }
        for (int i = 0; i < line.size(); i++) {
            System.out.println(line.get(i));
        }
    }
}