package Sud;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Marina on 2.9.2017 г..
 */
public class Court {
    private String name;
    private String address;
    private HashSet<Jurist> jurists;
    private HashSet<Case> cases;

    public Court(String name, String address) {
        this.name = name;
        this.address = address;
        this.cases=new HashSet<>();
        this.jurists=new HashSet<>();
    }

    Prosecutor getRandomProsecutor(){
        for (Jurist jurist: this.jurists) {
            if(jurist.getPosition().equals(JuristPositions.PROSECUTOR)){
                return (Prosecutor)jurist;
            }
        }
        System.out.println("No prosecutor available!");
        return null;
    }

    Judge getRandomJudge(){
        for (Jurist jurist: this.jurists) {
            if(jurist.getPosition().equals(JuristPositions.JUDGE)){
                return (Judge)jurist;
            }
        }
        System.out.println("No judges available!");
        return null;
    }

    Jury getRandomJury(){
        for (Jurist jurist: this.jurists) {
            if(jurist.getPosition().equals(JuristPositions.JURY)){
                if(((Jury)jurist).isFree()){
                    ((Jury)jurist).setFree(false);
                }
                return (Jury)jurist;
            }
        }
        System.out.println("Waiting for jury!");
        return getRandomJury();
    }

    public void conductCase(Case case1){
        //case1.conduct();
    }

    public void addJurist(Jurist jurist) {
        this.jurists.add(jurist);
    }
}
