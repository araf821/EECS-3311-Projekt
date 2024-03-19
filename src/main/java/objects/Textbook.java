package objects;

public class Textbook {
    private String id;
    private String courseId;
    private String edition;

    public Textbook(String id, String courseId, String edition) {
        this.id = id;
        this.courseId = courseId;
        this.edition = edition;
    }

    public String getId() {
        return id;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getEdition() {
        return edition;
    }
}
