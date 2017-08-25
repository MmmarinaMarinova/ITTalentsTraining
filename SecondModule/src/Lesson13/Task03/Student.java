package Lesson13.Task03;

/**
 * Created by Marina on 13.7.2017 г..
 */
public class Student {
    private String name;
    private String subject;
    private double grade;
    private int yearInCollege;
    private int age;
    private boolean isDegree;
    private double money;

    public Student() {
        this.grade=4.0;
        this.yearInCollege=1;
        this.isDegree=false;
        this.money=0;
    }

    public Student(String name, String subject, int age) {
        this();
        this.name = name;
        this.subject = subject;
        this.age = age;
    }

    public Student(String name, String subject, double grade, int yearInCollege, int age, boolean isDegree, double money) {
        this.name = name;
        this.subject = subject;
        this.grade = grade;
        this.yearInCollege = yearInCollege;
        this.age = age;
        this.isDegree = isDegree;
        this.money = money;
    }



    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getGrade() {
        return this.grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public int getYearInCollege() {
        return this.yearInCollege;
    }

    public void setYearInCollege(int yearInCollege) {
        this.yearInCollege = yearInCollege;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDegree() {
        return this.isDegree;
    }

    public void setDegree(boolean degree) {
        isDegree = degree;
    }

    public double getMoney() {
        return this.money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    void upYear(){
        if(this.yearInCollege==4){
            System.out.println(this.name+" has graduated!");
            isDegree=true;
        }else{
            this.yearInCollege++;
            System.out.println(this.name+" is now in year "+this.yearInCollege);
        }
    }

    double receiveScholarship(double min, double amount){
        if(this.age>30){
            System.out.println(this.name+" is too old to get scholarship!");
            return this.money;
        }
        if(this.grade<min){
            System.out.println(this.name+"'s grades are not high enough!");
            return this.money;
        }
        if(amount<0){
            System.out.println("Invalid amount of the scholarship!");
            return this.money;
        }
        return this.money+amount;
    }

    void printStudent(){
        System.out.println("Student name: "+this.name);
        System.out.println("Grade: "+this.grade);
        System.out.println("Subject: "+this.subject);
        System.out.println("Year in college: "+this.yearInCollege);
        System.out.println("Age: "+this.age);
        System.out.println("Has graduated: "+this.isDegree);
        System.out.println("Money from scholarship: "+this.money);
        System.out.println("***************************************");
    }
}

