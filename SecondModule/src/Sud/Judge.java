package Sud;

/**
 * Created by Marina on 2.9.2017 г..
 */
public class Judge extends Jurist{
    public Judge(String name, int experience, int caseCount) {
        super(name, JuristPositions.JUDGE, experience < 5 ? 5:experience, caseCount);
    }

    @Override
    JuristPositions getPosition() {
        return JuristPositions.JUDGE;
    }
}
