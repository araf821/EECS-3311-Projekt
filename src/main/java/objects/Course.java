package objects;

public class Course {
    private String id;
    private String courseName;
    private String facultyId;
    private Textbook textbook;
    private String term;

    public Course(String id, String courseName, String facultyId, Textbook textbook, String term) {
        this.id = id;
        this.courseName = courseName;
        this.facultyId = facultyId;
        this.textbook = textbook;
        this.term = term;
    }

    public String getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public Textbook getTextbook() {
        return textbook;
    }

    public String getTerm() {
        return term;
    }

}
