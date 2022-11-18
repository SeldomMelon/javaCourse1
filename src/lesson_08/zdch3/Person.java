package lesson_08.zdch3;

public class Person {
    String fullName;
    int age;

    public void talk() {
        System.out.println("Я " + fullName + " мне " + age + " лет");
    }
    public void move() {
        System.out.println("Я делаю домашнее задание по JAVA");
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public Person () {
    }
}

