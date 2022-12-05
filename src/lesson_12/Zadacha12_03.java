package lesson_12;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadacha12_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        while (true) {
            String city = scanner.nextLine();
            if (city.isEmpty()) {
                break;
            }
            String family = scanner.nextLine();
            map.put(city, family);
        }

        String city = scanner.nextLine();

        if (map.containsKey(city)) {
            String familyName = map.get(city);
            System.out.println(familyName);
        }
    }

}

