package src.lessons.lesson_6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HasMapLearning {
    public static void main(String[] args) {
        // CRUD
        Map<Integer, String> emergencyList = new HashMap<>();
        Map<String, Map<String, String>> menuItemMap = new HashMap<>();

        // Adding new entry into a map
        emergencyList.put(113, "Policy Dept");
        emergencyList.put(114, "Fire Dept");
        emergencyList.put(115, "Hospital");
        emergencyList.put(116, "Other");
        System.out.println(emergencyList.get(116));

        emergencyList.put(116, "Something Else");
        System.out.println("[116] " + emergencyList.get(116));


        // Read one value
        System.out.println(emergencyList.get(113));
        System.out.println(emergencyList.get(117));

        // Update
        emergencyList.replace(116, "ABC");
        System.out.println(emergencyList.get(116));

        emergencyList.replace(116, "ABC", "XYZ");
        System.out.println(emergencyList.get(116));

        // Remove entry out of the map
        emergencyList.remove(116);
        System.out.println(emergencyList.get(116));

        emergencyList.remove(115, "Hospital");
        System.out.println(emergencyList.get(115));

        // Loop over the map
        System.out.println("Loop over the map---------------");
        printMapValues(emergencyList);

        // Loop over the entries,
        // if the entry has value "Others"
        //  -> remove from the map
        System.out.println("Loop over the entries to remove entry with condition match");
        emergencyList.put(116, "Other");
        Set<Integer> keys = emergencyList.keySet();

        for (int key : keys) {
            if (emergencyList.get(key).equals("Others")) {
                emergencyList.remove(key);
            }
        }
    }

    private static void printMapValues( Map<Integer, String> map) {
        Set<Integer> keys = map.keySet();
        for (int key : keys) {
            System.out.println(map.get(key));
        }
    }
}
