package Sud;



/**
 * Created by Marina on 2.9.2017 г..
 */
public class CriminalCase extends  Case{

    public CriminalCase(Court court, Accused accused, Prosecutor prosecutor) {
        super(court, accused);
        this.setAccuser(prosecutor);
    }

    @Override
    protected void generateJury() {
        for (int i = 0; i < 13; i++) {
            this.addJury(this.court.getRandomJury());
        }
    }


    @Override
    protected CaseType getType() {
        return CaseType.CRIMINAL_CASE;
    }

    @Override
    public void conduct() {
        for (Jury jury:this.jury) {
            jury.increaseCaseCount();
        }

        System.out.println("Lawyers asking accused people");
        for (Lawyer lawyer: ((Accuser)this.accuser).lawyers) {
            for (int i = 0; i < 5; i++) {
                lawyer.askQuestion();
            }
        }
        System.out.println("Lawyers asking accusers");
        for (Lawyer lawyer: (this.accused).lawyers) {
            for (int i = 0; i < 3; i++) {
                lawyer.askQuestion();
            }
        }



    }
}
