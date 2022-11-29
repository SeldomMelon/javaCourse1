package lesson_05;
//Ввести 5 строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину

import java.util.Scanner;

public class zdch2 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     String [] line = new String[5];

     int minL = Integer.MAX_VALUE;
     int minI = 0;
     int maxL = 0;
     int maxI = 0;

        for (int i = 0; i < line.length; i++) {
            line[i] = scanner.nextLine();
            if (line[i].length() < minL){
                minL = line[i].length();
                minI=i;
            }
        }
        for (int i = 0; i < line.length; i++) {
            if (line[i].length() > maxL){
                maxL = line[i].length();
                maxI=i;
            }
        }
        System.out.println(line[minI] + " " + minL);
        System.out.println(line[maxI]+ " " + maxL);
    }

}





