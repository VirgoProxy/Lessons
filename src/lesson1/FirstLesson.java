package lesson1;

import java.util.Scanner;

public class FirstLesson
{
    //psvm
    public static void main(String[] args)
    {
        byte byteVar;
        byte byteVar1, byteVar2;
        byte byteVar3 = 35;
        byte byteVar4 = 20, byteVar5 = 17;
        byteVar = 10;
        short shortVar = 300;
        short shortVar1 = 200;
        int shortVar2 = shortVar + shortVar1;
        int intVar = 1000;
        int intVar1 = 2_000_000; //запись числа с использованием "_" только для удобства пользователя, машина воспринимает число как стандартное
        //int zeroDivision = intVar / 0; - Арифметическое Исключение, действие не выполнится
        long longVar = 30000000000L;

        float floatVar = 5.7f;
        float floatVar1 = floatVar / 0;
        double doubleVar = -3.12;
        double doubleVar1 = doubleVar / 0;
        // sout
        System.out.println(floatVar1); // infinity
        System.out.println(doubleVar1);// -infinity

        boolean isOpen = true;
        boolean isClosed = false;

        byte someByte = 10;
        int someInt = someByte; // автоматическое приведение типа byte в int

        // TODO:
        // Fixme:

        someInt = 100;
        someByte = (byte) someInt;// явное приведение типа

        int a = 10;
        a += 7; // a = a + 7;

        a = 12;
        int b = 7;
        int c = a / b;
        System.out.println(c);
        double c1 = (double) a / b; //используем приведение для дробного деления
        System.out.println(c1);
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int num = in.nextInt();
        System.out.printf("Вы ввели %d\n", num);
        //или же System.out.println(num);
        */
        /*a = 2;
        b = 3;
        c = (a < b) ? a + b : a - b;*/

        System.out.println(c);
        a = 5;
        c = (a % 2 == 0) ? a / 2 : a * 2;
        System.out.println(c);
    }
}
