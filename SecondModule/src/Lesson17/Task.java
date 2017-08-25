package Lesson17;

/**
 * Created by Marina on 29.7.2017 г..
 */
public class Task {
    private String name;
    private int workingHours;
    private boolean isCurrentlyTaken;

    public boolean isCurrentlyTaken() {
        return this.isCurrentlyTaken;
    }

    public void setCurrentlyTaken(boolean currentlyTaken) {
        isCurrentlyTaken = currentlyTaken;
    }

    public Task(String name, int workingHours) {
        this.name = name;
        validateHours(workingHours);
    }

    private void validateHours(int workingHours) {
        if(workingHours<=0){
            this.workingHours=1;
        }
        this.workingHours = workingHours;
    }

    public String getName() {
        return this.name;
    }

    public int getWorkingHours() {
        return this.workingHours;
    }

    public void setWorkingHours(int workingHours) {
        if(workingHours<0){
            this.workingHours=0;
        }
        this.workingHours=workingHours;
    }
}
