package Lesson13.MortalCombat;

/**
 * Created by Marina on 11.7.2017 г..
 */
public class MortalCombat {
    public static void main(String[] args) {
        Fighter kuncho=new Fighter("Kuncho", 150, 10);
        Fighter stamat=new Fighter("Stamat", 150, 10);
        kuncho.setEnemy(stamat);
        stamat.setEnemy(kuncho);

        while(true){
            if(!kuncho.isDead()){
                kuncho.hit();
            }else{
                break;
            }
            if(!stamat.isDead()){
                stamat.hit();
            }else{
                break;
            }
        }
    }
}
