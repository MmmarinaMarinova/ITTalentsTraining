package Lesson8Strings;

/**
 * Created by Marina on 22.6.2017 г..
 */
public class Task05 {
    public static void main(String[] args) {
        String str1="abcde";
        String str2="cbaed";
        boolean containsChar=false;

        if(str1.length()!=str2.length()){
            System.out.println("The string is not an anagram");
            return;
        }

        for (int i = 0; i < str1.length(); i++) {
            if(str1.contains(str2.substring(i,i+1))){
                containsChar=true;
            }else{
                containsChar=false;
                break;
            }
        }

        System.out.println(containsChar? "The string is an anagram":"The string is not an anagram");


    }
}
