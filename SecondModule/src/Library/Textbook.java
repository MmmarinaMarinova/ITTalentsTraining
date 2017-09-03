package Library;

import java.time.LocalDate;
import java.time.Period;

/**
 * Created by Marina on 3.9.2017 г..
 */
public class Textbook extends ReadingMaterial {
    private Topic topic;

    public Textbook(String name, LocalDate printDate, String publisher, Topic topic) {
        super(name, printDate, publisher, 15, 3.00);
        this.topic = topic;
    }


    @Override
    protected ReadingMaterialType getReadingMaterialType() {
        return ReadingMaterialType.TEXTBOOK;
    }

    public Topic getTopic() {
        return this.topic;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Textbook{" +
                "topic=" + topic +
                '}';
    }
}
