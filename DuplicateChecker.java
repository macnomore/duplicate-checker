import java.security.KeyStore.Entry;
import java.util.*;

// For creating the contact object to store name and email
class Contact {
    String email, name;

    public Contact(String name, String email) {
        this.name = name;
        this.email = email.toLowerCase();
    }
}

public class DuplicateChecker {
    public static void main(String[] args) {

        // The below block of code check duplicates from a list od emaols only

        String[] emailArray = new String[] { "aa@gmail.com", "bb@gmail.COM", "aa@gmail.COM", "cc@gmail.com" };

        // Sort the array is descending order
        Arrays.sort(emailArray, Collections.reverseOrder());

        /*
         * Store the values in a LinkedHashSet to remove the duplicates and maintin
         * sorting order
         */
        LinkedHashSet<String> emailSet = new LinkedHashSet<String>();

        for (int i = 0; i < emailArray.length; i++) {

            // Change the input to lowercase to capture exact duplicates
            emailSet.add(emailArray[i].toLowerCase());
        }

        System.out.println("============================");
        System.out.println("Non duplicates from an email list:");
        System.out.println(emailSet);

        /*
         * The below block of code looks for duplicates from a contact list that has
         * name and email
         */

        // List of contact records with duplicates
        Contact con1 = new Contact("Abel", "aa@gmail.com");
        Contact con2 = new Contact("Brian", "bb@gmail.COM");
        Contact con3 = new Contact("Abel", "aa@gmail.COM");
        Contact con4 = new Contact("Charles", "cc@gmail.com");

        // Create a TreeMap to store the list in a sorted manner
        Map<String, Contact> contactMap = new TreeMap<String, Contact>(Collections.reverseOrder());

        // Add the contact records to the TreeMap
        contactMap.put(con1.email, con1);
        contactMap.put(con2.email, con2);
        contactMap.put(con3.email, con3);
        contactMap.put(con4.email, con4);

        System.out.println();
        System.out.println("Non duplicates from a contact list:");

        // Iterate through the TreeMap to print Contact records
        for (Map.Entry<String, Contact> entry : contactMap.entrySet()) {

            String conEmail = entry.getKey();
            Contact con = entry.getValue();

            System.out.println(con.name + ": " + conEmail);
        }

        System.out.println("============================");

    }
}