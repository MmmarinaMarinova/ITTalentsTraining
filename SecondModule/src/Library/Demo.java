package Library;

import java.time.LocalDate;

/**
 * Created by Marina on 3.9.2017 г..
 */
public class Demo {
    public static void main(String[] args) {
        Library library=new Library("Private library");
        Book book1=new Book("18% sivo", LocalDate.of(2010,5,12), "Ciela", "Zahari Karabashliev", Genre.LOVE);
        Book book2=new Book("Momicheto ot vlaka", LocalDate.of(2015,8,21), "Ciela", "John Doe", Genre.THRILLER);
        Book book3=new Book("Millenium", LocalDate.of(2005,10,4), "Ciela", "Stieg Larson", Genre.THRILLER);
        library.addReading(book1);
        library.addReading(book2);
        library.addReading(book3);


        Magazine magazine1=new Magazine("Spisanie 8",LocalDate.of(2017,5,12), "some publisher",Category.SCIENTIFIC, 25 );
        Magazine magazine2=new Magazine("Manager",LocalDate.of(2017,8,1), "some publisher",Category.FINANCIAL, 10 );
        Magazine magazine3=new Magazine("Fashion",LocalDate.of(2017,8,30), "some publisher",Category.FASHION, 72 );
        library.addReading(magazine1);
        library.addReading(magazine2);
        library.addReading(magazine3);

        Textbook textbook1=new Textbook("Java Textbook ",LocalDate.of(2012,1,12), "Textbook publisher", Topic.PROGRAMMING );
        Textbook textbook2=new Textbook("Dinosaurs Textbook ",LocalDate.of(2010,12,6), "Textbook publisher", Topic.HISTORICAL );
        Textbook textbook3=new Textbook("Anatomy Textbook ",LocalDate.of(2015,6,24), "Textbook publisher", Topic.MEDICAL );
        library.addReading(textbook1);
        library.addReading(textbook2);
        library.addReading(textbook3);

        library.printAvailability();
        library.printCatalogue();

        Client client=new Client("Mincho", 10);
        client.askForReadingMaterialForHome(library, textbook1);
        client.askForReadingMaterialForHome(library, magazine1);
    }
}
