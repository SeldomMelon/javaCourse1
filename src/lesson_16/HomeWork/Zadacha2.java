package lesson_16.HomeWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadacha2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map <String, Integer> map = new HashMap<>();

        while(true) {
            String s= scanner.nextLine();
            if(s.isEmpty())
                break;
            int id = Integer.parseInt(s);
            String name = scanner.nextLine();
            map.put(name, id);
        }
        for(Map.Entry<String, Integer> e:  map.entrySet())
            System.out.println(e.getValue() + " " + e.getKey());
    }
}




