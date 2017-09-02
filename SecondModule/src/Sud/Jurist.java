package Sud;

/**
 * Created by Marina on 2.9.2017 г..
 */
public abstract class Jurist {
    private String name;
    private JuristPositions position;
    private int experience; //in years;
    private int caseCount;

    public Jurist(String name, JuristPositions position, int experience, int caseCount) {
        this.name = name;
        this.position = position;
        this.experience = experience;
        this.caseCount = caseCount;
    }

     void askQuestion(){
         System.out.println(this.name+" asks a question.");
     }

     abstract JuristPositions getPosition();

    public  void increaseCaseCount(){
        this.caseCount++;
    }
}
