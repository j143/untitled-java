public class ContactsManager {
    // Fields
    private Contact [] myFriends;
    private int friendsCount;

    // Constructor
    ContactsManager() {
        friendsCount = 0;
        myFriends = new Contact[500];
    }

    // Methods
    void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    Contact searchContact(String jana) {
        if (myFriends[0].name.equals(jana))
            return myFriends[0];
        return null;
    }
}
