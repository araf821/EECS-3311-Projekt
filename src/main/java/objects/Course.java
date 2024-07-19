package objects;

public class Course {
    private int id;
    private String courseName;
    private int facultyId;
    private Textbook textbook;
    private String term;

    public Course(int id, String courseName, int facultyId, Textbook textbook, String term) {
        this.id = id;
        this.courseName = courseName;
        this.facultyId = facultyId;
        this.textbook = textbook;
        this.term = term;
    }

    public int getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public Textbook getTextbook() {
        return textbook;
    }

    public String getTerm() {
        return term;
    }

}
