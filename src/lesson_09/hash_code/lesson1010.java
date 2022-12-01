package lesson_09.hash_code;

import java.util.HashSet;

/**
 * Блок теории 3 HashCode
 * Ключевое слова Hash - означает наличие в коллекции механизма хэширования
 * Представьте что вы коллекционер монет и у Вас уже есть коллекция монет из 19 000 штук.
 * Вом предложили новую монету, кок быстро проверить есть ли ток я же у вос или нет, ведь
 в коллекции все монеты должны быть уникальный. Можно быстро проверить по страном, по номиналу, по диаметру, год выпуска.
 * То есть нужны характеристики которые есть у каждой монеты. * И характеристика должна быть
 объективно определяемой, например цвет не пойдет.
 * Совокупность хароктеристик может дать числовой код, который и покажет номер ячейки.
 * При этом у двух разных монеток могут быть разные хэшкоды, но у монет будут еще отличия,
 которые не вошли * в хэшкод, например цвет. Поэтому после отроботки методо .hashcode должен
 отроботать метод .equals u * окончательно сравнить монеты и вернуть boolean означающий есть
 такая монета в коллекции или нет.
 * */

public class lesson1010 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(10,20.6, "Russia", 1996);
        Coin coin2 = new Coin(10,20.6, "Russia", 1996);
        Coin coin3 = new Coin(5,19.5, "Brazil", 1991);
        Coin coin4 = new Coin(2,18.7, "Portugal", 1992);
        Coin coin5 = new Coin(1,20.3, "Belarus", 1989);

        HashSet<Coin> coinCollection = new HashSet<>();
        coinCollection.add(coin1);
        coinCollection.add(coin2);
        coinCollection.add(coin3);
        coinCollection.add(coin4);
        coinCollection.add(coin5);

        for (Coin c: coinCollection){
            System.out.println(c);
        }
    }

}
