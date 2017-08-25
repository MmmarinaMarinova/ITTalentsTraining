package Lesson18;

import java.util.Scanner;

/**
 * Created by Marina on 30.7.2017 г..
 */
public class SecuredNotepad extends SimpleNotepad {
    private String password;

    public SecuredNotepad(Page[] pages, String password) {
        super(pages);
        this.password = validateStrongPassword(password);
    }

    public boolean checkPassword(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your password: ");
        String pass=scanner.nextLine();
        if(pass==null || password.length()==0){
            return false;
        }
        if(this.password.equals(pass)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void addText(String text, int pageNumber) {
        if(checkPassword()){
            super.addText(text, pageNumber);
        }
    }

    @Override
    public void replaceText(String text, int pageNumber) {
        if(checkPassword()){
            super.replaceText(text, pageNumber);
        }
    }

    @Override
    public void clearPage(int pageNumber) {
        if(checkPassword()){
            super.clearPage(pageNumber);
        }
    }

    @Override
    public void printPage(int pageNumber) {
        if(checkPassword()){
            super.printPage(pageNumber);
        }
    }

    @Override
    public boolean searchWord(String word) {
        if(checkPassword()){
            return super.searchWord(word);
        }
        return false;
    }

    @Override
    public void printAllPagesWithDigits() {
        if(checkPassword()){
            super.printAllPagesWithDigits();
        }
    }
    private String validateStrongPassword(String password) {
        if(password.length()<5){
            return "DefaultPassword123"; //terrible way to generate password
        }
        boolean hasUpper=false;
        boolean hasLower=false;
        boolean hasDigit=false;
        for (int i = 0; i <password.length() ; i++) {
            if(Character.isDigit(password.charAt(i))){
                hasUpper=true;
                break;
            }
        }

        for (int i = 0; i <password.length() ; i++) {
            if(Character.isLowerCase(password.charAt(i))){
                hasLower=true;
                break;
            }
        }

        for (int i = 0; i <password.length() ; i++) {
            if(Character.isUpperCase(password.charAt(i))){
                hasUpper=true;
                break;
            }
        }

        if(hasDigit && hasUpper && hasLower){
         return password;
        }else{
             return "DefaultPassword123";
        }
    }
}
