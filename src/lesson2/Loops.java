package lesson2;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
/*        while (true)
        {
            System.out.println("Введите целое число");
            int num = in.nextInt();
            if(num == 0)
            {
                System.out.println("Выход из программы");
                break;
            }
            System.out.println(num * num);
        }*/
        int programNum = (int) (Math.random() * 6) + 1;
        while (true) {
            System.out.println("Введите число от 1 до 6 или 0 для выхода из программы");
            int num = in.nextInt();
            if (num == 0) {
                System.out.println("Выход из программы");
                break;
            } else if (num == programNum) {
                System.out.println("Вы угадали");
                break;
            } else if (num < programNum) {
                System.out.println("Загаданое число больше");
            } else {
                System.out.println("Загаданное число меньше");
            }
        }
    }
}
