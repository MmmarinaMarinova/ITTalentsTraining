package Lesson13.Task01;

import java.util.function.Consumer;

/**
 * Created by Marina on 11.7.2017 г..
 */
public class ComputerDemo {
    public static void main(String[] args) {
        //creating new pc by default constructor:
        Computer pc=new Computer();
        pc.setYear(2015);
        pc.setHardDiskMemory(1000);
        pc.setFreeMemory(513);
        pc.setPrice(850.45);

        //creating new pc by second constructor:
        Computer computer=new Computer(2017,1025.99,1500,813);
        computer.useMemory(100);

        //creating new laptop by the third constructor:
        Computer laptop=new Computer(2017,2100.99,true, 1500,578,"Win10");

        System.out.println("Parameters of the personal computer: ");
        System.out.println("Year: "+pc.getYear()+" Operation system: "+pc.getOperationSystem()+
        " is it notebook: "+pc.isNotebook()+" hard disk memory: "+pc.getHardDiskMemory()+ " free memory: "+pc.getFreeMemory());

        System.out.println("Parameters of the computer: ");
        System.out.println("Year: "+computer.getYear()+" Operation system: "+computer.getOperationSystem()+
                " is it notebook: "+computer.isNotebook()+" hard disk memory: "+computer.getHardDiskMemory()+" free memory: "+computer.getFreeMemory());

        System.out.println("Parameters of the laptop: ");
        System.out.println("Year: "+laptop.getYear()+" Operation system: "+laptop.getOperationSystem()+
                " is it notebook: "+laptop.isNotebook()+" hard disk memory: "+laptop.getHardDiskMemory()+" free memory: "+laptop.getFreeMemory());

        int priceComparison=laptop.comparePrice(computer);
        if(priceComparison==0){
            System.out.println("The prices of the two computers are equal");
        }else if(priceComparison==1){
            System.out.println("The second computer is bigger");
        }else{
            System.out.println("The price of the first computer is bigger");
        }
    }
}
