package lesson2;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        //Конкатенация строк(объединение)
        String str1 = "String1";
        String str2 = "String2";
        String str3 = "String3";
        str1 = str1 + str2; // первый вариант конкатенации через +
        str1 = str1 + " " + str2; //текст в ковычках
        System.out.println(str1);

        str2 = str2.concat(str3)
                .concat("Hello")
                .concat("STR"); //Каждый + или конкат - это создание новой строки в пуле строк
        System.out.println("Some Data");

        str3 = String.join(" :: ", str1, str2, str3); //в ковычках пишется разделитель
        System.out.println(str3);

        str1 = "Cтрока";
        for (int i = 0; i < 10; i++){
            str1 += "итерация " + i;
            //TODO: в циклах с большим количеством + concat не использовать
        }
        System.out.println(str1);

        //возможность изменять строки дают объекты
        //StringBuilder или StringBuffer
        //StringBuilder - работает быстрее, но нельзя использовать в потоках, это небезопасно
        //StringBuffer - работает медленно, но хорошо защищен в потоках

        str1 = "Строка";
        StringBuilder sb = new StringBuilder(); //первый вариант создания - хранит в себе строку
        //StringBuilder sb = new StringBuilder(str1);// второй варинат - ничего не хранит

        sb.append(str1).append("Hello"); //метод для добавления текста, НЕ СТРОКИ!!! НЕ ДОБЫВЛЯЕТ В ПУЛ СТРОК, не создает объекты строк

        for (int i = 0; i < 10 ; i++) {
            sb.append(" итерцаия ").append(i);
        }
        str1 = sb.toString(); //приводим к строке, чтобы с этим объектом можно было работать как со строкой
        System.out.println(str1);

        char[] charsArr = {'q', 'w', 'e'};
        String charStr = new String(charsArr);//создаем строчку из массива символов

        byte[] bytes = charStr.getBytes();//представляем строчку как последовательность byte
        System.out.println(Arrays.toString(bytes));//выведет строку байтов
        charStr = new String(bytes);//собрать из byte строку

        //методы работы со строками
        //сравнение
        str1 = "Java";
        str2 = "java";
        System.out.println(str1.equals(str2)); //сравниваем строки
        System.out.println(str1.equalsIgnoreCase(str2)); //сравниваем без учета регистра

        System.out.println(str1.compareTo(str2));//сранивает с учетом регистра, выводит число, если неверно
        System.out.println(str1.compareToIgnoreCase(str2));//сравнивает без учета регистра, выводит 0, если строки равны

        System.out.println(str1.startsWith("Ja"));
        System.out.println(str1.endsWith("A"));

        str1 = str1.toLowerCase();// этот метод не изменяет строчку, а заменяет, то есть предыдущая остается в памяти
        System.out.println(str1);
        str1 = str1.toUpperCase();// аналогично
        System.out.println(str1);

        str1 = "         Строка ";
        System.out.println(str1);
        System.out.println(str1.trim());//этод метод убирает пробельные символы в начале и в конце строки, промежуточные не убирает
        System.out.println(str1.length());//возвращает длину
        System.out.println(str1.trim().length());//возвращает длину с учетом метода trim, то есть с учетом забора пробелов из начала и конца строки

        str1 = "Java";
        System.out.println(str1.replace("a", "AA")); //заменяем символы в строке
        String newS = str1.replace("a", "AA"); //для перезаписи в новую строку newS на основании строки str1
        str1 = "Java Junior";
        String[] strings = str1.split("\\s");//перевод строки в массив строк
        System.out.println(Arrays.toString(strings));


    }
}