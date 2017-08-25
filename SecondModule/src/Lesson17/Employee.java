package Lesson17;

import java.util.ArrayList;

/**
 * Created by Marina on 29.7.2017 г..
 */
public class Employee {
    private String name;
    private Task currentTask;
    private int hoursLeft;
    private AllWork allWork;
    private boolean isDoneForToday;

    public boolean isDoneForToday() {
        return this.isDoneForToday;
    }

    public void setDoneForToday(boolean doneForToday) {
        isDoneForToday = doneForToday;
    }

    public AllWork getAllWork() {
        return this.allWork;
    }

    public void setAllWork(AllWork allWork) {
        this.allWork = allWork;
    }

    public Employee(String name) {
        if(name==null){
            this.name="Employee";
        }
        this.name = name;
        this.hoursLeft=8;
        isDoneForToday=false;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if(name.length()==0){
            this.name="Employee";
        }
        this.name = name;
    }

    public Task getCurrentTask() {
        return this.currentTask;
    }

    public void setCurrentTask(Task currentTask) {
        this.currentTask = currentTask;
    }

    public int getHoursLeft() {
        return this.hoursLeft;
    }

    public void setHoursLeft(int hoursLeft) {
        if(hoursLeft<0){
            this.hoursLeft=0;
        }
        this.hoursLeft = hoursLeft;
    }

    public void startWorkingDay(){
        this.hoursLeft=8;
        this.isDoneForToday=false;
        System.out.println(this.name+" just started the working day!");
    }

     void work(){
        if(this.currentTask==null){
            this.currentTask=this.allWork.getNextTask();
        }
        System.out.println(this.name+" just started working on task: "+this.currentTask.getName());
        if(this.hoursLeft>this.currentTask.getWorkingHours()){
            this.hoursLeft=this.hoursLeft-this.currentTask.getWorkingHours();
            this.currentTask.setWorkingHours(0);
        }else if(this.hoursLeft<this.currentTask.getWorkingHours()){
            this.currentTask.setWorkingHours(this.currentTask.getWorkingHours()-this.hoursLeft);
            this.hoursLeft=0;
        }else {
            this.currentTask.setWorkingHours(0);
            this.hoursLeft=0;
        }
        showReport();
        if(this.hoursLeft>0){
            allWork.getNextTask();
        }else{
            this.isDoneForToday=true;
        }
    }

    private void showReport() {
        System.out.println("********************************");
        StringBuilder print=new StringBuilder();
        print.append("Name of the employee: "+this.name+"\n");
        print.append("Name of the task: "+this.currentTask.getName()+"\n");
        print.append("Left hours of the day: "+this.hoursLeft+"\n");
        print.append("Hours left for the task to be done: "+this.currentTask.getWorkingHours());
        System.out.println(print.toString());
        System.out.println("********************************");
    }
}
