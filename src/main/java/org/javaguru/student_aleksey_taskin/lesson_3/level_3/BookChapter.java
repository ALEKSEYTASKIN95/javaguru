package org.javaguru.student_aleksey_taskin.lesson_3.level_3;

public class BookChapter {
    private String nameOfChapter;
    private String textChapter;

    public BookChapter(String nameOfChapter, String textChapter) {
        this.nameOfChapter = nameOfChapter;
        this.textChapter = textChapter;
    }

    public String getNameOfChapter() {
        return nameOfChapter;
    }

    public String getTextChapter() {
        return textChapter;
    }
}
