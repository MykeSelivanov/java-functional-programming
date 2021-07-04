package mapfunctionaloperations;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.OptionalDouble;
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

        // Map
        String contactNames = contacts.entrySet().stream()
                .map(contact -> contact.getValue())
                .distinct() // to avoid duplicate names
                .collect(Collectors.joining(" , "));

        System.out.println(contactNames);

        System.out.println("--------------------");

        // Soring of map elements
        LinkedHashMap<String, String> sortedContactsMapByValue = contacts.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                // keymapper, valuemapper,
                // mergeFunction (what to do if 2 duplicate keys will be generated, for eg (val1, val2) -> val1 will pick up only val1 to avoid duplicates),
                // mapFactory (in example below will be used LinkedHashMap as it is preserving the insertion order)
                .collect(Collectors.toMap(contact -> contact.getKey(), contact -> contact.getValue(), (value1, value2) -> value1, LinkedHashMap::new));

        sortedContactsMapByValue.forEach((key, value) -> System.out.println(key + " - " + value));

        System.out.println("--------------------");

        // Reduce
        Map<String,Double> marks = new HashMap<>();
        marks.put("Science", 75.0);
        marks.put("Math", 80.0);
        marks.put("English", 72.0);
        marks.put("History", 94.0);

        OptionalDouble average = marks.values().stream()
                .mapToDouble(mark -> mark) // need to convert to primitive stream first, in order to perform average()
                .average();
        System.out.println(average.getAsDouble());

    }
}
