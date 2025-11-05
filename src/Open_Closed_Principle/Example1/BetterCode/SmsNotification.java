package Open_Closed_Principle.Example1.BetterCode;

    public class SmsNotification implements Notification{
        @Override
        public void send() {
            System.out.println("Sending SMS...");
        }

    }
