package lesson2;

import java.util.Arrays;

public class ArraysExamples {
    public static void main(String[] args) {
        int [] someArr; // первый вариант - предпочтительный
        int someArr1[];//второй вариант ( С - style )
        someArr = new int[7];
        int[] someArr2 = {27,16,8,19};
        int[] cloneArr = someArr2.clone();  //для копирования переменных ссылочного типа необходимо использовать .clone;
        someArr2 = new int[]{23,1,-10,5};
        someArr = new int [15];

        System.arraycopy(someArr2, 1, someArr, 3, 2);//srcPos - элемент массива, с которого начинаем копирование
        //.destPos: позиция элемента в массиве, в которую начинаем записывать массив, length - количесвто элементов
        //arraycopy изменяет один массив на основе другого
        //System.out.println(Arrays.toString(someArr));

        int[] copyArr = Arrays.copyOf(someArr2, 10);
        System.out.println(Arrays.toString(copyArr));

        //сравнение массивов
        someArr = new int[]{12, -10, 123, 6};
        someArr2 = new int[]{27, 16, 8, 19};
        System.out.println(Arrays.equals(someArr, someArr2));//equals - сравнение(результат true или false)
        //someArr == someArr2 - неверно;
        // someArr.equals(someArr2) - тоже неверно;
        int[] resultArr = new int[4];//внутрь массива(где написано "4") можно вписать любое выражение для выражения его длинны, главное объявить
        for (int i = 0; i < someArr.length; i++) {
            resultArr[i] = someArr[i] + someArr2[i];
        }
        System.out.println(Arrays.toString(resultArr));
        //сортировка
        someArr = new int[]{27,11,8,19};
        Arrays.sort(someArr);// - это метод для сортировки массива, порлезен для больших массивов из-за скорости сортировки
        System.out.println(Arrays.toString(someArr));
        // Arrays.sort(arr, 1, 5) - сортирует условный массив в диапозоне о элемента с индексом 1 до элемента с индексом 5
        // Алгоритм быстрой сортировки, сложность 0(n log n)

        // бинарный поиск. бинарный поиск сложность 0(log n)
        someArr2 = new int[]{27,16,8,19};
        Arrays.sort(someArr2);
        System.out.println(Arrays.binarySearch(someArr2, 16));//ищем по значению переменной в массиве, найдет и скажет номер позиции
        System.out.println(Arrays.binarySearch(someArr2, 15));//не найдет, но скажет, где он мог бы быть со знаком "-"
        // многомерные массивы
        int[][] newArr = new int[3][4];
        System.out.println(Arrays.deepToString(newArr)); // deepToString необходим для многомерных массивов
        int[][] newArr2 = {{1, 2, 3},{5, 4}, {8}};
        System.out.println(Arrays.deepToString(newArr2));
        System.out.println(newArr2[0][2]); //3 (нулевой массив второй элемент)
        System.out.println(newArr2[1][1]); //5 (массив под индексом 1 элемент с индексом 1// )
        for(int j = 0; j < newArr2.length; j++){
            //newArr2[j] *= newArr2[j]; - ориентируемся по индексу массива
            for(int k = 0; k < newArr2[j].length; k++){
                newArr2[j][k] *= newArr2[j][k]; // выполнение действия
            }
        }
        System.out.println(Arrays.deepToString(newArr2));
    }
}
