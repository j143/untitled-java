public class Main {

    public static void main(String [] args) {
        System.out.println("Hello world!");
        ContactsManager myContactManager = new ContactsManager();

        // 1. Create a new Contact object
        Contact friendJana = new Contact();
        // 2. set the fields
        friendJana.name = "Jana";
        friendJana.phoneNumber = "992402432";
        // 3. Add the Contact to the ContactsManager
        myContactManager.addContact(friendJana);

        // 1. Create a new Contact object
        Contact friendJason = new Contact();
        // 2. set the fields
        friendJason.name = "Jason";
        friendJason.phoneNumber = "82929233";
        // 3. Add the Contact to the ContactsManager
        myContactManager.addContact(friendJason);

        // search for the number
        Contact result = myContactManager.searchContact("Jason");
        System.out.println(result.phoneNumber);
    }

}
