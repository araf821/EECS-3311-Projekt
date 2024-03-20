package objects;

import java.util.List;

public class SystemManager {
    private List<Book> library;
    private List<CD> CDs;
    private List<Magazine> Magazines;
    private List<SystemManagerUser> managers;
    private static SystemManager system = new SystemManager();
    private String secret = "dogcatanimalshark48";

    private SystemManager() {
    };

    public static SystemManager getInstance() {
        return system;
    }

    public void add(Book book) {
        library.add(book);
    }

    public void add(CD cd) {
        CDs.add(cd);
    }

    public void add(Magazine magazine) {
        Magazines.add(magazine);
    }

    public void remove(Book book) {
        library.remove(book);
    }

    public void remove(CD cd) {
        CDs.remove(cd);
    }

    public void remove(Magazine magazine) {
        Magazines.remove(magazine);
    }

    public void add(SystemManagerUser user) {
        if (user.getAnswer() == secret){
            managers.add(user);
        }
        else{
            System.out.println("This user was not able to be added as a verified system manager")
        }

    }

    public void remove(SystemManagerUser user) {
        managers.remove(user);
    }

}
