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
        for(int i=0; i < myFriends.length; i++)
            if (myFriends[i].name.equals(jana))
                return myFriends[i];
        return null;
    }
}
