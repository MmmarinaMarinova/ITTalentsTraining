package Lesson8Recursion;

/**
 * Created by Marina on 27.6.2017 г..
 */
public class Task11Loops {
    public static void main(String[] args) {
        int height=5;
        int spaces=height-1;
        int stars=1;
        printTriangle(height, stars, spaces);
    }

    static void printTriangle(int height, int stars, int spaces) {
        if(stars>(2*height-1)){
            return;
        }
        String star=new String();
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < stars; i++) {
            System.out.print("*");
        }
        System.out.println();
        printTriangle(height, stars+2, spaces-1);
    }
}
