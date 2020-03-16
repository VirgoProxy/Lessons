package ru.virgo.lesson6;
//библиотке:
//  можно добавлять по 1й ил по несколько сразу
//  можно взять книгу(указав автора)
//  домой/для чтения в библиотеке
public class Library {
    private String name = "Библиотека";
    private Book[] books = new Book[5];


    public String getName() {
        return name;
    }

    //добавление одной книги

    public void addBook(Book newBook){
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null){
                newBook.setInLibrary(true);
                books[i] = newBook;
                break;
            }
        }
    }

    //добавление нескольких книг

    public void addBook(Book ...newBooks){

    }
}
