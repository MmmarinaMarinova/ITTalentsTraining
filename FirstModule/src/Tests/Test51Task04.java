package Tests;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Marina on 4.7.2017 г..
 */
public class Test51Task04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char[][] board=createBoard();
        System.out.println("Enter coordinates to start from: ");
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        board[x][y]='X';
        paintBrush(board, x, y);
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                System.out.print(board[row][col]+" ");
            }
            System.out.println();
        }
    }

    static char[][] createBoard() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size of the board: ");
        int size=scanner.nextInt();
        char[][] board=new char[size][size];

        System.out.println("Enter the board: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j]=scanner.next().charAt(0);
            }
        }
        return board;
    }

    static void paintBrush(char[][] board, int x, int y) {
        //first check if the cells around the point are borders('b')
        //or if they are out of bounds
        //if they are, return
        //otherwise make the cell='r' and call the method recursively

            int row = x;
            int col = y;

            // current
            if (isNotBorder(board, row, col) && isNotPainted(board, row, col)) {
                board[x][y] = 'r';
            } else {
                return;
            }

            // down
            row = x + 1;
            col = y;
            if (isNotBorder(board, row, col) && isNotPainted(board, row, col)) {
                paintBrush(board, row, col);
            }

            // down left
            row = x + 1;
            col = y - 1;
            if (isNotBorder(board, row, col) && isNotPainted(board, row, col)) {
                paintBrush(board, row, col);
            }

            // down right
            row = x + 1;
            col = y + 1;
            if (isNotBorder(board, row, col) && isNotPainted(board, row, col)) {
                paintBrush(board, row, col);
            }

            // left
            row = x;
            col = y - 1;
            if (isNotBorder(board, row, col) && isNotPainted(board, row, col)) {
                paintBrush(board, row, col);
            }

            // right
            row = x;
            col = y + 1;
            if (isNotBorder(board, row, col) && isNotPainted(board, row, col)) {
                paintBrush(board, row, col);
            }

            // up
            row = x - 1;
            col = y;
            if (isNotBorder(board, row, col) && isNotPainted(board, row, col)) {
                paintBrush(board, row, col);
            }

            // up left
            row = x - 1;
            col = y - 1;
            if (isNotBorder(board, row, col) && isNotPainted(board, row, col)) {
                paintBrush(board, row, col);
            }

            // up right
            row = x - 1;
            col = y + 1;
            if (isNotBorder(board, row, col) && isNotPainted(board, row, col)) {
                paintBrush(board, row, col);
            }

        }

     static boolean isNotPainted(char[][] board, int row, int col) {
        if(board[row][col]!='b' && board[row][col]!='r'){
            return  true;
        }else{
            return false;
        }
    }

    static boolean isNotBorder(char[][] board, int row, int col) {
        if(row>=0 && row<=board.length-1 && col>=0 && col<=board.length-1){
            return true;
        }else{
            return false;
        }
    }
}

