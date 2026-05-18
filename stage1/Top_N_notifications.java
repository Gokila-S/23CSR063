import java.util.*;

class Notification{

    int id;
    String message;
    String type;
    Date timestamp;
    Boolean read;

    public Notification(int id, String message,String type, Date timestamp) {
        this.id = id;
        this.message = message;
        this.type = type;
        this.timestamp = timestamp;
        read=false;
    }
}
class A{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of notifications to display:");
        int n = sc.nextInt();

        List<Notification> notifications = new ArrayList<>();

        notifications.add(new Notification(1, "Message1", "Placement", new Date()));
        notifications.add(new Notification(2, "Message2", "Result", new Date()));
        notifications.add(new Notification(3, "Message3", "Event", new Date()));
        notifications.add(new Notification(1, "Message4", "Placement", new Date()));
        notifications.add(new Notification(2, "Message5", "Result", new Date()));
        notifications.add(new Notification(3, "Message6", "Event", new Date()));
        notifications.add(new Notification(1, "Message7", "Placement", new Date()));
        notifications.add(new Notification(2, "Message8", "Result", new Date()));
        notifications.add(new Notification(3, "Message9", "Event", new Date()));

        //sort based on type : placement -> results -> events
        notifications.sort((a, b) -> {
            if (a.type.equals(b.type)) {
                return 0;
            } else if (a.type.equals("Placement")) {
                return -1;
            } else if (b.type.equals("Placement")) {
                return 1;
            } else if (a.type.equals("Result")) {
                return -1;
            } else if (b.type.equals("Result")) {
                return 1;
            } else {
                return 0;
            }
        });

        //now sort on recent timestamp
        notifications.sort((a, b) -> b.timestamp.compareTo(a.timestamp));
        
        System.out.println("Top " + n + " notifications:");
        for (int i = 0; i < Math.min(n, notifications.size()); i++) {
            Notification notification = notifications.get(i);
            System.out.println(notification.message + " - " + notification.type + " - " + notification.timestamp);
        }   

    }
}