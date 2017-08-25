package Lesson18;

/**
 * Created by Marina on 30.7.2017 г..
 */
public class Page {
    private String title;
    private String text;

    public Page(String title, String text) {
        if(title==null){
            this.title="No title";
        }else{
            this.title = title;
        }
        if(text==null){
            this.text="";
        }else{
            this.text = text;
        }
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        if(title!=null){
            this.title = title;
        }
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        if(text!=null){
            this.text = text;
        }
    }

    public void addText(String text){
        if(text!=null){
            this.text+=text;
        }
    }

    public void deleteText(){
        this.text="";
    }

    public String seePage(){

        if(this.title==null){
            this.title="No title";
        }
        if(this.text==null){
            this.text="";
        }

        String page="Title: "+this.title+"\nText: "+this.text;
        return page;
    }
    //TODO CHECK EVERYTHING FOR NULL REFERENCE


    public boolean searchWord(String word){
        if(word!=null){
            if(this.text.contains(word)){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    public boolean containsDigits(){
        for (Character ch: this.text.toCharArray()) {
            if(Character.isDigit(ch)){
                return true;
            }
        }
        return false;
    }
}
