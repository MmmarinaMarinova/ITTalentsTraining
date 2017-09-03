package Library;

import java.time.LocalDate;
import java.time.Period;

/**
 * Created by Marina on 3.9.2017 г..
 */
public class Magazine extends ReadingMaterial {
    private Category category;
    private int editionNumber;

    public Magazine(String name, LocalDate printDate, String publisher, Category category, int editionNumber) {
        super(name, printDate, publisher, 0, 0);
        this.category = category;
        this.editionNumber = editionNumber;
    }

    @Override
    protected void lendReadingForHome(Client client) {
        System.out.println("Magazines cannot be borrowed!");
    }

    @Override
    protected ReadingMaterialType getReadingMaterialType() {
        return ReadingMaterialType.MAGAZINE;
    }

    public Category getCategory() {
        return this.category;
    }

    public int getEditionNumber() {
        return this.editionNumber;
    }
}
