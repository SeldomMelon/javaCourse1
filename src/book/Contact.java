package book;

public class Contact {
    //1. Поля
    private String name;
    private String phone;

    //2. Конструктор

    public Contact (String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    //3. Методы

    public String getName() {

        return name;
    }
    public void setName(String name) {

        this.name = name;
    }
    public String getPhone() {

        return phone;
    }
    public void setPhone(String phone) {

        this.phone = phone;
    }



}
