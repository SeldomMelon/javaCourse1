package lesson_12;


import java.util.HashMap;

public class Zadacha12_01 {
    public static void main(String[] args) {
        HashMap<String, String> name = new HashMap<>();

        name.put("Новиков", "Никита");
        name.put("Миронова", "Виктория");
        name.put("Абрамов", "Арсений");
        name.put("Новиков", "Артём");
        name.put("Логинов", "Мирослав");
        name.put("Фролов", "Артём");
        name.put("Кузнецов", "Сергей");
        name.put("Шмелев", "Александр");
        name.put("Фадеева", "Дарья");
        name.put("Горелова", "Ольга");

        System.out.println(name);
    }
}
