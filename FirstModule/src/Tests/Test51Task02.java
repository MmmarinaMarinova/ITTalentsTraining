package Tests;

/**
 * Created by Marina on 4.7.2017 г..
 */
public class Test51Task02 {
    public static void main(String[] args) {
        String str="word word patka patka patka marina marina marina marina";
        String mostFrequent=mostFrequentWord(str);
        System.out.println(mostFrequent);

    }

     static String mostFrequentWord(String str) {
        String[] words=str.split(" ");
        String result="";

         for (int i = 0; i < words.length; i++) {
             String word=words[i];
             int occurencies=0;
             int maxCounter=1;
             for (int j = 0; j < words.length; j++) {
                 if(word.equals(words[j])){
                     occurencies++;
                 }
             }
             if(maxCounter<occurencies){
                 maxCounter=occurencies;
                 result=words[i];
             }
         }
         return result;
    }

}
