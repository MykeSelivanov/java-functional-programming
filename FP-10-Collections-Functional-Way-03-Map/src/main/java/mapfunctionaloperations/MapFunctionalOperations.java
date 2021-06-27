package mapfunctionaloperations;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapFunctionalOperations {
    public static void main(String[] args) {

        Map<String, String> contacts = new HashMap<>();
        contacts.put("1234567890", "John");
        contacts.put("1112223334", "John");
        contacts.put("4445556667", "Peter");
        contacts.put("8899006743", "Jackie");
        contacts.put("9944331235", "Nina");
        contacts.put("0507643271", "Edgar");
        contacts.put("3114567898", "Alice");

        // Traversal
        contacts.forEach((key, value) -> System.out.println(key + " - " + value));

        System.out.println("--------------------");

        // Filter
        // Filter out contact number of John
        contacts.entrySet().stream()
                .filter(contact -> "John".equalsIgnoreCase(contact.getValue()))
                .forEach(System.out::println);

        Map<String, String> filteredContacts = contacts.entrySet().stream()
                .filter(contact -> "John".equalsIgnoreCase(contact.getValue()))
                .collect(Collectors.toMap(contact -> contact.getKey(), contact -> contact.getValue()));

        System.out.println(filteredContacts);

        System.out.println("--------------------");


    }
}
