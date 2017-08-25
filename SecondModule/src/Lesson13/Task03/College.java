package Lesson13.Task03;

/**
 * Created by Marina on 13.7.2017 г..
 */
public class College {
    public static void main(String[] args) {
        Student mincho=new Student("Mincho", "software engineering", 22);
        Student kalin=new Student("Kalin", "software engineering", 5.13, 4, 25,false, 522.55);
        Student petq=new Student("Petya", "software engineering", 5.75, 3, 23, false, 1025.75);
        Student maria=new Student("Maria", "software engineering",32);
        StudentGroup softwareEngineeringGroup=new StudentGroup("software engineering");
        softwareEngineeringGroup.addStudent(mincho);
        softwareEngineeringGroup.addStudent(petq);
        softwareEngineeringGroup.addStudent(kalin);
        softwareEngineeringGroup.addStudent(maria);
        //softwareEngineeringGroup.printStudents();

        System.out.println(maria.getName()+" applied for scholarship");
        System.out.println(maria.getName()+"'s scholarship: "+maria.receiveScholarship(3.20,530.45));

        String bestStudent=softwareEngineeringGroup.theBestStudent();
        System.out.println("The best student in the group is: "+bestStudent);

        kalin.upYear();
        mincho.upYear();

        softwareEngineeringGroup.emptyGroup();
        softwareEngineeringGroup.printStudents();
    }
}
