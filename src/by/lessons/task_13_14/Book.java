package by.lessons.task_13_14;

import java.util.Objects;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        Book book = (Book) o;
        if (title.equals(book.getTitle())) {
            return true;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return author.hashCode() + title.hashCode();
    }

    @Override
    public String toString() {
        return "Название = '" + title + '\'' +
                ", автор = '" + author + '\'';
    }


}
