package Lesson13.Task01;

/**
 * Created by Marina on 11.7.2017 г..
 */
public class Computer {

   int year;
   double price;
   boolean isNotebook;
   double hardDiskMemory; //GB
    double freeMemory;
    String operationSystem;

    public Computer() {
        this.isNotebook=false;
        this.operationSystem="Win XP";
    }

    public Computer(int year, double price, double hardDiskMemory, double freeMemory) {
        this();
        this.year = year;
        this.price = price;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
    }

    public Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory, String operationSystem) {
        this.year = year;
        this.price = price;
        this.isNotebook = isNotebook;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
        this.operationSystem = operationSystem;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if(price<0){
            System.out.println("Invalid price!");
            return;
        }
        this.price = price;
    }

    public boolean isNotebook() {
        return this.isNotebook;
    }

    public void setNotebook(boolean notebook) {
        isNotebook = notebook;
    }

    public double getHardDiskMemory() {
        return this.hardDiskMemory;
    }

    public void setHardDiskMemory(double hardDiskMemory) {
        if(hardDiskMemory<0){
            System.out.println("Invalid size of the hard disk memory!");
            return;
        }
        this.hardDiskMemory = hardDiskMemory;
    }

    public double getFreeMemory() {
        return this.freeMemory;
    }

    public void setFreeMemory(double freeMemory) {
        if(freeMemory>hardDiskMemory){
            System.out.println("The memory you want to free is too big!");
            return;
        }
        this.freeMemory = freeMemory;
    }

    public String getOperationSystem() {
        return this.operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    //redundant, because we now have getters and setters
    //void changeOperationSystem(String newOperationSystem){operationSystem=newOperationSystem;}

    void useMemory(int memory){
    if(memory>freeMemory){
        System.out.println("Not enough free memory!");
        return;
    }
    freeMemory-=memory;
}

    int comparePrice(Computer c){
        if(this.price==c.getPrice()){
            return 0;
        }else if(this.price>c.getPrice()){
            return -1;
        }else{
            return 1;
        }
    }
}
