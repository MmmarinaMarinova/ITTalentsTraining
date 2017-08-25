package Lesson3;

/**
 * Created by Marina on 8.6.2017 г..
 */
public class Task20 {
    public static void main(String[] args) {
        int currNumber = 1;

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(currNumber);
                currNumber++;
                currNumber %= 10;
            }
            System.out.println();
            currNumber++;
            currNumber %= 10;
        }
    }
}
