package lesson_09.hash_code;
//1. Создай список слов, заполни его самостоятельно.
//        2. Метод fix должен:
//        2.1. удалять из списка строк все слова, содержащие букву "р"
//        2.2. удваивать все слова содержащие букву "л".
//        2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
//        2.4. с другими словами ничего не делать.

import java.util.ArrayList;

public class Zadacha0303 {
    public static void main(String[] args) {
        ArrayList<String> line = new ArrayList<>();
        line.add("роза");
        line.add("лоза");
        line.add("лира");
        line = fix(line);

        for (String string : line) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if(s.contains("р") && !s.contains("л")) {
                list.remove(i);
                i--;
            }else if (s.contains("л") && !s.contains("р")) {
                list.add(i + 1, s);
                i++;
            }else if (s.contains("р") && s.contains("л"));

        }
        return list;
    }
}
