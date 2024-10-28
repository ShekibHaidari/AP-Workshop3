import java.util.ArrayList;
import java.util.List;

/**
 * @author Ahmad Shekib Haidari
 *
 * Phone book class
 * we save all data about contcat in a list
 *
 */
public class PhoneBook {
    private List<Contact> contacts;

    public PhoneBook() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Method for add a new contanct if doesnt exisit
     * @param contact
     * @return
     */
    public boolean addContact(Contact contact) {
        for (Contact c : contacts) {
            if (c.getFirstName().equals(contact.getFirstName()) && c.getLastName().equals(contact.getLastName())) {
                return false; // Contact already exists
            }
        }
        contacts.add(contact);
        return true;
    }

    /**
     * method to delete contact if exisit
     * @param firstName
     * @param lastName
     * @return
     */
    public boolean deleteContact(String firstName, String lastName) {
        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(firstName) && c.getLastName().equalsIgnoreCase(lastName)) {
                contacts.remove(c);
                return true; // Contact deleted
            }
        }
        return false; // Contact not found
    }

    /**
     * search a contact
     *
     * @param firstName
     * @param lastName
     * @return
     */

    public Contact findContact(String firstName, String lastName) {
        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(firstName) && c.getLastName().equalsIgnoreCase(lastName)) {
                return c;
            }
        }
        return null; // Contact not found
    }

    public Contact[] findContacts(String group) {
        List<Contact> groupContacts = new ArrayList<>();
        for (Contact c : contacts) {
            if (c.getGroup().equalsIgnoreCase(group)) {
                groupContacts.add(c);
            }
        }
        return groupContacts.isEmpty() ? null : groupContacts.toArray(new Contact[0]);
    }
    // method for peint all contacts

    /**
     * print all contact
     */
    public void printContacts() {
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}
