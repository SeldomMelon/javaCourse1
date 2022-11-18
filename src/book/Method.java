package book;

//Contact - это класс с полями где конструкторы там, и сет гет
//Класс phoneBook - эт класс где создаются массив контактов и там мы ебашим методы на поиск и удаление
//А класс метод - это наш мейн, где мы расписываемся наши контакты на имя и телефон и
// там вызываем методы из класса phoneBook

public class Method {

    public static void main(String[] args) {
        Contact oleg = new Contact("Олег", "89998877611");
        Contact vasya = new Contact("Вася", "89998877622");
        Contact petya = new Contact("Петя", "89998877633");
        Contact bob = new Contact("Боб", "89998877644");

        PhoneBook phoneBook = new PhoneBook(oleg, vasya, petya, bob);







    }

}












