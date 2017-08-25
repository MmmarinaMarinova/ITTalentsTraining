package Tests;

/**
 * Created by Marina on 4.7.2017 г..
 */
public class Test6Task02 {
    public static void main(String[] args) {
        String input="Today is a good day for test. Sun is shining. The students are happy. The birds are blue.";
        String result=longestSentence(input);
        System.out.println("The longest sentence is: ");
        System.out.println(result);
    }

     static String longestSentence(String input) {
        String[] sentences=input.split("\\.");
        int maxPos=0;
         for (int i = 0; i < sentences.length; i++) {
             int maxLength=sentences[i].length();
             for (int j = 0; j <sentences.length ; j++) {
                 int currLength=sentences[j].length();
                 if(maxLength<currLength){
                     maxLength=currLength;
                     maxPos=j;
                 }
             }
         }
         System.out.println("The count of the sentences is: "+sentences.length);
         return sentences[maxPos];
    }
}
