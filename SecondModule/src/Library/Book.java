package Library;

import java.time.LocalDate;
import java.time.Period;

/**
 * Created by Marina on 3.9.2017 г..
 */
public class Book extends ReadingMaterial {
        private String author;
        private Genre genre;

    public Book(String name, LocalDate printDate, String publisher, String author, Genre genre) {
        super(name, printDate, publisher,30, 2.00);
        this.author = author;
        this.genre = genre;
    }

    @Override
    protected ReadingMaterialType getReadingMaterialType() {
        return ReadingMaterialType.BOOK;
    }

    public Genre getGenre() {
        return this.genre;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Book{" +
                "author='" + author + '\'' +
                ", genre=" + genre +
                '}';
    }
}
