public class ContactsManager {

    Contact[] myFriends;
    int friendsCount;

    // Le Constructeur
    public ContactsManager() {
        myFriends = new Contact[500];
        friendsCount = 0;
    }

    // Ajouter un contact
    public void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    // Rechercher un contact par le nom
    public Contact searchContact(String name) {
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].name.equals(name)) {
                return myFriends[i];
            }
        }
        return null;
    }
}
