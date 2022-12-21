package lesson_13;

import java.util.Optional;
import java.util.Scanner;

public class optional {
    public static void main(String[] args) {
//        String login = null;
//        if(login!=null) {
//            System.out.println(login.length());
//        }
//        Scanner scanner = new Scanner(System.in);
//        login = scanner.nextLine();
//
//        login = null;

        Optional<String> opt = Optional.ofNullable("Hello World");
        opt.ifPresent(login -> System.out.println(login.length()));

        String nullName = null;
        String name = Optional.ofNullable(nullName).orElse("Пользователь");
        System.out.println("Привет, " + name);

        String name1 = Optional.ofNullable(nullName).orElseThrow(IllegalAccessError::new);
    }
}
