package Lesson18;

/**
 * Created by Marina on 30.7.2017 г..
 */
public class SimpleNotepad implements INotepad {
        private Page[] pages;

    public SimpleNotepad(Page[] pages) {
        if(pages!=null){
            this.pages = pages;
        }
    }

    public Page[] getPages() {
        return this.pages;
    }

    public void setPages(Page[] pages) {
        this.pages = pages;
    }

    @Override
    public void addText( String text,int pageNumber) {
       if(validatePageNumber(pageNumber)) return;
        this.pages[pageNumber].setText(this.pages[pageNumber]+text);

    }

    @Override
    public void clearPage(int pageNumber) {
        if (validatePageNumber(pageNumber)) return;
        this.pages[pageNumber].setText("");
    }

    @Override
    public void replaceText(String text, int pageNumber) {
        if (validatePageNumber(pageNumber)) return;
        if(text!=null){
            this.pages[pageNumber].setText(text);
        }
    }

    @Override
    public void printPage(int pageNumber) {
        if (validatePageNumber(pageNumber)) return;
        System.out.println("*******************");
        System.out.println(this.pages[pageNumber].seePage());
        System.out.println("*******************");
    }

    public boolean validatePageNumber(int pageNumber) {
        if(pageNumber<0 || pageNumber>=this.pages.length){
            System.out.println("Wrong page");
            return true;
        }
        return false;
    }

    @Override
    public void printAllPagesWithDigits() {
        for (Page p: this.pages) {
            if(p.containsDigits()){
                System.out.println(p.seePage());
            }
        }
    }

    @Override
    public boolean searchWord(String word) {
        for (Page p: this.pages) {
            if(p.searchWord(word)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void addPage(Page page) {
        for (int i = 0; i < this.pages.length; i++) {
            if(this.pages[i]==null){
                this.pages[i]=page;
                break;
            }
        }
    }
}
