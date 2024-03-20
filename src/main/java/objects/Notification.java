package objects;

public class Notification{
    private int notificationID;
    private String UserID;
    private String message;
    private Date date;
    public Notification(int notiID, String Userid, String message, Date date){
        this.notificationID = notiID;
        this.UserID = Userid;
        this.message = message;
        this.date = Date.today();
    }

}