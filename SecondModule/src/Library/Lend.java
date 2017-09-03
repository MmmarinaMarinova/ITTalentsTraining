package Library;

import java.time.LocalDate;

/**
 * Created by Marina on 3.9.2017 г..
 */
public class Lend {
    private LocalDate lendDate;
    private LocalDate returnDate;
    private boolean isReturned;

    public Lend() {
        this.lendDate=LocalDate.now();
        this.isReturned=false;
    }

    public boolean isReturned() {
        return this.isReturned;
    }

    public LocalDate getLendDate() {
        return this.lendDate;
    }

    public void setLendDate(LocalDate lendDate) {
        this.lendDate = lendDate;
    }

    public void setReturned(boolean returned) {
        this.isReturned= returned;
    }
}
