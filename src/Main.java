public class Main {
    public static void main(String[] args) {

        // Création du gestionnaire de contact
        ContactsManager myContactsManager = new ContactsManager();

        // Contact 1
        Contact contact1 = new Contact();
        contact1.name = "Samuel";
        contact1.phoneNumber = "0158947563";
        myContactsManager.addContact(contact1);

        // Contact 2
        Contact contact2 = new Contact();
        contact2.name = "Christ";
        contact2.phoneNumber = "0721457896";
        myContactsManager.addContact(contact2);

        // Contact 3
        Contact contact3 = new Contact();
        contact3.name = "Grace";
        contact3.phoneNumber = "0555478963";
        myContactsManager.addContact(contact3);

        // Contact 4
        Contact contact4 = new Contact();
        contact4.name = "Mohamed";
        contact4.phoneNumber = "0756325874";
        myContactsManager.addContact(contact4);

        // Contact 5
        Contact contact5 = new Contact();
        contact5.name = "David";
        contact5.phoneNumber = "0958796324";
        myContactsManager.addContact(contact5);

        // Recherche de contact
        Contact result = myContactsManager.searchContact("David");

        if (result != null) {
            System.out.println("Numéro de " + result.name + " : " + result.phoneNumber);
        } else {
            System.out.println("Contact non trouvé");
        }
    }
}