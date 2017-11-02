package istiyak.pro.recyclerviewnewdemo;

/**
 * Created by istiy on 11/3/2017.
 */

public class ListItem {
    private String notification;
    private String notificationTime;

    public ListItem(String notification, String notificationTime) {
        this.notification = notification;
        this.notificationTime = notificationTime;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public String getNotificationTime() {
        return notificationTime;
    }

    public void setNotificationTime(String notificationTime) {
        this.notificationTime = notificationTime;
    }



}
