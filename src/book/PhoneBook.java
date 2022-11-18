package book;

//Contact - это класс с полями где конструкторы Сеттеры и Геттеры
//Класс phoneBook - эт класс где создаются массив контактов и там мы пишем методы на поиск и удаление
//А класс метод - это наш мейн, где мы расписываемся наши контакты на имя и телефон,
//и там вызываем методы из класса phoneBook

public class PhoneBook {
    private Contact [] contacts;

    public PhoneBook (Contact ... contacts) {

        this.contacts = contacts;
    }



    public PhoneBook () {

        this.contacts = new Contact[4];
    }

    public Contact search (String name) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts [i].getName().equals(name)){
                return contacts[i];

            }
        }
        return null;
    }

    public void delete (String name) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].getName().equals(name)) {
                contacts[i] = null;
                break;
            }
        }

    }

    public void reName (String original, String rename1) {
        for (int i = 0; i < contacts.length; i++) {
            if(contacts[i] != null && contacts [i].getName().equalsIgnoreCase(original)) {
                contacts[i].setName(rename1);
                break;
            }
        }
    }




}
