package org.javaguru.student_aleksey_taskin.lesson_3.level_3;

public class Book {
    private String title;
    private String nameAuthor;
    private String data;
    private BookChapter bookChapter;

    public Book(String title, String nameAuthor, String data, BookChapter bookChapter) {
        this.title = title;
        this.nameAuthor = nameAuthor;
        this.data = data;
        this.bookChapter = bookChapter;
    }

    public String getTitle() {
        return title;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public String getData() {
        return data;
    }

    public BookChapter getBookChapter() {
        return bookChapter;
    }
}
