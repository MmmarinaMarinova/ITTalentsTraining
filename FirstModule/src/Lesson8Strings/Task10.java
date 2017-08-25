package Lesson8Strings;

/**
 * Created by Marina on 22.6.2017 г..
 */
public class Task10 {
    public static void main(String[] args) {
        int number=25;
        int secondNumber=20;
        StringBuilder result=new StringBuilder();

        for (int i = 0; i <=number ; i++) {
            result.append(i);
        }
        System.out.println(result.toString());

        int index=result.indexOf(String.valueOf(secondNumber));
        System.out.printf("Index of %d counted from 0: %d",secondNumber,index);
    }
}
