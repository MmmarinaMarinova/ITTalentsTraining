package Lesson16;

/**
 * Created by Marina on 19.7.2017 г..
 */
public class Student  extends Person{
    protected double score;

    public Student(String name, int age, boolean isMale, double score) {
        super(name, age, isMale);
        this.score = score;
    }

    //When we try to make a default constructor in Student class,
    //it just calls super() with parameters;
    //Otherwise it will just say that there is no default constructor
    //available in the package;
    public Student(String name, int age, boolean isMale) {
        super(name, age, isMale);
    }

    public String showStudentInfo(){
        return "Grade: "+this.score;
    }

    @Override
    public String toString(){
        System.out.println(super.toString());
        return showStudentInfo();
    }
}
