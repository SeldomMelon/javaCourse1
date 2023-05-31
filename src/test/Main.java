package test;

/** Есть список товаров, относящихся к категории “Книги”. У каждой книги есть id, наименование, цена.
 * Необходимо отфильтровать книги с ценой > 100. Использовать Stream API
 * На выходе программы должны быть распечатаны книги в формате
 * <Наименование> : <Стоимость>
 * Использовать Stream API
 *
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Category> categories = new ArrayList<>();
        categories.add(new Category(1, "Война и Мир", 40));
        categories.add(new Category(2, "Отцы и Дети", 790));
        categories.add(new Category(3, "Портрет Дориана Грея", 60));
        categories.add(new Category(4, "Финансист", 248));
        categories.add(new Category(5, "Маленький принц", 30));
        categories.add(new Category(6, "Преступление и наказание", 399));

        categories = categories.stream()
                .filter(a -> a.getPrice() > 100)
                .collect(Collectors.toList());
        System.out.println("Книги стоимостью больше 100 рублей:");
        for (Category book : categories) {
            System.out.println(book.getName() + ":" + book.getPrice());


        }

    }
}

