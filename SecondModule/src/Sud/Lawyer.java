package Sud;

/**
 * Created by Marina on 2.9.2017 г..
 */
public class Lawyer extends Jurist {
    public Lawyer(String name, int experience, int caseCount) {
        super(name, JuristPositions.LAYWER, experience, caseCount<10 ? 10: caseCount);
    }

    @Override
    JuristPositions getPosition() {
        return JuristPositions.LAYWER;
    }
}
