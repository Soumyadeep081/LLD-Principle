package Open_Closed_Principle.Example1.BetterCode;


public class EmailNotification implements Notification{

    @Override
    public void send() {
        System.out.println("Sending Email...");
    }
}
