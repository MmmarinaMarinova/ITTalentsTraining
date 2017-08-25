package Lesson8Strings;

/**
 * Created by Marina on 22.6.2017 г..
 */
public class Task01 {
    public static void main(String[] args) {
        String prefix="hipo";
        String str="hipopotam";

        if(str.startsWith(prefix)){
            System.out.println("The first string is prefix to the second!");
        }else{
            System.out.println("The first string is not prefix to the second!");
        }
    }
}
