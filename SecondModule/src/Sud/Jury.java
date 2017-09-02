package Sud;

/**
 * Created by Marina on 2.9.2017 г..
 */
public class Jury extends Jurist {
    private boolean isFree=true;
    public Jury(String name, int experience, int caseCount) {
        super(name, JuristPositions.JURY, experience, caseCount);
    }

    @Override
    JuristPositions getPosition() {
        return JuristPositions.JURY;
    }

    public boolean isFree() {
        return this.isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }
}
