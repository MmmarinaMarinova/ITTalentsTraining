package Lesson13.Task02;

/**
 * Created by Marina on 11.7.2017 г..
 */
public class MobilePhoneDemo {
    public static void main(String[] args) {
        GSM nokia=new GSM();
        nokia.insertSimCard("0887548936");
        nokia.model="Nokia Lumia";

        GSM iPhone=new GSM();
        iPhone.model="iPhone 7";
        iPhone.insertSimCard("0895467852");

        nokia.call(iPhone, 34);
        nokia.printInfoForTheLastOutgoingCall();
        iPhone.printInfoForTheLastIncomingCall();


        nokia.removeSimCard();
        iPhone.call(nokia,12);

    }
}
