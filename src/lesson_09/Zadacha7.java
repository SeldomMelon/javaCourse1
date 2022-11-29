package lesson_09;
//7
//1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
//Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
//Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
//Порядок объявления списков очень важен.
//1.1 Создай метод printList
//2. Метод printList должен выводить на экран все элементы списка с новой строки.
//3. Используя метод printList выведи эти три списка на экран.
//Сначала тот, который для x%3, потом тот, который для x%2, потом последний.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadacha7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> three = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        ArrayList<Integer> util = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            array.add(scanner.nextInt());
        }
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 3 == 0) {
                three.add(array.get(i));
            } else if (array.get(i) % 2 == 0) {
                two.add(array.get(i));
            } else if (array.get(i) % 3 == 0 && array.get(i) % 2 == 0) {
                three.add(array.get(i));
                two.add(array.get(i));
            } else {
                util.add(array.get(i));
            }
        }
        printList(three);
        printList(two);
        printList(util);
    }
    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}