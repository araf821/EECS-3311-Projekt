package objects;

import java.time.LocalDate;
import java.util.Date;

public class Notification {
    private int notificationID;
    private int UserID;
    private String message;
    private Date date;

    public Notification(int notiID, int Userid, String message, LocalDate date) {
        this.notificationID = notiID;
        this.UserID = Userid;
        this.message = message;
        this.date = new Date();
    }

    public int getNotificationID() {
        return notificationID;
    }

    public int getUserID() {
        return UserID;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

}