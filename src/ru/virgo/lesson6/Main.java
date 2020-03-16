package ru.virgo.lesson6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //имя класса формируется из имени пакета, потом имя лкасса для данного класса lesson6.Lesson6
        //для использования другого класса используется import."имя класса"
        //пакет именуется имя компании наоборот ru(com, org).имякомпании.имяпакета
        //для использования используем полнгое имя new Lesson6.Lesson6 если у классов одинаковое имя

        //классы
        //для создания объектов необходимо создать класс и перечислить его характеристики и методы
        //в одном классе мы должны описывать только те свойства, которые присуще объекты и касаются пользователя


        //книги:

        Author author1 = new Author();
        //доступ к свойству
//        author1.name = "Брюс";
//        System.out.println(author1.name);
        //вызов метода
        author1.setName("Брюс");
        author1.setSurname("Эккель");
        System.out.println(author1.getName());

        Author author2 = new Author();
        //доступ к свойству
//        author2.name = "Роберт";
//        System.out.println(author2.name);
        //вызов метода
        author2.setName("Роберт");
        author2.setSurname("Мартин");
        String name = author2.getName();
        System.out.println(name);
        System.out.println(author2);

        Book book1 = new Book("Философия Java");
        //значения по дефолту для:
        //ссылочные типа - null
        //целые числа - 0
        //булевые значения - false
        //числа с плавающей точкой - 0.0
        System.out.println(book1);
        book1.setPageCount(1350);
        book1.setAuthor(author1);
        book1.setForHome(true);
        System.out.println(book1);

        Book book2 = new Book("Чистый код", 500);
        System.out.println(book2);//ЕСЛИ В КЛАССЕ ОПИСАН ХОТЯ БЫ ОДИН КОНСТРУКТОР С ПАРАМЕТРАМИ
        // то конструктор без параметров, т.е. по умолчанию, будет недоступен
        book2.setAuthor(author2);
        System.out.println(book2);

        String book1AuthorName = book1.getAuthor().getName();

        Book[] books = {book1, book2};
        // фамилия автора для каждой книги
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getAuthor().getSurname());
        }
        for (Book book: books) {
            System.out.println(book.getAuthor().getSurname());
        }
    }
}
