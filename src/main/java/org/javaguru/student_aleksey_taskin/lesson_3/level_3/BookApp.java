package org.javaguru.student_aleksey_taskin.lesson_3.level_3;

public class BookApp {

    public static void main(String[] args) {
        BookChapter bookChapter1 = new BookChapter("HelloWorld", "HelloHello");
        BookChapter bookChapter2 = new BookChapter("Huyita", "Hohohohoho");

        Book book1 = new Book("Voina", "Tolstyi", "1990", bookChapter1);
        Book book2 = new Book("Vodka", "Esisie", "2001", bookChapter2);

        System.out.println("название книги " + book1.getTitle());
        System.out.println("автор книги " + book1.getNameAuthor());
        System.out.println("год книги " + book1.getData());
        System.out.println("название главы " + book1.getBookChapter().getNameOfChapter());
        System.out.println("текст главы " + book1.getBookChapter().getTextChapter());

        System.out.println();

        System.out.println("название книги " + book2.getTitle());
        System.out.println("автор книги " + book2.getNameAuthor());
        System.out.println("год книги " + book2.getData());
        System.out.println("название главы " + book2.getBookChapter().getNameOfChapter());
        System.out.println("текст главы " + book2.getBookChapter().getTextChapter());
    }
}
