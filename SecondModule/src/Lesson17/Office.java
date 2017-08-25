package Lesson17;

import Lesson16.*;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Marina on 29.7.2017 г..
 */
public class Office {
    public static void main(String[] args) {

        ArrayList<Employee> employees=new ArrayList<>();
        Employee gencho=new Employee("Gencho");
        Employee kircho=new Employee("Kircho");
        Employee minka=new Employee("Minka");
        Employee totka=new Employee("Totka");
        employees.add(gencho);
        employees.add(kircho);
        employees.add(minka);
        employees.add(totka);

        AllWork allWork=new AllWork();
        Random random=new Random();
        for (int i = 1; i <= allWork.getTasks().length; i++) {
            int hoursNeeded=random.nextInt(10)+1;
            Task task=new Task("Task"+i,hoursNeeded);
            allWork.addTask(task);
        }

        /*for (Task t:allWork.getTasks()) {
            if(t==null){
                System.out.println("NULL");
            }else{
                System.out.println(t.getName());
                System.out.println(t.getWorkingHours());
            }

        }*/



        for (Employee emp: employees) {
            emp.setAllWork(allWork);
        }


        while(true){
            System.out.println("----------New day----------");
            for (Employee emp: employees) {
                emp.startWorkingDay();
            }

            for (Employee emp: employees) {
                emp.work();
            }

            if(isEveryoneDoneForToday(employees)){
                System.out.println("----------End Of The Day----------");
                break;
            }
        }
    }

    static boolean isEveryoneDoneForToday(ArrayList<Employee> employees) {
        for (Employee emp: employees) {
            if(!emp.isDoneForToday()){
                return false;
            }
        }
        return true;
    }
}
