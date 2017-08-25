package Lesson8Recursion;

/**
 * Created by Marina on 29.6.2017 г..
 */
public class Task17Loops {
    public static void main(String[] args) {
        int size=10;
        char ch='-';
        int row=0;
        printSquare(size,ch,row);

    }

     static void printSquare(int size, char ch,int row) {
         if(row>size){
             return;
         }
        if(row==0 || row==size){
            String fullStarRow = new String(new char[size]).replace('\0', '*');
            System.out.println(fullStarRow);
        }else{
            String spaceRow=new String(new char[size-2]).replace('\0',ch);
            System.out.println("*"+spaceRow+"*");
        }

        printSquare(size,ch, row+1);
    }
}
