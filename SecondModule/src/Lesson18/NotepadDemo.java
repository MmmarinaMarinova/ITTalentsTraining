package Lesson18;

/**
 * Created by Marina on 30.7.2017 г..
 */
public class NotepadDemo {


    public static void main(String[] args) {
        SimpleNotepad smnotepad=new SimpleNotepad(new Page[15]);
        SecuredNotepad securedNotepad=new SecuredNotepad(new Page[20],"StrongPassword15");
        ElectronicSecuredNotepad elnotepad=new ElectronicSecuredNotepad(new Page[25],"weakpassword");

        for (int i = 0; i < smnotepad.getPages().length; i++) {
            Page page=new Page("Title"+i,"text"+i);
            smnotepad.addPage(page);
        }
        for (int i = 0; i < securedNotepad.getPages().length; i++) {
            Page page=new Page("Title"+i,"text"+i);
            smnotepad.addPage(page);
        }
        for (int i = 0; i < elnotepad.getPages().length; i++) {
            Page page=new Page("Title"+i,"text"+i);
            smnotepad.addPage(page);
        }

        securedNotepad.addText("text", 5);
        securedNotepad.printPage(5);
        elnotepad.start();
        System.out.println(elnotepad.isStarted);
        elnotepad.printAllPagesWithDigits();
        smnotepad.printPage(6);


       /* for (int i = 0; i < smnotepad.getPages().length; i++) {
            System.out.println(smnotepad.getPages()[i].getTitle());
            System.out.println(smnotepad.getPages()[i].getText());

        }*/

    }
}
