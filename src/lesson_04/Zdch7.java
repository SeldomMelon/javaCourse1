package lesson_04;
//1. Создать массив на 10 строк.
//2. Ввести с клавиатуры 8 строк и сохранить их в массив.
//3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.

import java.util.Scanner;

public class Zdch7 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner array1 = new Scanner(System.in);

        for(int i=0; i<8; i++){
            array[i] = array1.nextInt();
        }
        for(int i=9; i >= 0; i--){
            System.out.println(array[i]);

        }
    }

}


