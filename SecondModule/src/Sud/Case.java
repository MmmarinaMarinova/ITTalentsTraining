package Sud;

import java.util.HashSet;
import java.util.Random;

/**
 * Created by Marina on 2.9.2017 г..
 */
public abstract class Case {
    protected Court court;
    private CaseType caseType;
    protected Judge judge;
    protected HashSet<Jury> jury;
    protected IAccuser accuser;
    protected Accused accused;
    private HashSet<Witness> witnesses;


    public Case(Court court,Accused accused) {
        this.court=court;
        this.caseType = getType();
        generateJudge();
        this.accused = accused;
        this.jury = new HashSet<>();
        generateJury();
        this.witnesses = new HashSet<>();
        generateWitnesses();
    }

    protected void generateJudge(){
        setJudge(this.court.getRandomJudge());
    }

    protected void generateWitnesses(){
        for (int i = 0; i < 10; i++) {
            Witness witness=new Witness("Witness "+(i+1),"Adress", new Random().nextInt(60)+18);
            this.witnesses.add(witness);
        }
    }
    
    public void addJury(Jury jury){
        this.jury.add(jury);
    }

    protected abstract  void generateJury();
    
    protected abstract CaseType getType();

    public void setAccused(Accused accused) {
        this.accused = accused;
    }

    public void setAccuser(IAccuser accuser) {
        this.accuser = accuser;
    }

    public void setJudge(Judge judge) {
        this.judge = judge;
    }

    //public abstract void conduct();


}
