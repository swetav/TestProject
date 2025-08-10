package logicalQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;

public class CompareDBandAPIDataToFindMismatches {

    public static void main(String[] args) {

        // Step 1: Store all values
        Set<String> dbData = new HashSet<>(Arrays.asList(
            "p101", "p102", "P103"
        ));
        Set<String> APIData = new HashSet<>(Arrays.asList(
            "P101", "p103", "p104"
        ));

        // Convert DB data to lowercase
        Set<String> lowerDBData = new HashSet<>();
        for (String s : dbData) {
            lowerDBData.add(s.toLowerCase());
        }
        dbData = lowerDBData;

        // Convert API data to lowercase
        Set<String> lowerAPIData = new HashSet<>();
        for (String s : APIData) {
            lowerAPIData.add(s.toLowerCase());
        }
        APIData = lowerAPIData;

        // Step 2: Missing in API
        Set<String> missingInAPI = new TreeSet<>(dbData);
        missingInAPI.removeAll(APIData);

        // Step 3: Extra in API
        Set<String> extraInAPI = new TreeSet<>(APIData);
        extraInAPI.removeAll(dbData);

        // Step 4: Print QA report
        System.out.println("\n===== QA Data Comparison Report =====\n");

        System.out.println("--- MISSING IN API ---");
        if (missingInAPI.isEmpty()) {
            System.out.println("None");
        } else {
            missingInAPI.forEach(System.out::println);
        }

        System.out.println("\n--- EXTRA IN API ---");
        if (extraInAPI.isEmpty()) {
            System.out.println("None");
        } else {
            extraInAPI.forEach(System.out::println);
        }

        System.out.println("\n===== End of Report =====");
    }
}