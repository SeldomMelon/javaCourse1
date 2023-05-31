package lesson_17;

@Author(yearOfCreation = 2022)
public class Person {
    // field
    private String name;
    private int id;

    //constructor

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    //methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void sayHello() {
        System.out.println("Hello, I am " + name + " " + id);
    }
}
