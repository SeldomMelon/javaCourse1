package Sobesedovanie_2;
//На вход подается строка с текстом.
//Необходимо посчитать, сколько встречается раз каждое слово в этой строке. Вывести слово и число его повторений.
//Использовать Map, string.split(" ") - для деления текста по словам.
//Слово - символы, ограниченные пробелами справа и слева.


import java.util.HashMap;
import java.util.Scanner;

public class work {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] words = string.split("\\s+");
        HashMap<String, Integer> wordsToCount = new HashMap<>();
        for (String word : words)
        {
            if (!wordsToCount.containsKey(word))
            {
                wordsToCount.put(word, 0);
            }
            wordsToCount.put(word, wordsToCount.get(word) + 1);
        }
        for (String word : wordsToCount.keySet())
        {
            System.out.println(word + " " + wordsToCount.get(word));
        }
    }
}
