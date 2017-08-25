package Lesson8Strings;

/**
 * Created by Marina on 22.6.2017 г..
 */
public class Task09 {
    public static void main(String[] args) {
        int number=25;
        StringBuilder result=new StringBuilder();

        for (int i = 0; i <=number ; i++) {
            result.append(i);
        }
        System.out.println(result.toString());
    }
}
