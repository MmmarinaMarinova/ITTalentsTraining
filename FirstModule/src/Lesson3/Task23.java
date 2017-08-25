package Lesson3;


/**
 * Created by Marina on 8.6.2017 г..
 */
public class Task23 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        while (i <= 10) {
            while (j <= 10) {
                if (j >= i) {
                    System.out.print(i + "*" + j + "=" + i * j + "; ");
                }
                j++;
            }
            System.out.println();
            i++;
            j = 1;
        }
    }
}
