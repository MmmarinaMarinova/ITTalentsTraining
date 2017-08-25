package Lesson18;

import java.util.Scanner;

/**
 * Created by Marina on 30.7.2017 г..
 */
public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {

    boolean isStarted=false;

    public ElectronicSecuredNotepad(Page[] pages, String password) {
        super(pages, password);
        this.isStarted = false;
    }

    @Override
    public void addText(String text, int pageNumber) {
        if(this.isStarted){
            if(checkPassword()){
                super.addText(text, pageNumber);
            }
        }
    }

    @Override
    public void replaceText(String text, int pageNumber) {
        if(this.isStarted){
            if(checkPassword()){
                super.replaceText(text, pageNumber);
            }
        }
    }

    @Override
    public void clearPage(int pageNumber) {
        if(this.isStarted){
            if(checkPassword()){
                super.clearPage(pageNumber);
            }
        }
    }

    @Override
    public void printPage(int pageNumber) {
        if(this.isStarted){
            if(checkPassword()){
                super.printPage(pageNumber);
            }
        }
    }

    @Override
    public boolean searchWord(String word) {
        if(this.isStarted){
            if(checkPassword()){
                return super.searchWord(word);
            }
            return false;
        }
        return false;
    }

    @Override
    public void printAllPagesWithDigits() {
        if(this.isStarted){
            if(checkPassword()){
                super.printAllPagesWithDigits();
            }
        }
    }

    @Override
    public void start() {
        this.isStarted=true;
    }

    @Override
    public void stop() {
        this.isStarted=false;
    }
}
