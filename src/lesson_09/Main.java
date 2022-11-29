package lesson_09;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // 1. Создание и добавление в неё элементов
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);

        // 2. Метов add() - с утказанием индекса
            list.add(2, 88);

        // 3. Метод set() - затирает значение по определённому индексу
            list.set(3, 99);

        // 4 Метод size() - возвращает размер коллекции
            System.out.println(list.size());

        // 5 Метод get() - брать объекты нашей коллекции
            for (Integer c : list) {
            System.out.println(c + " , ");

         // 6 toArray () - преобразование коллекции в массив

            // 7 Метод contains() - содержит ли коллекция определённый эллемент

            // 8 addAll() - Добавить все элементы в новую коллекцию из старой
            ArrayList<Integer> copyList = new ArrayList<>();
            copyList.addAll(list);

            // 9 remove() - удаление элементов коллекции по определённому индексу


            // 10 метод indexOf() возвращающий индекс элемента коллекции

            // 11 sort() - сортировка

            // 12 isEmpty() - проверка пустой лист или нет

            // 13 clear() - удаление всех элементов коллекции

            // 14

            // 15

        }
    }
}