package Tests;

import java.util.Scanner;

/**
 * Created by Marina on 3.7.2017 г..
 */
public class Test52Task04 {
    public static void main(String[] args) {
        char[][] board=new char[10][10];
        Scanner scanner=new Scanner(System.in);
        int x=0;
        int y=0;
        int counter=0;

        do{
            System.out.println("Enter the x coordinate of the bomb: ");
            x=scanner.next().charAt(0);
            System.out.println("Enter the y coordinate of the bomb: ");
            y=scanner.next().charAt(0);
            if(x<0 || x>9 || y<0 || y>9){
                System.out.println("Invalid coordinates! Enter again");
            } else{
                board[x][y]='*';
                counter++;
            }
        }while(counter<=10);

        mineSweeper(board, 0, 0);
        printBoard(board);
    }

    static void mineSweeper(char[][] board,int row, int col) {
        if(board[row][col]=='*'){
            if(row==0){
                if(col==0){
                }
            }
        }
    }

    static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]+" ");
            }
        }
        System.out.println();
    }
}
