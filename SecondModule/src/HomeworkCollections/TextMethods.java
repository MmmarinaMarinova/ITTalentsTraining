package HomeworkCollections;

import java.util.*;

/**
 * Created by Marina on 24.8.2017 г..
 */
public class TextMethods {
    private String input;
    private HashMap<Character,Integer> occurences;

    public TextMethods() {
        this.occurences= new HashMap<>();
    }

    void countOccurences(String text){
        text=text.toUpperCase();
        for (int i = 0; i < text.length(); i++) {
            if(!this.occurences.containsKey(text.charAt(i))){
                this.occurences.put(text.charAt(i),1);
            }else{
                this.occurences.put(text.charAt(i),this.occurences.get(text.charAt(i))+1);
            }
        }
        Collection<Integer> list=this.occurences.values();
        this.printOccurences();
    }



    private void printOccurences(){
        for (Map.Entry<Character,Integer> c: occurences.entrySet()) {
            System.out.println(c.getKey()+" "+c.getValue());
        }
    }


}
