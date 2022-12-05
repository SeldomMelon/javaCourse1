package lesson_12;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadacha12_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> month = new HashMap<>();

        month.put("January", 1);
        month.put("February", 2);
        month.put("March", 3);
        month.put("April", 4);
        month.put("May", 5);
        month.put("June", 6);
        month.put("July", 7);
        month.put("August", 8);
        month.put("September", 9);
        month.put("October", 10);
        month.put("November", 11);
        month.put("December", 12);

        String monthNum = scanner.nextLine();
        for (Map.Entry<String, Integer> entry : month.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (key.equals(monthNum)) {
                System.out.println(key + " is the " + value + " month");
            }
        }
    }
}
