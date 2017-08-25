package Lesson16;

/**
 * Created by Marina on 19.7.2017 г..
 */
public class Employee extends Person{
    protected double daySalary;

    public Employee(String name, int age, boolean isMale, double daySalary) {
        super(name, age, isMale);
        this.daySalary = daySalary;
    }

    public double calculateOvertime(double hours){
        if(this.age<18){
            System.out.println(this.name +" is too young to get money for overtime work!");
            return 0;
        }
        return this.daySalary*hours*1.5;
    }

    @Override
    public String toString(){
        System.out.println(super.toString());
        return showEmployeeInfo();
    }

     String showEmployeeInfo(){
         return "Daily wage: "+this.daySalary;
    }
}
