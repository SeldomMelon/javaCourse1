package lesson_12;


import java.util.HashMap;
import java.util.Map;

public class Zadacha12_04 {
    public static void main(String[] args) {
        Map<String, String> food = new HashMap<>();
        food.put("арбуз", "ягода");
        food.put("банан", "трава");
        food.put("вишня", "ягода");
        food.put("груша", "фрукт");
        food.put("дыня", "овощ");
        food.put("ежевика", "куст");
        food.put("жень-шень", "корень");
        food.put("земляника", "ягода");
        food.put("ирис", "цветок");
        food.put("картофель", "клубень");

        for (Map.Entry<String,String> entry : food.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
