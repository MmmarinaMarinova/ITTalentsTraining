package Sud;

/**
 * Created by Marina on 2.9.2017 г..
 */
public class Prosecutor extends Jurist implements IAccuser{
    public Prosecutor(String name, int experience, int caseCount) {
        super(name, JuristPositions.PROSECUTOR, experience<10? 10: experience, caseCount);
    }

    @Override
    JuristPositions getPosition() {
        return JuristPositions.PROSECUTOR;
    }
}
