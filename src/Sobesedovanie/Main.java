package Sobesedovanie;

/** Есть список товаров, относящихся к категории “Книги”. У каждой книги есть id, наименование, цена.
 * Необходимо отфильтровать книги с ценой > 100. Использовать Stream API
 * На выходе программы должны быть распечатаны книги в формате
 * <Наименование> : <Стоимость>
 * Использовать Stream API
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Война и Мир", 40));
        books.add(new Book(2, "Отцы и Дети", 790));
        books.add(new Book(3, "Портрет Дориана Грея", 60));
        books.add(new Book(4, "Финансист", 248));
        books.add(new Book(5, "Маленький принц", 30));
        books.add(new Book(6, "Преступление и наказание", 399));

        books = books.stream()
                .filter(a -> a.getPrice() > 100)
                .collect(Collectors.toList());
        System.out.println("Книги стоимостью больше 100 рублей:");
        for (Book b : books) {
            System.out.println(b.getName() + ":" + b.getPrice());
        }
    }
}
