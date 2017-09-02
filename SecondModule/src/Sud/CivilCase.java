package Sud;

/**
 * Created by Marina on 2.9.2017 г..
 */
public class CivilCase extends Case {
    public CivilCase(Court court, Accused accused, Accuser citizen) {
        super(court, accused);
        this.setAccuser(citizen);
    }

    @Override
    protected void generateJury() {
        for (int i = 0; i < 3; i++) {
            this.addJury(this.court.getRandomJury());
        }
    }


    @Override
    protected CaseType getType() {
        return CaseType.CIVIL_CASE;
    }


}
