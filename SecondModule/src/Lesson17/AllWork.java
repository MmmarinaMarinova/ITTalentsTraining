package Lesson17;

/**
 * Created by Marina on 29.7.2017 г..
 */
public class AllWork {
    Task[] tasks=new Task[10];
    private int freePlacesForTasks;
    private int currentUnassignedTask;

    public Task[] getTasks() {
        return this.tasks;
    }

    public AllWork() {
        this.tasks=new Task[10];
        this.freePlacesForTasks=10;
        this.currentUnassignedTask=0;
    }

    public void addTask(Task task){
        if(this.freePlacesForTasks==0){
            System.out.println("There is not enough space for the task! Leave it for tomorrow!");
            return;
        }
        for (int i = 0; i < tasks.length; i++) {
            if(this.tasks[i]==null){
                this.tasks[i]=task;
                this.freePlacesForTasks--;
                break;
            }
        }
    }

    public Task getNextTask(){
        Task current=this.tasks[this.currentUnassignedTask];
        for (int i=0; i<tasks.length;i++) {
            if(!this.tasks[i].isCurrentlyTaken()){
                tasks[i].setCurrentlyTaken(true);
                this.currentUnassignedTask=i;
            }else{
                this.currentUnassignedTask=0;
            }
        }
            return current;
    }

    private boolean isAllWorkDone() {
        for (int i = 0; i < this.tasks.length  ; i++) {
            if(this.tasks[i].getWorkingHours()!=0 ){
                System.out.println("Not all the work for today is done!");
                return false;
            }
        }
        System.out.println("All the work is done! Good job!");
        return true;
    }


}
