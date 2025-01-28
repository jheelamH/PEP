import java.util.TreeMap;

public class EmployeeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        // Add employee IDs and names to the map
        employeeMap.put(101, "Alice");
        employeeMap.put(102, "Bob");
        employeeMap.put(103, "Charlie");
        employeeMap.put(104, "Diana");
        employeeMap.put(105, "Eve");

        // Print the TreeMap to observe the sorted order
        System.out.println(employeeMap);

        // Find and print the first key
        System.out.println("First Key: " + employeeMap.firstKey());

        // Find and print the last key
        System.out.println("Last Key: " + employeeMap.lastKey());
    }
}
