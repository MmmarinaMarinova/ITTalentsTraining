package Lesson13.Task03;

/**
 * Created by Marina on 13.7.2017 г..
 */
public class StudentGroup {
    private String groupSubject;
    private Student[] students;
    private int freePlaces;

    public StudentGroup() {
        this.students=new Student[5];
        this.freePlaces=5;
    }

    public StudentGroup(String groupSubject) {
        this();
        this.groupSubject = groupSubject;
    }


    public String getGroupSubject() {
        return this.groupSubject;
    }

    public void setGroupSubject(String groupSubject) {
        this.groupSubject = groupSubject;
    }

    public Student[] getStudents() {
        return this.students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getFreePlaces() {
        return this.freePlaces;
    }

    public void setFreePlaces(int freePlaces) {
        this.freePlaces = freePlaces;
    }


    void addStudent(Student s){
        if(!this.groupSubject.equals(s.getSubject())){
            System.out.println("The student subject is not the same as the group one!");
            return;
        }
        if(this.freePlaces<=0){
            System.out.println("There are not enough spaces!");
            return;
        }

        for (int i = 0; i < students.length; i++) {
            if(students[i]==null){
                students[i]=s;
                this.freePlaces--;
                System.out.println("The student has been added!");
                break;
            }
        }
    }

    void emptyGroup(){
        this.freePlaces=5;
        this.students=new Student[5];
        System.out.println("The group was emptied!");
    }

    String theBestStudent(){
        if(students[0]==null){
            return "The group is empty";
        }
        double maxGrade=students[0].getGrade();
        int position=0;
        for (int i = 0; i <students.length ; i++) {
            if(students[i]==null){
                break;
            }
            if(students[i].getGrade()>maxGrade){
                maxGrade=students[i].getGrade();
                position=i;
            }
        }
        return students[position].getName();
    }

    void printStudents(){
        if(students[0]==null){
            System.out.println("The group is empty!");
            return;
        }
        for (int i = 0; i < students.length; i++) {
            if(students[i]==null){
                students[i].printStudent();
            }
        }
    }
}
