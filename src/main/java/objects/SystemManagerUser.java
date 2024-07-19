package objects;

import objects.PhysicalItem.ItemType;
import userHandling.AccountHandling;
import userHandling.PhysicalItemHandling;

public class SystemManagerUser extends User {

    public SystemManagerUser(int id, String email, String password, UserType userType) {
        super(id, email, password, userType);
    }

    public void addPhysicalItem(String title, ItemType type, String location, double value, String extraInfo) {
        PhysicalItem item;
        int newItemId = PhysicalItemHandling.getLastId() + 1;

        switch (type) {
            case BOOK:
                item = new Book(newItemId, title, location, 20, value, extraInfo);
                break;
            case MAGAZINE:
                item = new Magazine(newItemId, title, location, 20, value, extraInfo);
                break;
            case CD:
                item = new CD(newItemId, title, location, 20, value, extraInfo);
                break;
            default:
                throw new IllegalArgumentException("Unknown item type: " + type);
        }

        PhysicalItemHandling.writePhysicalItem(item);
    }

    public void validateUser(String email) {
        AccountHandling.updateValidation(email);
    }

    public static void main(String[] args) {
        SystemManagerUser user = new SystemManagerUser(1, "dog@gmail.com", "password", UserType.SYSTEM_MANAGER);
        user.validateUser("dog");
    }

}
