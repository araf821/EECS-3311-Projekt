package objects;

import java.util.ArrayList;
import java.util.List;

public class Textbook {
    private int id;
    private String courseId;
    private String edition;
    private List<observer> observers = new ArrayList<observer>();

    public Textbook(int id, String courseId, String edition) {
        this.id = id;
        this.courseId = courseId;
        this.edition = edition;
    }

    public int getId() {
        return id;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getEdition() {
        return edition;
    }

    public void attachObserver(observer observe) {
        for (observer obs : observers) {
            obs.update();
        }
    }
}
