package Open_Closed_Principle.Example1.BetterCode;
    import java.util.ArrayList;
    import java.util.List;

    public class NotificationSender {

        public static void sendNotifications(List<Notification> notifications) {
            for(Notification notification : notifications) {
                notification.send();
            }

    }

        public static void main(String[] args) {
            List<Notification>ll=new ArrayList<>();
            ll.add(new SmsNotification());
            ll.add(new EmailNotification());
            ll.add(new WhatsappNotification());
            ll.add(new PushNotification());

            sendNotifications(ll);
        }
}
