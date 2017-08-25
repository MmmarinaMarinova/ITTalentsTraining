package Lesson6;

/**
 * Created by Marina on 16.6.2017 г..
 */
public class TaskFromClass11 {
    public static void main(String[] args) {
        int rows=4;
        int cols=5;
        int[][] firstMatrix=new int[rows][cols];
        int currNumber=1;
        int[][] secondMatrix=new int[rows][cols];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                firstMatrix[j][i]=currNumber;
                currNumber++;
            }
        }
        System.out.println("First matrix:");
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                System.out.print(firstMatrix[i][j]+" ");
            }
            System.out.println();
        }

        currNumber=1;
        for (int i = 0; i < cols; i++) {
            if(i%2==1){
                for (int j = rows-1; j >=0; j--) {
                    secondMatrix[j][i]=currNumber;
                    currNumber++;
                }
            }else if(i%2==0){
                for (int j = 0; j < rows ; j++) {
                    secondMatrix[j][i]=currNumber;
                    currNumber++;
                }
            }
        }
        System.out.println("Second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(secondMatrix[i][j]+" ");
            }
            System.out.println();
        }


    }
}
