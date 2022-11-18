package lesson_04;

import java.util.Scanner;

//Вводить с клавиатуры числа.
//Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
//-1 должно учитываться в сумме.
//Подсказка: один из вариантов решения этой задачи, использовать конструкцию:
//while (true) {
//int number = считываем число;
//if (проверяем, что number -1)
//break;
//}
public class zdch4 {
    public static void main(String[] args) {
        System.out.println("Введидте число: ");
        Scanner scanner = new Scanner(System.in);

        int sum = scanner.nextInt();

        while (true) {
            int a = scanner.nextInt();
            sum = sum + a;
            if (a == -1)
                break;
        }
        System.out.println(sum);
    }
}










