package lesson_16.HomeWork;

import java.util.*;

public class Zadacha1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');
        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String line = scanner.nextLine();
            list.add(line.toLowerCase());
        }

        // напишите тут ваш код
        for (int i = 0; i < alphabet.size(); i++) {
            int count = 0;
            for (String a : list) {
                char[] chArray = a.toCharArray();
                for (char b : chArray) {
                    if (alphabet.get(i).equals(b)) {
                        count++;
                    }
                }
            }
            System.out.println(alphabet.get(i) + " " + count);
        }
    }
}