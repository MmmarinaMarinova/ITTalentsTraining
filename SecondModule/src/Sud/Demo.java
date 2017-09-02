package Sud;

import java.util.ArrayList;

/**
 * Created by Marina on 2.9.2017 г..
 */
public class Demo {
    public static void main(String[] args) {
        Court court=new Court("Sud Veliko Tarnovo","Veliko Tarnovo");
        ArrayList<Witness> witnesses=new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Judge judge=new Judge("Judge "+(i+1), 10, 500);
            court.addJurist(judge);
        }

        for (int i = 0; i < 50; i++) {
            Jury jury=new Jury("Jury "+(i+1),7, 35);
            court.addJurist(jury);
        }

        for (int i = 0; i < 10; i++) {
            Lawyer lawyer=new Lawyer("Lawyer "+(i+1), 4, 17);
            court.addJurist(lawyer);
        }

        for (int i = 0; i < 7; i++) {
            Prosecutor prosecutor=new Prosecutor("Prosecutor "+(i+1), 10, 48);
            court.addJurist(prosecutor);
        }

        Accuser accuser=new Accuser("Accuser 1", "Sofia", 43);
        Accuser accuser2=new Accuser("Accuser 2", "Sofia", 43);
        Accuser accuser3=new Accuser("Accuser 3", "Sofia", 43);
        Accuser accuser4=new Accuser("Accuser 4", "Sofia", 43);
        Accuser accuser5=new Accuser("Accuser 5", "Sofia", 43);

        Accused accused1=new Accused("Accused 1","Tarnovo", 34);
        Accused accused2=new Accused("Accused 2","Tarnovo", 34);
        Accused accused3=new Accused("Accused 3","Tarnovo", 34);
        Accused accused4=new Accused("Accused 4","Tarnovo", 34);
        Accused accused5=new Accused("Accused 5","Tarnovo", 34);


        for (int i = 0; i < 10; i++) {
            Witness witness=new Witness("Witness "+(i+1),"Veliko Tarnovo",37);
            witnesses.add(witness);
        }

        //CriminalCase criminalCase=new CriminalCase(court, accused3,)
    }
}
