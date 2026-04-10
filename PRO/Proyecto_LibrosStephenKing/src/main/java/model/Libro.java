package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serial;
import java.io.Serializable;

public class Libro implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private int id;

    @JsonProperty("Year")
    private int year;

    @JsonProperty("Pages")
    private int pages;

    @JsonProperty("Title")
    private String title;

    @JsonProperty("Publisher")
    private String publisher;

    @JsonProperty("ISBN")
    private String isbn;

    @Override
    public String toString() {
        return "Libro{" + "id=" + id + ", year=" + year + ", pages=" + pages + ", title='" + title + '\'' + ", publisher='" + publisher + '\'' + ", isbn='" + isbn + '\'' + '}';
    }

    public Libro() {
    }

    public Libro(int id, int year, String title, String publisher, String isbn, int pages) {
        this.id = id;
        this.year = year;
        this.title = title;
        this.publisher = publisher;
        this.isbn = isbn;
        this.pages = pages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
