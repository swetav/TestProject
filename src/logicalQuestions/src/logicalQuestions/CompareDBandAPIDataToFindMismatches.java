package logicalQuestions;

import java.util.HashSet;

public class CompareDBandAPIDataToFindMismatches {

    public static void main(String[] args) {

        HashSet<String> dbData = new HashSet<>();
        dbData.add("p101");
        dbData.add("p102");
        dbData.add("p103");

        HashSet<String> APIData = new HashSet<>();
        APIData.add("p101");
        APIData.add("p103");
        APIData.add("p104"); // extra in API

        // Missing in API (present in DB but not in API)
        HashSet<String> missingInAPI = new HashSet<>(dbData);
        missingInAPI.removeAll(APIData);

        // Extra in API (present in API but not in DB)
        HashSet<String> extraInAPI = new HashSet<>(APIData);
        extraInAPI.removeAll(dbData);

        System.out.println("Missing in API: " + missingInAPI);
        System.out.println("Extra in API: " + extraInAPI);
    }
}
