package Lesson13.Task02;

/**
 * Created by Marina on 11.7.2017 г..
 */
public class GSM {

    String model;
    boolean hasSimCard;
    String simNumber;
    int outgoingCallsDuration;
    Call lastIncomingCall;
    Call lastOutgoingCall;

    void insertSimCard(String simCardMobileNumber){

        if(simCardMobileNumber.length()==10 &&
                simCardMobileNumber.charAt(0)=='0'
                && simCardMobileNumber.charAt(1)=='8'){
            hasSimCard=true;
            simNumber=simCardMobileNumber;
        }else return;
    }

    void removeSimCard(){
        hasSimCard=false;
        simNumber="";
    }

    void call(GSM receiver, int currentDuration){
        System.out.println("Trying to connect....");

        if(currentDuration<1 || currentDuration>60){
            System.out.println("Invalid duration!");
            return;
        }
        if(simNumber.equals(receiver.simNumber)){
            System.out.println("You cannot call your own number!");
            return;
        }
        if(!hasSimCard || !receiver.hasSimCard ){
            System.out.println("Cannot connect!");
            return;
        }

        Call currentCall=new Call();
        currentCall.caller=this;
        currentCall.receiver=receiver;
        currentCall.duration=currentDuration;

        lastOutgoingCall=currentCall;

        receiver.lastIncomingCall=currentCall;

        outgoingCallsDuration+=currentDuration;
        System.out.println("You are now speaking!");

    }

    double getSumForCall(double minutePrice){
        double finalPrice=(double)(outgoingCallsDuration*minutePrice);
        return finalPrice;
    }

    void printInfoForTheLastIncomingCall(){
        if(lastIncomingCall!=null){
            System.out.println("Last incoming call for number: "+simNumber);
            System.out.println("Number who called you: "+lastIncomingCall.caller.simNumber);
            System.out.println("Duration: "+lastIncomingCall.duration+"min");
        }
        else{
            System.out.println("No previous incoming calls.");
        }
    }

    void printInfoForTheLastOutgoingCall(){
        if(lastOutgoingCall!=null){
            System.out.println("Last outgoing call for number: "+simNumber);
            System.out.println("Number that you called: "+lastOutgoingCall.receiver.simNumber);
            System.out.println("Duration: "+lastOutgoingCall.duration+"min");
            System.out.println("Price for all outgoing calls until now: " +getSumForCall(lastOutgoingCall.priceForAMinute));
        }
        else{
            System.out.println("No previous outgoing calls.");
        }
    }
}
