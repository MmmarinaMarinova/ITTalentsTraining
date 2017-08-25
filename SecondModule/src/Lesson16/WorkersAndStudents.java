package Lesson16;

/**
 * Created by Marina on 19.7.2017 г..
 */
public class WorkersAndStudents {
    public static void main(String[] args) {
        Person[] people=new Person[10];
        Person kuncho=new Person("Kuncho", 21, true);
        Person kichka=new Person("Kichka", 25, false);
        Student ivancho=new Student("Ivancho", 17, true, 4.57);
        Student mariika=new Student("Mariika", 18, false, 5.65);
        Employee gancho=new Employee("Gancho", 32, true, 35);
        Employee minka=new Employee("Minka", 17, false, 32);

        people[0]=kuncho;
        people[1]=kichka;
        people[2]=ivancho;
        people[3]=mariika;
        people[4]=gancho;
        people[5]=minka;

        for (int i = 0; i < people.length; i++) {
            if(people[i]==null){
                break;
            }
            System.out.println(people[i].toString());
            System.out.println("****************************");
        }

        for (int i = 0; i < people.length; i++) {
            if(people[i]==null){
                break;
            }
            if(people[i] instanceof Employee){
                Employee emp=(Employee)people[i];
                double overtimePayment=emp.calculateOvertime(2);
                System.out.println(emp.name+" has overtime payment = "+overtimePayment);
            }
        }
    }
}
