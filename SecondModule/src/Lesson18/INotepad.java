package Lesson18;

/**
 * Created by Marina on 30.7.2017 г..
 */
public interface INotepad {
    public void addText(String text, int pageNumber);
    public void replaceText(String text,int pageNumber);
    public void clearPage(int pageNumber);
    public void printPage(int pageNumber);
    public boolean searchWord(String word);
    public void printAllPagesWithDigits();
    public void addPage(Page page);
}
