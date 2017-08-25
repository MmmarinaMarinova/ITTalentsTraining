package Lesson16;

/**
 * Created by Marina on 19.7.2017 г..
 */
public class Person {
    protected final String name;
    protected int age;
    protected boolean isMale;

    public Person(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

     String showPersonInfo(){
         return "Name: "+this.name+"\nAge: "+this.age+"\nGender: "+(this.isMale? "Male": "Female");
    }

     @Override
     public String toString(){
         return showPersonInfo();
     }

}
